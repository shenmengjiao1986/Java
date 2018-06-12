import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyExampleFrame extends JFrame {
	private JMenuItem itemForNew;
	private JMenuItem itemForOpen;
	private JMenuItem itemForSave;
	MyExampleFrame(){
		super("菜单实例");
		//Step1:创建JMenuBar对象并将其添加到窗体对象中
		JMenuBar menubar = new JMenuBar();
		this.setJMenuBar(menubar);
		//Step2:创建若干个JMenu对象
		JMenu menuForFile = new JMenu("File");
		//Step3:创建若干个JMenuItem对象
		//新建，保存，打开
		itemForNew = new JMenuItem("New");
		itemForOpen = new JMenuItem("Open");
		itemForSave = new JMenuItem("Save");
		//Step4:为JMenuItem注册ActionListener
		itemForNew.addActionListener(new HandlerFileMenuItemListener());
		itemForOpen.addActionListener(new HandlerFileMenuItemListener());
		itemForSave.addActionListener(new HandlerFileMenuItemListener());
		//Step5:将各个JMenuItem对象添加到Jmenu对象中
		menuForFile.add(itemForNew);
		menuForFile.add(itemForOpen);
		menuForFile.add(itemForSave);
		//Step6:将各个JMenu对象添加到JMenuBar对象中
		menubar.add(menuForFile);
	}
	
	class HandlerFileMenuItemListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == itemForNew){
				System.out.println("新建文件");
			}else if(e.getSource() == itemForSave){
				System.out.println("保存文件");
			}else if(e.getSource() == itemForOpen){
				System.out.println("打开文件");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyExampleFrame app = new MyExampleFrame();
		app.setSize(400, 300);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
