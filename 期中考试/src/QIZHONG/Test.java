package QIZHONG;

import java.util.TreeSet;
import java.applet.Applet;
import java.util.Iterator;
public class Test {
	
	public static void sort(Student s[])
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].getsum()<s[j].getsum())
				{
					Student temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(Student a:s)
		{
			a.showinfo();
		}
	}
	
	public static void main(String[] args) {
		Course []a={new Course(1, "语文", 118),
				    new Course(2, "数学", 145),
				    new Course(3, "英语",144.5f)};
		Course []b={new Course(1, "语文", 130),
			    new Course(2, "数学", 110.5f),
			    new Course(3, "英语",100)};
		Course []c={new Course(1, "语文", 142.5f),
			    new Course(2, "数学", 120),
			    new Course(3, "英语",87.5f)};
		Student []stu={
				new Student(1, "张三",a),
				new Student(2, "李四",b),
				new Student(3, "王五",c)
				
		};
		for(Student s:stu)
		{
			System.out.println("排序前");
			s.showinfo();
			
		}

		System.out.println("排序后");

		sort(stu);

	}

}
