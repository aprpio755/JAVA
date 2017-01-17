package primeNumberGame;

public class Person {
	
	int personNumber;
	int count=0;
	
	public Person(int personNumber){
		this.personNumber = personNumber;
	}
	public void addCount(){
		count += 1;
	}
}
