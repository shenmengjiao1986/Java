import java.awt.*;
import javax.swing.*;
public class MyFirstJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame app = new JFrame("标题");
		app.setSize(200, 160);
		app.setLocation(20, 30);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = app.getContentPane();
		contentPane.setLayout(new GridLayout(2,1));//两行一列
		contentPane.add(new JLabel("这是一个能响应关闭窗体操作的程序"));
		contentPane.add(new JButton("这是一个Swing按钮"));
		app.setVisible(true);
	}
}
