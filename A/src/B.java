import java.util.*;
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入全班同学的人数？");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int[] scores = new int[number];
		for(int i=0;i<scores.length;i++)
		{
			System.out.println("请输入第"+i+"位同学的成绩？");
			int n=s.nextInt();
			scores[i] = n;
		}
		
		for(int i=0;i<scores.length;i++){
			System.out.println(scores[i]);
		}

		if(true){
			//执行语句
		}else {
			
		}
		
		if(false){
			
		}else if(false){
			
		}else {
			
		}
		
		if(true){
			if(true){
				
			}else{
				
			}
		}
		
		if(true&&true){
			
		}
		
		if(true||true){
			
		}
		
//		Scanner s = new Scanner(System.in);
//		int number = s.nextInt();
//		int rank = number/10;
//		//char一个字符,String字符串 可以存多个字符
//		switch(rank)
//		{
//		case 10:
//		case 9:
//			System.out.println("优");
//			break;
//		case 8:
//			System.out.println("良");
//			break;
//		case 7:
//			System.out.println("中");
//			break;
//		case 6:
//			System.out.println("及格");
//			break;
//		default:
//			System.out.println("不及格");
//		}
//		
//		for(int i=0;i<10;i++){
//			if(i==5)
//				break;
//			System.out.println("a");
////		}
//		int[] a = {1,2,3};
//		for(int i =0; i<a.length; i++)
//		{
//			System.out.print(a[i]);
//		}
		int[] xxx = new int[3];
		for(int i=0; i<xxx.length;i++)
			System.out.println(xxx[i]);
//		
//		int[][] b = new int[2][3];
//		
//		int[][] c = {{1,2,3},{4,5,6}};
//		for(int i=0;i<c.length;i++)
//			for(int j=0;j<c[i].length;j++)
//				System.out.println(c[i][j]);
//		c[1][1] = 10;
//		for(int i=0;i<c.length;i++)
//			for(int j=0;j<c[i].length;j++)
//				System.out.println(c[i][j]);
	}

}
