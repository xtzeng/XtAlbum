package com.xiaoti.album.dao;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class JDBC {
	
	//数据库驱动
	private static final String DRIVERCLASS = "org.apache.derby.jdbc.EmbeddedDriver";
	
	//数据库URL
	private static final String URL = "jdbc:derby:db_album";
	
	//用来保存数据库连接
	private static final ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	
	//数据库连接
	private static Connection conn = null;
	
	static {
		try {
			Class.forName(DRIVERCLASS);//加载数据库驱动
			
			File db_album = new File("db_album");//创建数据库文件对象
			
			if (!db_album.exists()) { //数据库文件不存在
				createDatabase(); //创建数据库
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void createDatabase() throws SQLException {
		String sqls[] = new String[2]; //定义创建数据库的SQL语句
		
		sqls[0] = "create table tb_album(id int not null,father_id int not null,name varchar(20) not null,primary key (id)";
		sqls[1] = "create table tb_photo (num varchar(28) not null,album_id int not null,date date not null,title varchar(20) not null,note varchar(200),primary key (num)) ";
		
		conn = DriverManager.getConnection(URL + ";create=true"); 
		threadLocal.set(conn);
		
		Statement stmt = conn.createStatement();
		
		for(int i=0;i<sqls.length;i++) {
			stmt.execute(sqls[i]);
		}
		
		stmt.close();
	}
	
	protected static Connection getConnection() throws SQLException {
		conn = (Connection) threadLocal.get();
		
		if(conn==null){
			try {
				conn = DriverManager.getConnection(URL);
				threadLocal.set(conn);
			} catch (Exception e) {
				String[] infos = {"未能成功连接数据库！","请确认本软件是否已经运行！"};
				JOptionPane.showMessageDialog(null, infos);
				System.exit(0);
				e.printStackTrace();
			}
		}
		
		return conn;
	}
	
	protected static boolean closeConnection() {
		boolean isClosed = true;
		
		conn = (Connection) threadLocal.get();
		
		threadLocal.set(null);
		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				isClosed = false; //关闭失败
				e.printStackTrace();
			}
		}
		
		return isClosed;
	}
	
}
