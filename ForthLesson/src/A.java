import java.util.Scanner;


public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		int number = s.nextInt();
//		if(number%3==0 && number%11==0){
//			System.out.println(number+"��3��11�Ĺ�������");
//		}else{
//			System.out.println(number+"����3��11�Ĺ�������");
//		}
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int rank = number/10;
		switch(rank)
		{
		case 10:
		case 9:
			System.out.println(number+"�ֵȼ�������");
			break;
		case 8:
			System.out.println(number+"�ֵȼ�������");
			break;
		case 7:
			System.out.println(number+"�ֵȼ����е�");
			break;
		case 6:
			System.out.println(number+"�ֵȼ��Ǽ���");
			break;
		default:
			System.out.println(number+"�ֵȼ��ǲ�����");
			break;
		}
		

	}

}
