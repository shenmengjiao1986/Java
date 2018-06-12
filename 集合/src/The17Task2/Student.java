package The17Task2;



public class Student{
	private String cid;
	private String name;
	Student(String cid,String name){
		this.cid = cid;
		this.name = name;
	}
	public void displayInfo(){
		System.out.println("学生的身份证号是:"+cid+",姓名是:"+name);
	}
}
