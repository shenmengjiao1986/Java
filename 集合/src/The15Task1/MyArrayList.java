package The15Task1;
import java.util.*;


public class MyArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������//����ɾ���ġ���	//����
		//�������� ���� ������ = new ���캯��();
		ArrayList al = new ArrayList();//�������϶���!!!!!!
//		Collection al1 = new ArrayList();//��ת��
//		List al2 = new ArrayList();
		Random rand = new Random();//�����
		for(int i=0;i<5;i++)
			al.add(rand.nextInt(100));//����Ԫ��!!!!!!!!!
		for(int i=0;i<al.size();i++)//����Ԫ�ط���1//size��get����������������������������
			System.out.println(al.get(i));
		Iterator iter = al.iterator();//����Ԫ�ط���2//iterator!!!!!!!!!!!!
		while(iter.hasNext()){//hasNext��next,remove!!!!!!!!!!!!!!
			int element = (Integer) iter.next();
			if(element%2==1){
				iter.remove();//ɾ��Ԫ��
			}
		}
		System.out.println("##########################");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("##########################");
		//��-�޸ĵ�һ��Ԫ�ص�ֵΪ100
		al.set(0, 100);//set!!!!!!!!!!!!
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		//��-����Ԫ��100
		int index = al.indexOf(100);//indexOf!!!!!!!!!!!!
		System.out.println("100������ĵ�"+index+"��λ��");
		System.out.println("##########################");	
		
		
		
////		����1. ���ѡ�����ǰ�5��ѧ��������Student����ŵ�ArrayList�С�����2������ѧ����3��˫��ѧ��
//		//���� ������ = new ���캯��();
//		ArrayList al2 = new ArrayList();
//		al2.add(new Student(3,"a"));//Collection�ӿ������ĳ��󷽷�����ArrayList��ʵ����
//		al2.add(new Student(6,"b"));
//		al2.add(new Student(10,"c"));
//		al2.add(new Student(1,"d"));
//		al2.add(new Student(4,"e"));
//		//����2. ���������5��ͬѧ�Ļ�����Ϣ
//		for(int i=0;i<al2.size();i++)//size����
//		{
//			Student s = (Student)al2.get(i);//get����
//			s.displayInfo();
//		}
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
//		//����3. ɾ��ѧ��Ϊ���ŵ�ѧ����Ϣ���������ArrayListʣ�µ�ѧ������Ϣ
//		Iterator iter2 = al2.iterator();
//		while(iter2.hasNext()){
//			Student s = (Student)iter2.next();
//			if(s.getNo()%2==1)
//				iter2.remove();
//		}
//		for(int i=0;i<al2.size();i++)
//		{
//			Student s = (Student)al2.get(i);
//			s.displayInfo();
//		}
//		//����4. ��ArrayList�еĵ�2��ѧ��Ԫ�أ��޸�Ϊ���ǰ�İ೤
//		Student banzhang = new Student(30,"�೤");//��������������������banzhang����˵��
//		al2.set(1, banzhang);
//		//����5. ���Ұ೤����ArrayList�е�λ�ã������
//		int index2 = al2.indexOf(banzhang);
//		System.out.println(index2);
//		
//		
//		
//		
//		
//		
//		
//		
//		ArrayList al3 = new ArrayList();//��δ�������
//		al3.add(new Student(3,"a",16));//�򼯺������Ԫ��
//		al3.add(new Student(6,"b",17));
//		al3.add(new Student(10,"c",18));
//		al3.add(new Student(1,"d",19));
//		al3.add(new Student(4,"e",20));
//		Iterator iter3 = al3.iterator();//��õ�����
//		int age = 0;
//		while(iter3.hasNext()){//����������Ҫ����
//			Student s = (Student)iter3.next();
//			age += s.getAge();
//		}
//		System.out.println("�����ѧ����ƽ��������"+age/al3.size());
//		
//		
//		
//		
		
		
		
		
		
		
	
	}
}
