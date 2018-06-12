package QIZHONG;

public class Course {
	private int no;
	private String name;
	private float score;
	public Course(int no,String name,float score)
	{
		this.no=no;
		this.name=name;
		this.score=score;
		
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
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public void showinfo()
	{
		System.out.println("¿Î³Ì±àºÅ£º"+no+"Ãû×Ö£º"+name+"³É¼¨£º"+score);
		
	}
	
}

