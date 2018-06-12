package 数据库链接;
import java.util.*;
import javax.swing.*;


public class MyJTable extends JFrame {
	private JTable table;
	MyJTable(){
		super("表格");
		this.setSize(320, 260);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		String[] columnNames = new String[] { "id", "name", "hp", "damage" };
//        String[][] heros = new String[][] { { "1", "盖伦", "616", "100" },
//                { "2", "提莫", "512", "102" }, { "3", "奎因", "832", "200" } };
		this.table = new JTable(new MyTableModel());
		JScrollPane sp = new JScrollPane(this.table);
		this.add(sp);
		this.setVisible(true);
	}
}
