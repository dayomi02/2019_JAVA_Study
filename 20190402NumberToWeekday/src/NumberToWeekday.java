import java.util.*;
public class NumberToWeekday {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("���ڸ� ���Ϸ� �ٲ�帳�ϴ�... ");
			System.out.print("���ڸ� �Է��ϼ���(1~7) = ");
			int user=sc.nextInt();
			
			String[]WeekDays = {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"};
			 System.out.println(WeekDays[user-1]);
			
			/*
			 * switch(user) {
			case 1:
				System.out.println("������");
				break;
			case 2:
				System.out.println("ȭ����");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("�����");
				break;
			case 5:
				System.out.println("�ݿ���");
				break;
			case 6:
				System.out.println("�����");
				break;
			case 7:
				System.out.println("�Ͽ���");
				break;
			}
			 */
		
	}
}
