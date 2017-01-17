package clockNumberFinder;

import java.lang.*;

public class FindOrder {
	public FindOrder(String number){
		ClockNum cn = new ClockNum(number);
		int count=1;
		for(int i=1111;i<Integer.parseInt(cn.minNumber);i++){
			ClockNum cn2 = new ClockNum(String.valueOf(i));
			if(String.valueOf(i).contains("0")){//시계수에 0은 들어갈 수 없음
				continue;
			}else if(!(String.valueOf(i).equals(cn2.minNumber))){//한번이라도 수행했으면 다른수이므로 패스
				//System.out.println("다름 : "+i);
				continue;
			}else{
				//System.out.println(i);
				count++;
			}
		}
		System.out.println(count+"번째 수");
	}	
}
