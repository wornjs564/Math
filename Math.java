import java.util.*;
public class Math {
	public static void main(String args[]) {
		Scanner c = new Scanner(System.in);
		System.out.println("ù ��° �� �Է�");
		int A = c.nextInt();
		System.out.println("�� ��°�� �Է�");
		int B = c.nextInt();
		int R = 1;
		int high = 0, low = 0;
		if (A > B) {
			high = A;
			low = B;
		} else{
			low = A;
			high = B;
		}
		while(R>0){
			R = high%low;
			high = low; 
			low = R;
			}
			if(R<=0){
			int l = (A * B) / high;
			System.out.println("�ִ� ����� : "+high);
			System.out.println("�ּҰ���� : "+l);
		}
	}
}
