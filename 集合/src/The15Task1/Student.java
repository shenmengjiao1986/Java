package The15Task1;

public class Student {
	private int no;
	private String name;
	private int age;
	Student(int no,String name){
		this.no = no;
		this.name = name;
	}
	Student(int no,String name,int age){
		this.no = no;
		this.name = name;
		this.age = age;
	}
	public void displayInfo(){
		System.out.println("这个学生的学号是"+no+",姓名是"+name);
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
