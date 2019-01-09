package hello;

import java.sql.*;

import com.alibaba.fastjson.JSONObject;

public class helloWorld {
	public static void main (String[] args) {
		String dbType;
		String dbUrl;
		String dbUser;
		String dbPasswd;
		String dbDriver;
				
		dbType = ConfigurationManager.getProperty(Constants.JDBC_TYPE);
		dbUrl = ConfigurationManager.getProperty(Constants.JDBC_URL);
		dbUser = ConfigurationManager.getProperty(Constants.JDBC_USER);
		dbPasswd = ConfigurationManager.getProperty(Constants.JDBC_PASSWORD);
		dbDriver = ConfigurationManager.getProperty(Constants.JDBC_DRIVER);
		
		/*********/		
		JSONObject json = new JSONObject();
		
		String errMsg = "";
		
		Connection conn = null;
		try {
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);
			Statement state = conn.createStatement();
			String sql = "select * from mt_machine";
			state.executeQuery(sql);
			conn.close();//关闭连接
		} catch (SQLException e) {
			System.err.println("\n\n\n数据库连接失败\n\n");		
			System.err.println(e.getMessage());
			errMsg = "数据库连接异常,请查看配置信息";
			
		} catch (ClassNotFoundException e){
			System.err.print("ClassNotFoundException:");
			System.out.println(e.getMessage());
			errMsg = dbDriver+"驱动类不存在";
			
		}
		//test tortoiseGit		
		//test tortoiseGit3
		System.out.println("conn");
		
		json.put("errMsg", errMsg);
		System.out.println(json.toString());
		
		LogTest logTest = new LogTest();
		logTest.writeLog();
	}	
}

