package The17Task1;
import java.util.*;
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet al = new TreeSet();
		int[] s1 = {1,2,3,4};
		int[] s2 = {1,2,3,6};
		int[] s3 = {1,2,3,10};
		int[] s4 = {1,2,3,2};
		int[] s5 = {1,2,3,12};
		al.add(new Student(1,"330424198607030026","a",s1));
		al.add(new Student(2,"330424198607030027","b",s2));
		al.add(new Student(5,"330424198607030030","e",s3));
		al.add(new Student(3,"330424198607030028","c",s4));
		al.add(new Student(4,"330424198607030029","d",s5));
		Iterator iter = al.iterator();
		while(iter.hasNext()){
			Student s = (Student) iter.next();
			s.displayInfo();
		}
	}

}
