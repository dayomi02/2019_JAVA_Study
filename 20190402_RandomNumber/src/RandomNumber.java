//������ ���ϱ� ����!
import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int start=17;
		int end=17;
		Random random=new Random();
		int com_num = random.nextInt(end-start+1)+start;
		//0~n start�� ����
		//start~n-1+start
		//n-1+start=end
		//n=end+1-start
		
		System.out.println(com_num);
		
	}
}
