package The16Task3;
import java.util.*;
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet al = new HashSet();//创建一个HashSet类型的对象
		al.add(new Student(1,"330424198607030026","a"));
		al.add(new Student(2,"330424198607030027","b"));
		al.add(new Student(3,"330424198607030028","c"));
		al.add(new Student(4,"330424198607030029","d"));
		al.add(new Student(5,"330424198607030030","e"));
		al.add(new Student(5,"330424198607030030","e"));
		Iterator iter = al.iterator();
		while(iter.hasNext()){
			Student s = (Student) iter.next();
			s.displayInfo();
		}
	}

}
