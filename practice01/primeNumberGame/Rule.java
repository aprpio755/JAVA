package primeNumberGame;

public class Rule {
	
	int studentNumber;
	int lastNumber;
	Person[] person;
	
	public Rule(){}
	public void startGame(int studentNumber, int lastNumber){
		this.studentNumber = studentNumber;
		person = new Person[studentNumber];
		for(int i=0;i<studentNumber;i++){
			person[i]=new Person(i+1);	
		}//切积硅凯 积己
		//System.out.println("老-1");
		for(int i=1;i<=lastNumber;i++){
			int j = 2;
			int tmp = 0;
			while(tmp<2){
				//System.out.println("老-2"+"j, i="+j+","+i+ "i%j="+i%j);
				if(i<j){
					break;
				}else if((i%j)==0){
					tmp+=1;
					if(i==j){
						if(tmp==1){
							person[(i-1)%studentNumber].addCount();
							//System.out.println(i +"<-i, j->" + j);
							//System.out.println(person[(i-1)%studentNumber].personNumber+" "+i);
							break;
						}else{
							continue;
						}
					}else{
						j++;
						continue;
					}
				}else{
					j++;
					continue;
				}
			}
		}
	}
	
	public void getPersonNumber(int wantNumber){
		int i=0;
		//System.out.println(studentNumber);
		while(true){
			if(i>studentNumber){
				System.out.println("invalid number");
				break;
			}else if(person[i].personNumber == wantNumber){
				System.out.println("Student " + person[i].personNumber + "\'s count is " + person[i].count);
				break;
			}else{
				i++;
			}
		}
	}
}
