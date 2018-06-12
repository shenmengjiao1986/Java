import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyExampleTwoFrame extends JPanel {
	private JToolBar toolBar;
	private JButton buttonForOpen;
	private JButton buttonForSave;
	private JButton buttonForNew;
	MyExampleTwoFrame(){
		//super("JToolBar示例");
		super(new BorderLayout());
		toolBar = new JToolBar();
		this.add(toolBar);
		buttonForOpen = new JButton("Open");
		buttonForSave = new JButton("Save");
		buttonForNew = new JButton("New");
//		buttonForOpen.addActionListener(this);
//		buttonForSave
//		buttonForNew
		toolBar.add(buttonForNew);
		toolBar.addSeparator();
		toolBar.add(buttonForOpen);
		toolBar.addSeparator();
		toolBar.add(buttonForSave);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame app = new JFrame("工具栏示例");
		MyExampleTwoFrame contentPane = new MyExampleTwoFrame();
		contentPane.setOpaque(true);
		app.setContentPane(contentPane);
		app.pack();
		//app.setSize(400, 300);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
