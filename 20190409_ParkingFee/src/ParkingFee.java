import java.util.*;

public class ParkingFee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fee;
		//���� �Է�
		System.out.print("��ġ �ð��� �Է��ϼ���(�� ������) : ");
		int time=sc.nextInt();
		
		if(0<=time&&time<=30) {
			fee=2000;
		} else {
			//30�� ���ϸ� 2000
			int �����ڸ� =time/10;
			int �����ڸ�=time%10;
			fee=(�����ڸ�-1)*1000;
			if(�����ڸ�>=1)
				fee+=1000;
		}
		
		System.out.println("��������� "+fee+"��");
		
	}
}
