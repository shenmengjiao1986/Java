package QIZHONG;

import javax.xml.ws.handler.MessageContext.Scope;

public class Student {
	private int no;
	private String name;
	private Course []course;
	private float sum=0;
	public Student(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	public Student(int no,String name,Course[] course)
	{
		this.no=no;
		this.name=name;
		this.course=course;
		for(Course co:course)
		{
			
			sum+=co.getScore();
		}
		
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
	public Course[] getCourse() {
		return course;
	}
	public void setCourse(Course[] course) {
		this.course = course;
	}
	public float getsum()
	{
		return sum;
	}
	public void showinfo()
	{
		System.out.println("学号："+no+" "+"姓名："+" "+name );
		for(Course c:course)
		{
			System.out.println(c.getName()+"分数"+":"+c.getScore());
		}
		System.out.println("总成绩："+sum);
		
	}
	
}

