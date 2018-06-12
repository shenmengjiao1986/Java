import java.awt.*;
import javax.swing.*;
import java.awt.Event;
import javax.swing.event.*;
/*step1:导入相关类库*/
public class MyFirstJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step2:使用构造方法创建JFrame窗口
		JFrame app = new JFrame("标题");
		//step3:设置窗口大小、位置、标题、图标等属性
		app.setSize(200, 160);
		app.setLocation(20, 30);
		//step4:设置窗口关闭后的响应行为
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//step5:取得ContentPane对象，或者为JFrame窗体创建一个ContentPane对象
		Container contentPane = app.getContentPane();
		//step6:为ContentPane对象设置布局管理器及其他属性
		contentPane.setLayout(new GridLayout(2,1));//两行一列
		//step7:使用add()方法把组件加入到ContentPane对象中
		contentPane.add(new JLabel("这是一个能响应关闭窗体操作的程序"));
		contentPane.add(new JButton("这是一个Swing按钮"));
		//step8:创建后的窗口默认不可见，需要调用setVisible方法或show方法使其可见
		app.setVisible(true);
		
	}
}
