import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame; 
import java.awt.*;
import javax.swing.*;
import NVUtils.ColorUtils;

public class MyJLabel {

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
		
		
		ImageIcon icon = new ImageIcon("images/LoginIcon.png");
		JLabel label = new JLabel("用户名");
		label.setIcon(icon);
		label.setToolTipText("至少8位，仅能包含数字和英文单词");
		label.setForeground(ColorUtils.getOrangeColr());
		
		ImageIcon pIcon = new ImageIcon("images/password.png");
		JLabel pLabel = new JLabel("用户名",pIcon,SwingConstants.LEFT);
		pLabel.setToolTipText("至少8位，仅能包含数字和英文单词");
		
		contentPane.add(label);
		contentPane.add(pLabel);
		app.setVisible(true);
	}
}
