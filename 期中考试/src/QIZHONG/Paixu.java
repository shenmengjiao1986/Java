package QIZHONG;

public class Paixu {
	private int [] a=new int [10];
	private int x=0;
	Paixu(int []a){
		this.a=a;
	}
	public int X(){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=a[i]+sum;
			x=sum/(i+1);
		}
		return x;
	}
	public void ss(){
		System.out.println("Æ½¾ùÊý="+X());
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
