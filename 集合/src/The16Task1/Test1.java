package The16Task1;
import java.util.*;
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Student(1,20));
		al.add(new Student(2,30));
		al.add(new Student(3,18));
		al.add(new Student(4,40));
		al.add(new Student(5,16));
		int avg = 0;
		for(int i=0;i<al.size();i++){
			Student s = (Student)al.get(i);
			avg+=s.getAge();
		}
		avg/=al.size();
		System.out.println("这个班同学的平均年龄是"+avg);
	}

}
