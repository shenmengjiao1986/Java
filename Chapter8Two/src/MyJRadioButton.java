import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyJRadioButton extends JFrame implements ItemListener{
	private JLabel labelForTitle;
	private JRadioButton[] radioButtons;
	private JLabel labelForAnswer;
	private String[] data;
	private int answerIndex;
	private String title;
	MyJRadioButton(String title, String[] data, int answerIndex){
		super("JRadioButton实例");
		this.title = title;
		this.data = data;
		this.answerIndex = answerIndex;
		/*创建窗体*/
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(6,1));
		
		labelForTitle = new JLabel(title);
		contentPane.add(labelForTitle);
		ButtonGroup bg = new ButtonGroup();
		radioButtons = new JRadioButton[data.length];
		for(int i=0; i<data.length; i++){
			radioButtons[i] = new JRadioButton(data[i]);
			radioButtons[i].addItemListener(this);
			bg.add(radioButtons[i]);
			contentPane.add(radioButtons[i]);
		}
		labelForAnswer = new JLabel();
		contentPane.add(labelForAnswer);
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getStateChange() == e.SELECTED){
			for(int i=0; i<radioButtons.length; i++){
				if(radioButtons[i] == e.getSource()){
					if(i == answerIndex){
						labelForAnswer.setText("你的回答是正确的");
					}else {
						labelForAnswer.setText("你的回答是错误的");
					}
					break;
				}
			}
		}else {
			labelForAnswer.setText("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = {".txt", ".java",".class",".exe"};
		MyJRadioButton app = new MyJRadioButton("Java源程序文件的扩展名是()",data, 1);
		app.setSize(400, 300);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
