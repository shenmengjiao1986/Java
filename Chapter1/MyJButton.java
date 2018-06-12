import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class MyJButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		JButton button = new JButton("按钮");
		button.setBackground(Color.green);
		//button.setForeground(Color.red);
		//button.setBackground(Color.blue);
		JButton button2 = new JButton(new ImageIcon("images/loginPersonIcon.jpg"));
		contentPane.add(button);
		contentPane.add(button2);
		app.setVisible(true);
	}
}
