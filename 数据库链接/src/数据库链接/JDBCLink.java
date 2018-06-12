package 数据库链接;
import java.sql.*;
public class JDBCLink {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/user";
	static final String USER = "root";
	static final String PASS = "0317";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
	    Statement stmt = null;
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	System.out.println("驱动程序加载成功");
	    	conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	System.out.println("数据库链接成功");
//	    	stmt = conn.createStatement();
//	    	String sql = "insert into BaseUserInfo(username,password) values('tangtang',123)";
//	    	stmt.executeUpdate(sql);
//	    	sql = "select * from BaseUserInfo";
//	    	ResultSet rs = stmt.executeQuery(sql);
//	    	while(rs.next()){
//	    		System.out.println(rs.getString("username"));
//	    	}
//	    	
	    }catch(Exception e){
	    	System.out.print("捕获异常");
	    	e.printStackTrace();
	    }
		
	}

}
