package clockNumberFinder;

public class ClockNum {
	
	String number;
	String minNumber;
	
	public ClockNum(String number){
		this.number = number;
		this.minNumber = findMin(number);
	}
	
	public String findMin(String number){
		
		int[] numbertoken= new int[number.length()];
		String minNumber="";
		
		for(int i=0;i<number.length();i++){
			 numbertoken[i]= number.charAt(i)-'0';
			 //System.out.println(numbertoken[i]);
		}
		for(int i=0;i<numbertoken.length;i++){
			int tmp;
			for(int j=i+1;j<numbertoken.length;j++){
				if(numbertoken[i]>numbertoken[j]){
					tmp = numbertoken[i];
					numbertoken[i] = numbertoken[j];
					numbertoken[j] = tmp;
				}
			}
			minNumber += numbertoken[i];
		}
		return minNumber;
	}
}
