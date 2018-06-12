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
//			System.out.println(number+"是3和11的公倍数。");
//		}else{
//			System.out.println(number+"不是3和11的公倍数。");
//		}
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int rank = number/10;
		switch(rank)
		{
		case 10:
		case 9:
			System.out.println(number+"分等级是优秀");
			break;
		case 8:
			System.out.println(number+"分等级是良好");
			break;
		case 7:
			System.out.println(number+"分等级是中等");
			break;
		case 6:
			System.out.println(number+"分等级是及格");
			break;
		default:
			System.out.println(number+"分等级是不及格");
			break;
		}
		

	}

}
