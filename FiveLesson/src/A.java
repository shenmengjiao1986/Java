import java.util.*;
public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("������༶ͬѧ��������");
//		Scanner s = new Scanner(System.in);
//		int number = s.nextInt();
//		int[] scores = new int[number];
//		for(int i=0 ;i<number;i++){
//			System.out.println("�������"+i+"λͬѧ�ĳɼ���");
//			int score = s.nextInt();
//			scores[i] = score;
//		}
//		
//		System.out.println("�������ȫ��ͬѧ�ĳɼ�");
//		for(int i=0 ;i<number;i++){
//			if(i!=number-1){
//				System.out.print(scores[i]+",");
//			}else{
//				System.out.print(scores[i]);
//			}
//		}
		int x, y;
		 
        for (x = 0; x <= 9; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + x * y + "\t");
            }
            System.out.println();
        }
	}

}
