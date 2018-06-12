import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;


public class ModifiedJComboBoxButtonFrame extends JFrame {
	private JComboBox comboBoxForProvinces;
	ModifiedJComboBoxButtonFrame(){
		comboBoxForProvinces = new JComboBox();
		comboBoxForProvinces.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
