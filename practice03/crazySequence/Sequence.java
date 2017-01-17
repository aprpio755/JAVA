package crazySequence;

public class Sequence {
	
	public Sequence(){
		
	}
	void createSeq(int number){
		int[] sequence = new int[number];
		int count=0;
		int value=1;
		for(int i=0;i<number;i++){
			sequence[i] = value;
			count++;
			if(count==value){
				count=0;
				value++;
				System.out.println(sequence[i]);
			}else{
				System.out.print(sequence[i]);
			}			
		}
	}	
}
