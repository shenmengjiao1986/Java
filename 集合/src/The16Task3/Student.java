package The16Task3;

public class Student {
	//��ݼ��������� Alt+Shift+s ���ٵ�h
	private int no;
	private String cid;
	private String name;
	Student(int no,String cid,String name){
		this.no = no;
		this.cid = cid;
		this.name = name;
	}
	public void displayInfo(){
		System.out.println("���ѧ����ѧ����:"+no+"���֤����:"+cid+",������:"+name);
	}
	//��hashCodeֵ��ͬ��������Ϊ��ͬһ��Ԫ�أ�Ȼ����ȥ����equals�Ƚϣ�ȷ���ǲ���ͬһ��Ԫ��
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
