package The15Task1;
import java.util.*;


public class MyArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象//增、删、改、查	//遍历
		//创建对象 类名 对象名 = new 构造函数();
		ArrayList al = new ArrayList();//创建集合对象!!!!!!
//		Collection al1 = new ArrayList();//上转型
//		List al2 = new ArrayList();
		Random rand = new Random();//随机数
		for(int i=0;i<5;i++)
			al.add(rand.nextInt(100));//增加元素!!!!!!!!!
		for(int i=0;i<al.size();i++)//遍历元素方法1//size和get方法！！！！！！！！！！！！
			System.out.println(al.get(i));
		Iterator iter = al.iterator();//遍历元素方法2//iterator!!!!!!!!!!!!
		while(iter.hasNext()){//hasNext，next,remove!!!!!!!!!!!!!!
			int element = (Integer) iter.next();
			if(element%2==1){
				iter.remove();//删除元素
			}
		}
		System.out.println("##########################");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("##########################");
		//改-修改第一个元素的值为100
		al.set(0, 100);//set!!!!!!!!!!!!
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		//查-查找元素100
		int index = al.indexOf(100);//indexOf!!!!!!!!!!!!
		System.out.println("100在数组的第"+index+"个位置");
		System.out.println("##########################");	
		
		
		
////		步骤1. 随便选择我们班5个学生，创建Student对象放到ArrayList中。其中2个单号学生、3个双号学生
//		//类名 对象名 = new 构造函数();
//		ArrayList al2 = new ArrayList();
//		al2.add(new Student(3,"a"));//Collection接口声明的抽象方法，被ArrayList类实现了
//		al2.add(new Student(6,"b"));
//		al2.add(new Student(10,"c"));
//		al2.add(new Student(1,"d"));
//		al2.add(new Student(4,"e"));
//		//步骤2. 遍历输出这5个同学的基本信息
//		for(int i=0;i<al2.size();i++)//size方法
//		{
//			Student s = (Student)al2.get(i);//get方法
//			s.displayInfo();
//		}
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
//		//步骤3. 删除学号为单号的学生信息，遍历输出ArrayList剩下的学生的信息
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
//		//步骤4. 将ArrayList中的第2个学生元素，修改为我们班的班长
//		Student banzhang = new Student(30,"班长");//！！！！！！！！！！banzhang对象说明
//		al2.set(1, banzhang);
//		//步骤5. 查找班长所在ArrayList中的位置，并输出
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
//		ArrayList al3 = new ArrayList();//如何创建集合
//		al3.add(new Student(3,"a",16));//向集合中添加元素
//		al3.add(new Student(6,"b",17));
//		al3.add(new Student(10,"c",18));
//		al3.add(new Student(1,"d",19));
//		al3.add(new Student(4,"e",20));
//		Iterator iter3 = al3.iterator();//获得迭代器
//		int age = 0;
//		while(iter3.hasNext()){//迭代器的主要方法
//			Student s = (Student)iter3.next();
//			age += s.getAge();
//		}
//		System.out.println("这个班学生的平均年龄是"+age/al3.size());
//		
//		
//		
//		
		
		
		
		
		
		
	
	}
}
