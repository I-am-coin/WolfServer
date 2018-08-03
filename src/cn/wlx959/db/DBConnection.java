package cn.wlx959.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

;public class DBConnection {
	private static Properties prop = new Properties();
	private static String url;
	private static String user;
	private static String password;
	private static String driver;
	
	static {
		try {
			prop.load(Class.class.getResourceAsStream("db.properties"));
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			driver = prop.getProperty("driver");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);//加载驱动
		Connection con = DriverManager.getConnection(url, user, password);//建立连接
		return con;
	}
	
	public static Map<String, Object> excuteQuery(String table, String condition, Map<Integer, Object> prams) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM " + table + (condition==null?"":condition);
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		for (int i=0; i<prams.size(); i++) {
			ps.setString(i+1, prams.get(i).toString());
		}
		return null;
	}
	
	public static int excuteUpdate() {
		return 0;
	}
	
	public static int excuteInsert() {
		return 0;
	}
	
	public static int excuteDelete() {
		return 0;
	}
}
