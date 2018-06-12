package 数据库链接;


import java.sql.*;
public class DBUtils {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/user";
	static final String USER = "root";
	static final String PASS = "0317";
	ResultSet rs;
	public String[] columns;
	public String[][] datas;
	DBUtils(){
		Connection conn = null;
	    Statement stmt = null;
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	System.out.println("驱动程序加载成功");
	    	conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	System.out.println("数据库链接成功");
	    	stmt = conn.createStatement();
	    	String sql = "select * from BaseUserInfo";
	    	rs = stmt.executeQuery(sql);
	    	
	    	ResultSetMetaData rsmd = rs.getMetaData();
	    	int colcount=rsmd.getColumnCount();
	    	this.columns=new String[colcount];
	    	for(int i=0;i<colcount;i++){
	    		this.columns[i] = rsmd.getColumnName(i+1);
	    	}
	    	rs.last();
	    	int rowcount = rs.getRow();
	    	rs.beforeFirst();
	    	this.datas = new String[rowcount][colcount];
	    	int i=0;
	    	while(rs.next()){
	    		int j = 0;
	    		while(j<colcount){
	    			this.datas[i][j] = rs.getString(this.columns[j]);
	    			j++;
	    		}
	    		i++;
	    	}    	
	    }catch(Exception e){
	    	System.out.print("捕获异常");
	    	e.printStackTrace();
	    }
	}
}
