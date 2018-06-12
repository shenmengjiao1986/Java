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
	private static final int northH = 55;
	private static final int southH = 80;
	private static final int westW = 35;
	private static final int eastW = 79;
	
	LoginAndRegFrame(){
		super("登录界面");
		fwidth = 320;
		fheight = 260;
		this.setSize(fwidth, fheight);
		Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        north = new JPanel();
        north.setPreferredSize(new Dimension(fwidth, northH));
       // north.setSize(fwidth, 55);
        north.setBackground(Color.red);
        north.setLayout(null);
        
        south = new JPanel();
        //south.setSize(fwidth, 80);
        south.setPreferredSize(new Dimension(fwidth, southH));
        south.setBackground(Color.yellow);
        south.setLayout(null);
        
        west = new JPanel();
        //west.setSize(35, fheight-55-80);
        west.setPreferredSize(new Dimension(westW, fheight-northH-southH));
        west.setBackground(Color.blue);
        
        east = new JPanel();
        //east.setSize(80, fheight-55-80);
        east.setPreferredSize(new Dimension(eastW, fheight-northH-southH));
        east.setBackground(Color.green);
        
        center = new JPanel();
        center.setPreferredSize(new Dimension(fwidth-westW-eastW,fheight-northH-southH));
        //center.setSize(fwidth-35-80,fheight-55-80);
       // center.setBackground(Color.gray);
        center.setLayout(null);
        
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
