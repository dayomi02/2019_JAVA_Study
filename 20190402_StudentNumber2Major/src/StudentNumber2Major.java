import java.util.*;
public class StudentNumber2Major {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�й��� �Է��ϸ� �а��� ����ϱ�");
		System.out.print("�й��� �Է��ϼ��� -> ");
		String stunum=sc.nextLine();
		String grade=stunum.substring(0,1);
		String classroom=stunum.substring(1,2);
		
		//int stunum=sc.nextInt();
		//int grade=stunum/1000;
		//int ban=(stunum-(grade*1000))/100;
		//String department[]= {"���̵�����Ʈ����","���̵��ַ�ǰ�","���̵������ΰ�"};
		
		//1�г�, 2�г�
		if(grade.equals("1")||grade.equals("2")) {
			if(classroom.equals("1")||classroom.equals("2"))
				System.out.println("���̵�����Ʈ�����");
			else if(classroom.equals("3")||classroom.equals("4"))
				System.out.println("���̵��ַ�ǰ�");
			else if(classroom.equals("5")||classroom.equals("6"))
				System.out.println("���̵������ΰ�");
			
		}
		//3�г�
		else if(grade.equals("3")) {
			if(classroom.equals("1")||classroom.equals("2"))
				System.out.println("���ͷ�Ƽ��̵���");
			else if(classroom.equals("3")||classroom.equals("4"))
				System.out.println("���̵������ΰ�");
			else if(classroom.equals("5")||classroom.equals("6"))
				System.out.println("���̵��ַ�ǰ�");
			
		}
	}
}
