package arrangeInsect;

import java.util.Random;

public class CabbagePatch {
	
	private int[][] patch;
	
	//배추밭 생성
	public CabbagePatch(int height, int width){
		patch = new int[height][width];
		setCabbage();
	}
	//배추 배치
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
	//배추의 존재유무 확인
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
