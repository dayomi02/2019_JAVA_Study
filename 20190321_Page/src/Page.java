import java.util.*;
public class Page {
	public static void main(String[] args) {
		
		//int page=7;
		//int result=331;
		//int aa=(result/page)+1;
		
		//if(result%page==0)
			//aa=result/page;
		
		//System.out.print(aa+" �������� �ʿ��մϴ�.");
		
		Scanner sc=new Scanner(System.in);
		int page=7;
		
		while(true) {
			System.out.print("�� ���� ���ù��� ǥ���ұ��?(������ �Է��ϼ���) : ");
			String InputS=sc.nextLine();
			if(InputS.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�...");
				break;
			}
			int result=Integer.parseInt(InputS); //String�� Integer�� ����
				int aa=(result/page);
				
				if(result%page==0)
					aa=result/page;
				System.out.println(aa+" �������� �ʿ��մϴ�.");
				
				
				
		}//while
		System.exit(0);
	}//main
}//class
