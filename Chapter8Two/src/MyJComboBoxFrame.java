import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyJComboBoxFrame extends JFrame implements ItemListener{
	private String[] provinces;
	private JComboBox comboBoxForProvinces;
	private JLabel labelForAnswer;
	MyJComboBoxFrame(String[] provinces){
		super("JComboBox实例");
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		labelForAnswer = new JLabel();
		labelForAnswer.setBounds(10, 10, 200, 20);
		this.provinces = provinces;
		comboBoxForProvinces = new JComboBox();
		comboBoxForProvinces.addItemListener(this);
		for(int i=0; i<this.provinces.length; i++){
			comboBoxForProvinces.addItem(this.provinces[i]);
		}
		comboBoxForProvinces.setBounds(10, 50, 200, 30);
		contentPane.add(labelForAnswer);
		contentPane.add(comboBoxForProvinces);
	}
	
	public void itemStateChanged(ItemEvent e){
		labelForAnswer.setText("你目前选择的省份或城市是:"+comboBoxForProvinces.getSelectedItem().toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] provinces = {"北京市","上海市","山东省","广东省","浙江省"};
		MyJComboBoxFrame app = new MyJComboBoxFrame(provinces);
		app.setSize(300, 300);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
