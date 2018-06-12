//1.导入AWT和Swimg包
import java.awt.*;
import javax.swing.*;
public class LoginFrame extends JFrame {
	private static final int fwidth = 320;
	private static final int fheight = 260;
	private static final int northH = 55;
	private static final int southH = 75;
	private static final int westW = 38;
	private static final int eastW = 79;
	private JPanel north;
	private JPanel south;
	private JPanel west;
	private JPanel east;
	private JPanel center;
	
	private JLabel labelForTitle;
	private JLabel labelForUser;
	private JLabel labelForPassword;
	private JTextField textfieldForUser;
	private JPasswordField pfForPassword;
	private JButton buttonForLogin;
	private JButton buttonForRegister;
	private JButton buttonForReset;
	LoginFrame(){
		//2.使用构造方法创建JFrame窗口
		super("登录界面");
		//3.设置窗口大小、位置、标题、图标等属性
		setSize(fwidth, fheight);
		setLocation(100, 200);
		//4.设置窗口关闭后的响应行为
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//5.取得ContentPane对象，或者为JFrame窗体创建一个ContentPane对象
		Container contentpane =  getContentPane();
	    //6.为ContentPane对象设置布局管理器及其他属性
		contentpane.setLayout(new BorderLayout());
		
		//north
		north = new JPanel();
		north.setPreferredSize(new Dimension(fwidth, northH));
		//north.setBackground(Color.red);
		north.setLayout(null);
		contentpane.add(north, BorderLayout.NORTH);
		
		
		//south
		south = new JPanel();
		south.setPreferredSize(new Dimension(fwidth, southH));
		//south.setBackground(Color.yellow);
		south.setLayout(null);
		contentpane.add(south, BorderLayout.SOUTH);
		
		//west
		west = new JPanel();
		west.setPreferredSize(new Dimension(westW, fheight-northH-southH));
		//west.setBackground(Color.pink);
		contentpane.add(west, BorderLayout.WEST);
		
		//east
		east = new JPanel();
		east.setPreferredSize(new Dimension(eastW, fheight-northH-southH));
		//east.setBackground(Color.orange);
		contentpane.add(east, BorderLayout.EAST);
		
		//center
		center = new JPanel();
		center.setPreferredSize(new Dimension(fwidth-westW-eastW, fheight-northH-southH));
		//center.setBackground(Color.white);
		center.setLayout(null);
		contentpane.add(center, BorderLayout.CENTER);
		
		this.makeupLabelForTitle();
		this.makeupLabelForUser();
		this.makeupLabelForpassword();
		this.makeupTextfieldForUser();
		this.makeupPfForPassword();
		this.makeupButtonForLogin();
		this.makeupButtonForRegister();
		this.makeupButtonForReset();
	     //8.创建后的窗口默认不可见，需要调用setVisible方法或show方法使其可见
		 setVisible(true);
	}
	
	public void makeupLabelForTitle(){
		this.labelForTitle = new JLabel("学生管理系统");
		this.labelForTitle.setFont(new Font(Font.SERIF, Font.PLAIN, 18));
		this.labelForTitle.setBounds((fwidth-133)/2, northH-18, 133, 18);
		ImageIcon icon = new ImageIcon("images/title.png");
		this.labelForTitle.setIcon(icon);
		this.north.add(this.labelForTitle);
	}
	
	public void makeupLabelForUser(){
		this.labelForUser = new JLabel("用户名");
		this.labelForUser.setFont(new Font(Font.SERIF, Font.PLAIN, 12));
		this.labelForUser.setBounds(0, 30, 55, 17);
		ImageIcon icon = new ImageIcon("images/user.png");
		this.labelForUser.setIcon(icon);
		this.center.add(this.labelForUser);
	}
	
	public void makeupLabelForpassword(){
		this.labelForPassword = new JLabel("密码");
		this.labelForPassword.setFont(new Font(Font.SERIF, Font.PLAIN, 12));
		this.labelForPassword.setBounds(0, 55, 44, 17);
		ImageIcon icon = new ImageIcon("images/password.png");
		this.labelForPassword.setIcon(icon);
		this.center.add(this.labelForPassword);
	}
	
	public void makeupTextfieldForUser(){
		this.textfieldForUser = new JTextField();
		this.textfieldForUser.setBounds(fwidth-westW-eastW-148, 30, 148-15, 17);
		this.center.add(this.textfieldForUser);
	}
	
	public void makeupPfForPassword(){
		this.pfForPassword = new JPasswordField();
		this.pfForPassword.setBounds(fwidth-westW-eastW-148, 55, 148-15, 17);
		this.center.add(this.pfForPassword);
	}
	
	public void makeupButtonForLogin(){
		this.buttonForLogin = new JButton("登录");
		this.buttonForLogin.setBounds((fwidth-3*46-2*12)/2, 0, 46, 24);
		this.buttonForLogin.setBorder(BorderFactory.createEtchedBorder());
		this.south.add(this.buttonForLogin);
	}
	
	public void makeupButtonForRegister(){
		this.buttonForRegister = new JButton("注册");
		this.buttonForRegister.setBounds((fwidth-3*46-2*12)/2+46+12, 0, 46, 24);
		this.buttonForRegister.setBorder(BorderFactory.createEtchedBorder());
		this.south.add(this.buttonForRegister);
	}
	
	public void makeupButtonForReset(){
		this.buttonForReset = new JButton("重置");
		this.buttonForReset.setBounds((fwidth-3*46-2*12)/2+46+12+46+12, 0, 46, 24);
		this.buttonForReset.setBorder(BorderFactory.createEtchedBorder());
		this.south.add(this.buttonForReset);
	}
	
}
