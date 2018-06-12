package 数据库链接;
import java.sql.*;

//增删改查
public class ZSGC {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/user";
	static final String USER = "root";
	static final String PASS = "0317";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
	    Statement stmt = null; //用于执行SQL语句
	    PreparedStatement pstmt = null;
	    CallableStatement cstmt = null;
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	System.out.println("驱动程序加载成功");
	    	conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	System.out.println("数据库链接成功");
	    	//Statement增删改查
	    	stmt = conn.createStatement();
	    	//查
	    	String sql = "select * from BaseUserInfo";
	    	ResultSet rs = stmt.executeQuery(sql);
	    	while(rs.next()){
	    		System.out.println(rs.getString("username")+rs.getString("password"));
	    	}
	    	//增
	    	System.out.println("增加数据");
	    	sql = "insert into BaseUserInfo(username,password) values('tangtang',123)";
	    	stmt.executeUpdate(sql);
	    	sql = "insert into BaseUserInfo(username,password) values('joyce',123456)";
	    	stmt.executeUpdate(sql);
	    	//查
	    	sql = "select * from BaseUserInfo";
	    	rs = stmt.executeQuery(sql);
	    	while(rs.next()){
	    		System.out.println(rs.getString("username")+rs.getString("password"));
	    	}
	    	//改
	    	System.out.println("修改数据");
	    	sql = "update BaseUserInfo set password=456 where username='tangtang'";
	    	stmt.executeUpdate(sql);
	    	//查
	    	sql = "select * from BaseUserInfo";
	    	rs = stmt.executeQuery(sql);
	    	while(rs.next()){
	    		System.out.println(rs.getString("username")+rs.getString("password"));
	    	}
	    	//删
	    	System.out.println("删除数据");
	    	sql = "delete from BaseUserInfo where username = 'joyce'";
	    	stmt.executeUpdate(sql);
	    	//查
	    	sql = "select * from BaseUserInfo";
	    	rs = stmt.executeQuery(sql);
	    	while(rs.next()){
	    		System.out.println(rs.getString("username")+rs.getString("password"));
	    	}
	    	
	    }catch(Exception e){
	    	System.out.print("捕获异常");
	    	e.printStackTrace();
	    }
	}

}
