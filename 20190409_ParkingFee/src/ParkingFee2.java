import java.util.*;
//30�� �̻� 1500, 10�д� 1000�� �߰�
public class ParkingFee2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fee=1500;
		//���� �Է�
		
		while(true) {
			System.out.print("��ġ �ð��� �Է��ϼ���(�� ������) : ");
			int time=sc.nextInt();
			
			if(time<=30) 
				System.out.println("��������� "+fee+"�� �Դϴ�.");
			else if(time==0) {
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			}
			//26000�� �̻�
			else if(time>=230) { 
				System.out.println("�̿�ð� �ʰ� �� �� ��");
			}
			else {
				int a=time/10;
				fee+=(a-3)*1000;
				
				if((a*10)>0)
					fee+=1000;
				
				System.out.println("��������� "+fee+"�� �Դϴ�.");
				fee=1500;
			}
		}//while
	}
}
