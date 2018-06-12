package The17Task2;
import java.util.*;
public class Test {
	public static void main(String[] args){
		TreeMap<Score, Student> tm = new TreeMap(new Comparator<Score>(){
            public int compare(Score o1,Score o2){
                return  o2.getTotalScore()-o1.getTotalScore(); //用正负表示大小值
            }
        });
		tm.put(new Score(100,100,100,100),new Student("330424198607030026","a"));
		tm.put(new Score(100,100,50,50),new Student("330424198607030027","b"));
		tm.put(new Score(100,70,100,100),new Student("330424198607030028","c"));
		tm.put(new Score(100,80,100,100),new Student("330424198607030029","d"));
		Iterator iter = tm.values().iterator();
		while(iter.hasNext()){
			Student s = (Student) iter.next();
			s.displayInfo();
		}
	}
}
