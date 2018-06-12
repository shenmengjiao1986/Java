import java.util.*;
public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int rank = number/10;
		switch(rank){
		case 10:
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("中等");
			break;
		case 6:
			System.out.println("及格");
			break;
		default:
			System.out.println("不及格");
			break;
		}
	}
}
