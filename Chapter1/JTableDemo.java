import java.awt.*;
import javax.swing.*;
public class JTableDemo extends JFrame {

	private static final int fwidth = 400;
	private static final int fheight = 400;
	private static final int northH = 100;
	private JPanel north;
	private JPanel south;
	private JLabel labelForTitle;
	JTableDemo(){
		super("表格");
		this.setSize(fwidth,fheight);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.makeupNorth();
		this.setVisible(true);
	}
	
	public void makeupNorth(){
		this.north = new JPanel();
		this.north.setPreferredSize(new Dimension(fwidth, northH));
		//this.north.setBackground(Color.green);
		this.north.setLayout(null);
		this.labelForTitle = new JLabel("xxx表格",JLabel.CENTER);
		this.labelForTitle.setBounds((fwidth-200)/2, 20, 200, 40);
		this.north.add(this.labelForTitle);
		this.add(this.north, BorderLayout.NORTH);
	}
	
	public void makeupSouth(){
		this.south = new JPanel();
		this.south.setPreferredSize(new Dimension(fwidth,fheight-northH));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTableDemo app = new JTableDemo();
	}

}
