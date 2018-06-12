package 事件;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class MyJFrame extends JFrame implements ActionListener{
	private JButton buttonAtFirst;
	private JButton buttonAtSecond;
	private JButton buttonAtThird;
	private JButton buttonAtFourth;
	private JButton buttonAtFive;
	private JTextField textfieldAtSixth;

	//模式三：内部类实现事件处理
	class A implements  ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("第四行按钮被点击");
		}
	}
	MyJFrame(){
		super("事件Demo");
		this.setSize(640, 520);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(6,1));
		
		
		buttonAtFirst = new JButton("第一行");
		buttonAtFirst.setBackground(Color.yellow);
		buttonAtFirst.addActionListener(this);
		buttonAtSecond = new JButton("第二行");
		buttonAtSecond.addActionListener(this);
		
		buttonAtThird = new JButton("第三行");
		//模式四：由匿名类实现事件处理
		buttonAtThird.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("第三行按钮被点击");
			}
		});
		
		buttonAtFourth = new JButton("第四行");
		buttonAtFourth.addActionListener(new A());
		
		buttonAtFive = new JButton("第五行");
		buttonAtFive.addActionListener(new OutClass());
		
		textfieldAtSixth = new JTextField("第六行");
		textfieldAtSixth.addKeyListener(new KeyListener(){
			@Override
			public void keyPressed(KeyEvent e){
				 char ch=e.getKeyChar();
				 System.out.println(ch);
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		contentPane.add(buttonAtFirst);
		contentPane.add(buttonAtSecond);
		contentPane.add(buttonAtThird);
		contentPane.add(buttonAtFourth);
		contentPane.add(buttonAtFive);
		contentPane.add(textfieldAtSixth);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		}
	//模式一：主类实现事件处理
	public void actionPerformed(ActionEvent e) {
		if(buttonAtFirst == (JButton)e.getSource()){
			System.out.println("第一行按钮被点击");
		}else if(buttonAtSecond == (JButton)e.getSource()){
			System.out.println("第二行按钮被点击");
		}
		System.out.println("按钮被点击");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJFrame app = new MyJFrame();
	}

}
