package arrangeInsect;

public class ArrangeInsect {
	
	int insect=0;
	CabbagePatch patch;

	public ArrangeInsect(CabbagePatch patch){
		this.patch = patch;
		startArrange();
	}
	
	public void startArrange(){
		for(int i=0; i<patch.getPatch().length;i++){
			for(int j=0; j<patch.getPatch()[i].length;j++){
				if(patch.isCabbage(i, j)){
					insect++;
					//System.out.println(patch.getPatch()[i][j]);
					findChunk(i, j);
				}
			}
		}
		System.out.println(insect+"마리");
	}
	
	public void findChunk(int column, int row){
		patch.getPatch()[column][row]=0;
		if(column!=0&&patch.getPatch()[column-1][row]==1){
//			System.out.println("위");
//			patch.print();
			patch.getPatch()[column-1][row]=0;
			findChunk(column-1,row);
		}if(row!=0&&patch.getPatch()[column][row-1]==1){
//			System.out.println("왼");
//			patch.print();
			patch.getPatch()[column][row-1]=0;
			findChunk(column, row-1);
		}if(column!=(patch.getPatch().length-1)&&patch.getPatch()[column+1][row]==1){
//			System.out.println("아래");
//			patch.print();
			patch.getPatch()[column+1][row]=0;
			findChunk(column+1, row);
		}if(row!=(patch.getPatch()[column].length-1)&&patch.getPatch()[column][row+1]==1){
//			System.out.println("오른");
//			patch.print();
			patch.getPatch()[column][row+1]=0;
			findChunk(column, row+1);
		}
	}
}
