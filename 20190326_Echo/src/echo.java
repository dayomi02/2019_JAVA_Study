//�Է��� ��� ���
import java.util.*;
public class echo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("����� ������ �Է��ϼ���(�����Ϸ��� stop) : ");
		
		while(true) {
			String st=sc.nextLine();
			
			if (st.equals("stop")) {
				System.out.println("���α׷��� �����մϴ�...");
				break;
			}
			System.out.println(st);
		}
	}
}
