import java.util.*;
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ȫ��ͬѧ��������");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int[] scores = new int[number];
		for(int i=0;i<scores.length;i++)
		{
			System.out.println("�������"+i+"λͬѧ�ĳɼ���");
			int n=s.nextInt();
			scores[i] = n;
		}
		
		for(int i=0;i<scores.length;i++){
			System.out.println(scores[i]);
		}

		if(true){
			//ִ�����
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
//		//charһ���ַ�,String�ַ��� ���Դ����ַ�
//		switch(rank)
//		{
//		case 10:
//		case 9:
//			System.out.println("��");
//			break;
//		case 8:
//			System.out.println("��");
//			break;
//		case 7:
//			System.out.println("��");
//			break;
//		case 6:
//			System.out.println("����");
//			break;
//		default:
//			System.out.println("������");
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
