package 数据库链接;
import javax.swing.table.AbstractTableModel;

//首先说下TableModel的设计思想，在Model这种思想的指导下，数据和显示分离开来了。 比如对于JTable而言，有数据部分，也有显示部分(比如列宽等信息)。 数据部分，专门做一个类，叫做TableModel，就用于存放要显示的数据。
//
//使用TableModel的方式存放Table需要显示的数据
public class MyTableModel extends AbstractTableModel {
	private String[] columnNames;
	private String[][] heros;
//	String[] columnNames = new String[] { "id", "name", "hp", "damage" };
//    String[][] heros = new String[][] { { "1", "盖伦", "616", "100" },
//            { "2", "提莫", "512", "102" }, { "3", "奎因", "832", "200" } };
    MyTableModel(){
    	super();
    	DBUtils db = new DBUtils();
    	this.columnNames = db.columns;
    	this.heros = db.datas;
    }
	// 返回一共有多少行
    public int getRowCount() {
        // TODO Auto-generated method stub
        return heros.length;
    }
 
    // 返回一共有多少列
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return columnNames.length;
    }
 
    // 获取每一列的名称
    public String getColumnName(int columnIndex) {
        // TODO Auto-generated method stub
        return columnNames[columnIndex];
    }
 
    // 单元格是否可以修改
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
 
    // 每一个单元格里的值
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        return heros[rowIndex][columnIndex];
    }

}
