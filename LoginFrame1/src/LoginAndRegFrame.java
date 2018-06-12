import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class LoginAndRegFrame extends JFrame {
	private JPanel north;
	private JPanel south;
	private JPanel center;
	private JPanel west;
	private JPanel east;
	private int fwidth;
	private int fheight;
	
	LoginAndRegFrame(){
		super("登陆注册界面");
		//初始化参数
		fwidth = 320;
		fheight = 260;
		this.setSize(fwidth, fheight);
		Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        north = new JPanel();
        north.setPreferredSize(new Dimension(fwidth, 55));
       // north.setSize(fwidth, 55);
        north.setBackground(Color.red);
        
        south = new JPanel();
        //south.setSize(fwidth, 80);
        south.setPreferredSize(new Dimension(fwidth, 80));
        south.setBackground(Color.yellow);
        
        west = new JPanel();
        //west.setSize(35, fheight-55-80);
        west.setPreferredSize(new Dimension(35, fheight-55-80));
        west.setBackground(Color.blue);
        
        east = new JPanel();
        //east.setSize(80, fheight-55-80);
        east.setPreferredSize(new Dimension(80, fheight-55-80));
        east.setBackground(Color.green);
        
        center = new JPanel();
        center.setPreferredSize(new Dimension(fwidth-35-80,fheight-55-80));
        //center.setSize(fwidth-35-80,fheight-55-80);
        center.setBackground(Color.gray);
        
        contentPane.add(north, BorderLayout.NORTH);
		contentPane.add(center,BorderLayout.CENTER);
		contentPane.add(south,BorderLayout.SOUTH);
		contentPane.add(west,BorderLayout.WEST);
		contentPane.add(east,BorderLayout.EAST);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		LoginAndRegFrame app = new LoginAndRegFrame();
		app.setLocation(20, 30);
	}
}
