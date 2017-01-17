package minimumSpanningTree;

import java.util.Random;

public class Tree {
	int nodeNum;
	int[][] tree;
	Node[] nodes;

	//create tree
	public Tree(int number){
		nodeNum = number;
		nodes = new Node[number];
		for(int i=0;i<nodeNum;i++){
			nodes[i]=new Node(i);
		}
		Random ran = new Random();
		tree = new int[number][number];

		for(int i=0;i<tree.length;i++){
			for(int j=0;j<=i;j++){
				
				if(i==j){
					tree[i][j] = 0;
				}else{
					tree[i][j] = ran.nextInt(10)+1;
					tree[j][i] = tree[i][j];
				}
				 
				System.out.print(tree[i][j]+"\t");
			}
			System.out.println();
		}

	}
	//min weight of tree weights
	int[] getMinDistance(int[][] tree){
		int min =11;
		int row=0, column=0;
		for(int i=0; i<tree.length; i++){
			for(int j=0; j<i;j++){
				if(tree[i][j]==0){
					continue;
				}else if(min>tree[i][j]){
					min = tree[i][j];
					if(i>j){
						row = j;
						column = i;
					}else{
						row = i;
						column = j;
					}
				}
			}
		}
		int[] RowColumn = new int[]{row, column};
		return RowColumn;
	}
	int getWeight(int[][] tree){
		int[] distance = new int[tree.length*(tree.length-1)];
		int sum=0;
		int[][] tmptree = tree.clone();
		int i=0;
		//get minimum spanning tree weight
		while(i<nodeNum-1){
			int[] RowColumn = getMinDistance(tmptree);
			if(nodes[RowColumn[1]].hasParent()){
				if(nodes[RowColumn[1]].parentNode.compareNode(nodes[RowColumn[0]])){
					System.out.println("싸이클내부 행,렬 : "+RowColumn[0]+","+RowColumn[1]+" "+i+"번째  weight : "+distance[i]+"|");
					tmptree[RowColumn[0]][RowColumn[1]] = 11;
					tmptree[RowColumn[1]][RowColumn[0]] = 11;
					continue;
				}
			}
			nodes[RowColumn[1]].setParent(nodes[RowColumn[0]]);
			nodes[RowColumn[0]].setChild(nodes[RowColumn[1]]);	
			
			distance[i]=tmptree[RowColumn[0]][RowColumn[1]];
			sum+=distance[i];
			tmptree[RowColumn[0]][RowColumn[1]] = 11;
			tmptree[RowColumn[1]][RowColumn[0]] = 11;
			System.out.println("행,렬 : "+RowColumn[0]+","+RowColumn[1]+" weight : "+distance[i]+"|");
			i++;
		}
		System.out.println("최소신장트리값 : "+sum);
		return sum;
	}
}
