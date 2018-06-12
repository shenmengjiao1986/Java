import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class LoginAndRegFrame extends JFrame implements ActionListener{
	private JLabel labelForUser;
	private JLabel labelForPassword;
	private JTextField textFieldForUser;
	private JTextField textFieldForPassword;
	private JButton buttonForLogin;
	private JButton buttonForRegister;
	
	LoginAndRegFrame(){
		super("登陆注册界面");
		Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(4,4));//两行一列
		
		ImageIcon icon = new ImageIcon("images/LoginIcon.png");
		labelForUser = new JLabel("用户名");
		labelForUser.setIcon(icon);
		labelForUser.setToolTipText("至少8位，仅能包含数字和英文单词");
		
		ImageIcon pIcon = new ImageIcon("images/password.png");
		labelForPassword = new JLabel("用户名",pIcon,SwingConstants.LEFT);
		labelForPassword.setFont(new Font(Font.SERIF, Font.PLAIN, 16));
		labelForPassword.setToolTipText("至少8位，仅能包含数字和英文单词");
		
		textFieldForUser = new JTextField("用户名");
		textFieldForPassword = new JTextField("密码");
		
		buttonForLogin = new JButton("登陆");
		buttonForRegister = new JButton("注册");
		
		buttonForLogin.addActionListener(this);
		buttonForRegister.addActionListener(this);
		
		contentPane.add(labelForUser);
		contentPane.add(textFieldForUser);
		contentPane.add(labelForPassword);
		contentPane.add(textFieldForPassword);
		contentPane.add(buttonForLogin);
		contentPane.add(buttonForRegister);	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String userStr = textFieldForUser.getText();
		String passwordStr = textFieldForPassword.getText();
		if(userStr.length() == 8 && passwordStr.length() == 8){
			System.out.println("用户名:"+userStr+","+"密码:"+passwordStr);
		}else {
			System.out.println("用户名或密码错误");
		}
	}
	
	public void textValueChanged(TextEvent e)
	{
		String userStr = textFieldForUser.getText();
		String passwordStr = textFieldForPassword.getText();
		if(userStr.length() > 8 || passwordStr.length() > 8){
			System.out.println("用户名和密码的长度不得超过8位");
		}
	}
	
	public static void main(String[] args) {
		LoginAndRegFrame app = new LoginAndRegFrame();
		app.setSize(400, 300);
		app.setLocation(20, 30);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
