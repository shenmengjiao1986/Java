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
		Course []a={new Course(1, "����", 118),
				    new Course(2, "��ѧ", 145),
				    new Course(3, "Ӣ��",144.5f)};
		Course []b={new Course(1, "����", 130),
			    new Course(2, "��ѧ", 110.5f),
			    new Course(3, "Ӣ��",100)};
		Course []c={new Course(1, "����", 142.5f),
			    new Course(2, "��ѧ", 120),
			    new Course(3, "Ӣ��",87.5f)};
		Student []stu={
				new Student(1, "����",a),
				new Student(2, "����",b),
				new Student(3, "����",c)
				
		};
		for(Student s:stu)
		{
			System.out.println("����ǰ");
			s.showinfo();
			
		}

		System.out.println("�����");

		sort(stu);

	}

}
