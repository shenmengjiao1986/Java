package The17Task1;

import java.util.ArrayList;

public class Student implements Comparable{
	private int no;
	private String cid;
	private String name;
	private int[] scores;
	private int totalScore;//�ܳɼ�
	Student(int no,String cid,String name){
		this.no = no;
		this.cid = cid;
		this.name = name;
	}
	Student(int no,String cid, String name, int[] scores){
		this.no = no;
		this.cid = cid;
		this.name = name;
		this.scores = scores;
		for(int i=0;i<this.scores.length;i++){
			this.totalScore +=this.scores[i];
		}
	}
	public void displayInfo(){
		System.out.println("���ѧ����ѧ����:"+no+"���֤����:"+cid+",������:"+name+"�ܳɼ���:"+totalScore);
	}
	public int hashCode(){
		return no+cid.hashCode();
	}
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student s = (Student)obj;
			if(no == s.no && cid.equals(s.cid))
				return true;
			else return false;
		}
		return super.equals(obj);
	}
	public int compareTo(Object o)
    {
		Student s = (Student)o;
        return s.totalScore - totalScore;
    }
}
