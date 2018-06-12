import javax.swing.*;
import java.awt.*;
public class MyTableModel extends JFrame {

	private final String[] tokens = {"0","1","2","3","4","5","6",
			                          "7","8","9","+","-","*","/",".","="};
	private JPanel panelAtCenter;
	private JTextField textFieldForResult;
	private JButton[] buttons;
	MyTableModel(){
		super("Calculate");
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
//		JPanel panelAtNorth = new JPanel(null);
//		panelAtNorth.setPreferredSize(new Dimension(280, 30));
		textFieldForResult = new JTextField();
//		textFieldForResult.setBounds(5, 5, 280 - 5*2, 20);
//		panelAtNorth.add(textFieldForResult);
		
//		textFieldForResult.setBackground(Color.red);
		JLabel labelAtWest = new JLabel(" ");
		JLabel labelAtEast = new JLabel(" ");
		panelAtCenter = new JPanel();
		panelAtCenter.setLayout(new GridLayout(4,4,10,5));
		
		buttons = new JButton[16];
		for(int i=0; i<buttons.length; i++){
			buttons[i] = new JButton(tokens[i]);
			panelAtCenter.add(buttons[i]);
		}
//		panelAtCenter.setBackground(Color.gray);
//		contentPane.add(panelAtNorth, BorderLayout.NORTH);
		contentPane.add(textFieldForResult, BorderLayout.NORTH);
		contentPane.add(labelAtWest, BorderLayout.WEST);
		contentPane.add(labelAtEast, BorderLayout.EAST);
		contentPane.add(panelAtCenter, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTableModel app = new MyTableModel();
		app.setSize(280, 200);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);

	}

}
