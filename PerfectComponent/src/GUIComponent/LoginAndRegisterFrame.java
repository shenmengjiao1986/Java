package GUIComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginAndRegisterFrame extends JFrame {
	private JLabel labelForTitle;
	private JLabel labelForUser;
	private JLabel labelForPassword;
	private JTextField textFieldForUser;
	private JTextField textFieldForPassword;
	private JButton buttonForLogin;
	private JButton buttonForRegister;
	private JButton buttonForReset;
	/*用于调整视觉的一些属性*/
	private static final int width = 330;
	private static final int height = 260;
	private static final int widthOfTitle = 133;
	private static final int heightOfTitle = 19;
	private static final int heightOfNorth = 55;
	private static final int heightOfCenter = 72;
	private static final int heightOfSouth = 111;
	private static final int leftSpan = 38;
	private static final int rightSpan = 79;
	private static final int widthOfLabelForUser = 55;
	private static final int widthOfLabelForPassword = 44;
	private static final int widthOfTextField = 148;
	private static final int heightOfTextField = 17;
	private static final int widthOfButton = 46;
	private static final int heightOfButton = 24;
	private static final int spanBetweenButton = 12;
	LoginAndRegisterFrame(){
		super("登陆注册界面");
		super.setSize(width, height);
		Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());//也许考虑设置hgap,vgap
		
        //NORTH
        JPanel panelAtNorth = new JPanel(null);
        panelAtNorth.setPreferredSize(new Dimension(width, heightOfNorth));
        ImageIcon iconForTitle = new ImageIcon("images/LoginIcon.png");
        Image imageForTitle = iconForTitle.getImage().getScaledInstance(19, 19, Image.SCALE_DEFAULT);
        iconForTitle.setImage(imageForTitle);
        labelForTitle = new JLabel("学生管理系统", JLabel.CENTER);
        labelForTitle.setIcon(iconForTitle);
        labelForTitle.setSize(widthOfTitle, 19);
        labelForTitle.setFont(new Font("宋体", Font.BOLD, 18));
        int x = (width - widthOfTitle)/2;
        int y = heightOfNorth - heightOfTitle;
        System.out.println(labelForTitle.getWidth()+","+labelForTitle.getHeight());
        labelForTitle.setBounds(x, y, widthOfTitle, heightOfTitle);
        panelAtNorth.add(labelForTitle);
        contentPane.add(panelAtNorth, BorderLayout.NORTH);
        
        
        //CENTER
        JPanel panelAtCenter = new JPanel(null);
        panelAtCenter.setPreferredSize(new Dimension(width, heightOfCenter));
        //第一行
		ImageIcon iconForUser = new ImageIcon("images/LoginIcon.png");
		Image imageForUser = iconForUser.getImage().getScaledInstance(18, 20, Image.SCALE_DEFAULT);
		iconForUser.setImage(imageForUser);
		labelForUser = new JLabel("用户名");
		labelForUser.setFont(new Font("宋体", Font.PLAIN, 11));
		labelForUser.setIcon(iconForUser);
		labelForUser.setToolTipText("至少8位，仅能包含数字和英文单词");
		textFieldForUser = new JTextField("用户名");
		
		labelForUser.setBounds(leftSpan, 17, widthOfLabelForUser, 18);
		textFieldForUser.setBounds(width - rightSpan - widthOfTextField, 17, widthOfTextField, heightOfTextField);
		panelAtCenter.add(labelForUser);
		panelAtCenter.add(textFieldForUser);
		
		//第二行
		ImageIcon pIcon = new ImageIcon("images/LoginIcon.png");
		Image imageForP = pIcon.getImage().getScaledInstance(18, 16, Image.SCALE_DEFAULT);
		pIcon.setImage(imageForP);
		labelForPassword = new JLabel("密码");
		labelForPassword.setFont(new Font("宋体", Font.PLAIN, 11));
		labelForPassword.setIcon(pIcon);
		labelForPassword.setToolTipText("至少8位，仅能包含数字和英文单词");
		textFieldForPassword = new JTextField("密码");
		
		labelForPassword.setBounds(leftSpan, heightOfCenter - 20, widthOfLabelForPassword, 18);
		textFieldForPassword.setBounds(width - rightSpan - widthOfTextField, heightOfCenter - 20, widthOfTextField, heightOfTextField);
		panelAtCenter.add(labelForPassword);
		panelAtCenter.add(textFieldForPassword);
		
        contentPane.add(panelAtCenter, BorderLayout.CENTER);
        
        //SOUTH
        JPanel panelAtBottom = new JPanel(null);
        panelAtBottom.setPreferredSize(new Dimension(width, heightOfSouth));
        //panelAtBottom.setBackground(Color.blue);
        buttonForLogin = new JButton("登陆");
        buttonForLogin.setFont(new Font("宋体", Font.PLAIN, 9));
		buttonForRegister = new JButton("注册");
		buttonForRegister.setFont(new Font("宋体", Font.PLAIN, 9));
		buttonForReset = new JButton("重置");
		buttonForReset.setFont(new Font("宋体", Font.PLAIN, 9));
		buttonForReset.setBounds(width - rightSpan - widthOfButton,25, widthOfButton, heightOfButton);
		buttonForRegister.setBounds(width - rightSpan - 2*widthOfButton - spanBetweenButton, 25,widthOfButton, heightOfButton);
		buttonForLogin.setBounds(width - rightSpan - 3*widthOfButton - 2*spanBetweenButton, 25, widthOfButton, heightOfButton);
		panelAtBottom.add(buttonForLogin);
		panelAtBottom.add(buttonForRegister);
		panelAtBottom.add(buttonForReset);
        contentPane.add(panelAtBottom, BorderLayout.SOUTH);	
	}
	
	public static void main(String[] args) {
		LoginAndRegisterFrame app = new LoginAndRegisterFrame();
		//app.setSize(400, 300);
		app.setLocation(20, 30);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
