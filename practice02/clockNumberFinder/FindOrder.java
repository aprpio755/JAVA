package clockNumberFinder;

import java.lang.*;

public class FindOrder {
	public FindOrder(String number){
		ClockNum cn = new ClockNum(number);
		int count=1;
		for(int i=1111;i<Integer.parseInt(cn.minNumber);i++){
			ClockNum cn2 = new ClockNum(String.valueOf(i));
			if(String.valueOf(i).contains("0")){//�ð���� 0�� �� �� ����
				continue;
			}else if(!(String.valueOf(i).equals(cn2.minNumber))){//�ѹ��̶� ���������� �ٸ����̹Ƿ� �н�
				//System.out.println("�ٸ� : "+i);
				continue;
			}else{
				//System.out.println(i);
				count++;
			}
		}
		System.out.println(count+"��° ��");
	}	
}
