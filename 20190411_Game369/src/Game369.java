//1~99���� ���ڿ� 3,6,9�� ������ ¦�� �ƴϸ� ���ڸ� ����Ѵ�.
public class Game369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<GAME369>>");
		
		for(int i=1;i<=99;i++) {
			String numberString=String.valueOf(i);
			int count=count369(numberString);
	
			if(count==0)
				System.out.println(i);
			else {
				for(int j=1;j<=count;j++)
					System.out.print("¦");
				System.out.println();
			}
			
		}
	}//main

	private static int count369(String numberString) {
		
		int sum=0;
		for(int i=0;i<numberString.length();i++){
			char ch0=numberString.charAt(i);
			if(ch0=='3'||ch0=='6'||ch0=='9')
				sum++;
		}
		return sum;
	}

}//class
