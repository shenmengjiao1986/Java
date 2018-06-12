import java.util.*;
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number = s.nextInt();
		if(number%3==0&&number%11==0)
			System.out.println(number+"是3和11的公倍数");
		else 
			System.out.println(number+"不是3和11的公倍数");
	}

}
