package �¼�;

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

	//ģʽ�����ڲ���ʵ���¼�����
	class A implements  ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("�����а�ť�����");
		}
	}
	MyJFrame(){
		super("�¼�Demo");
		this.setSize(640, 520);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(6,1));
		
		
		buttonAtFirst = new JButton("��һ��");
		buttonAtFirst.setBackground(Color.yellow);
		buttonAtFirst.addActionListener(this);
		buttonAtSecond = new JButton("�ڶ���");
		buttonAtSecond.addActionListener(this);
		
		buttonAtThird = new JButton("������");
		//ģʽ�ģ���������ʵ���¼�����
		buttonAtThird.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("�����а�ť�����");
			}
		});
		
		buttonAtFourth = new JButton("������");
		buttonAtFourth.addActionListener(new A());
		
		buttonAtFive = new JButton("������");
		buttonAtFive.addActionListener(new OutClass());
		
		textfieldAtSixth = new JTextField("������");
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
	//ģʽһ������ʵ���¼�����
	public void actionPerformed(ActionEvent e) {
		if(buttonAtFirst == (JButton)e.getSource()){
			System.out.println("��һ�а�ť�����");
		}else if(buttonAtSecond == (JButton)e.getSource()){
			System.out.println("�ڶ��а�ť�����");
		}
		System.out.println("��ť�����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJFrame app = new MyJFrame();
	}

}
