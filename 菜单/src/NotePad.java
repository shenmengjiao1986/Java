import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class NotePad extends JFrame implements ActionListener{  
    JMenuBar menubar;   //菜单条组件  
    JMenu menuForFile, menu2, menu3, menu4, menu5;//菜单  
    JMenuItem itemForOpen, itemForSave, itemForSaveAs, itemForSetting, itemForPrint, itemForQuit;//菜单项  
    JMenu menuForBuild;    //二级菜单  
    JMenuItem itemForBuildFile, itemForBuildProject;  
    JTextArea jta;  
      
    JToolBar toolbar;//工具条  
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7;  
      
    public NotePad(){  
        //创建菜单  
        menubar = new JMenuBar();  
          
        menuForFile = new JMenu("文件(F)");  
        menuForFile.setMnemonic('f'); //助记符  
        menu2 = new JMenu("编辑");  
        menu2.setMnemonic('E');  
        menu3 = new JMenu("格式");  
        menu4 = new JMenu("查看");  
        menu5 = new JMenu("帮助");  
          
        menuForBuild = new JMenu("新建");  
          
        itemForBuildFile = new JMenuItem("文件");
        itemForBuildFile.addActionListener(this);
        itemForBuildProject = new JMenuItem("工程");  
        itemForBuildProject.addActionListener(this);
        itemForOpen = new JMenuItem("打开");  
        itemForSave = new JMenuItem("保存(S)");  
        itemForSaveAs = new JMenuItem("另存为");  
        itemForSetting = new JMenuItem("页面设置");  
        itemForPrint = new JMenuItem("打印");  
        itemForQuit = new JMenuItem("退出");  
          
        jta = new JTextArea();  
          
            //添加菜单项至菜单上  
        menuForBuild.add(itemForBuildFile);  
        menuForBuild.add(itemForBuildProject);  
          
        menuForFile.add(menuForBuild);  
        menuForFile.add(itemForOpen);  
        menuForFile.add(itemForSave);  
        menuForFile.add(itemForSaveAs);  
        menuForFile.addSeparator();  
        menuForFile.add(itemForSetting);  
        menuForFile.add(itemForPrint);  
        menuForFile.add(itemForQuit);  
            //将菜单加入至菜单栏  
        menubar.add(menuForFile);  
        menubar.add(menu2);  
        menubar.add(menu3);  
        menubar.add(menu4);  
        menubar.add(menu5);  
          
        //创建工具条  
        toolbar = new JToolBar();  
        jb1 = new JButton("新建");  
        jb1.setToolTipText("新建");//鼠标悬停提示信息  
        jb2 = new JButton("打开");  
        jb3 = new JButton("复制");  
        jb4 = new JButton("剪切");  
        jb5 = new JButton("打印");  
        toolbar.add(jb1);  
        toolbar.add(jb2);  
        toolbar.add(jb3);  
        toolbar.add(jb4);  
        toolbar.add(jb5);  
        jta = new JTextArea();  
            //加入滚动条  
        JScrollPane jsp = new JScrollPane(jta);  
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);  
          
        this.setJMenuBar(menubar);  //添加菜单栏，不能设定位置，会自动放在最上部  
        this.add(toolbar, BorderLayout.NORTH);  //添加工具条  
        this.add(jsp, BorderLayout.CENTER); //添加文本域  
          
        this.setTitle("NotePad");  
        this.setSize(600, 500);  
        this.setVisible(true);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
    }  
      
    public void actionPerformed(ActionEvent e){
    	String cmd = e.getActionCommand();
    	System.out.println(cmd+"菜单项被点击");
    }
    
    public static void main(String[] args) {  
        NotePad np = new NotePad();  
  
    }  
      
  
}  