package arrangeInsect;

import java.util.Random;

public class CabbagePatch {
	
	private int[][] patch;
	
	//���߹� ����
	public CabbagePatch(int height, int width){
		patch = new int[height][width];
		setCabbage();
	}
	//���� ��ġ
	void setCabbage(){
		Random r = new Random();
		for(int i=0; i<patch.length; i++){
			for(int j=0; j<patch[i].length; j++){
				patch[i][j] = r.nextInt(2);
				System.out.print(/*i+", "+ j + " :"+*/patch[i][j]+"|");
			}
			System.out.println();
		}
	}
	//������ �������� Ȯ��
	public int[][] getPatch(){
		return patch;
	}
	boolean isCabbage(int column, int row){
		if(patch[column][row] == 1){
			return true;
		}else{
			return false;
		}
	}
	
//	int count=0;
//	
//	void print(){
//		count++;
//		for(int i=0; i<patch.length; i++){
//			for(int j=0; j<patch[i].length; j++){
//				System.out.print(/*i+", "+ j + " :"+*/patch[i][j]+"|");
//			}
//			System.out.println();
//		}
//		System.out.println("------"+count+"--------");
//	}

}
