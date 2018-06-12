package The16Task3;

public class Student {
	//快捷键在类上面 Alt+Shift+s ，再点h
	private int no;
	private String cid;
	private String name;
	Student(int no,String cid,String name){
		this.no = no;
		this.cid = cid;
		this.name = name;
	}
	public void displayInfo(){
		System.out.println("这个学生的学号是:"+no+"身份证号是:"+cid+",姓名是:"+name);
	}
	//当hashCode值相同，疑似认为是同一个元素，然后再去根据equals比较，确定是不是同一个元素
//	public int hashCode(){
//		return no+cid.hashCode();
//	}
//	public boolean equals(Object obj){
//		if(obj instanceof Student){
//			Student s = (Student)obj;
//			if(no == s.no && cid.equals(s.cid))
//				return true;
//			else return false;
//		}
//		return false;
//	}
}
