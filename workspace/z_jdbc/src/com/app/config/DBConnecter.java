package com.app.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
	public static Connection getConnection() {
		Connection connection = null;
//		자바와 dbms를 연결해줄 DBC형의 connection  변수 선언
		
		String userName = "dbms";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/jdbc?useSSL=false&serverTimezone=Asia/Seoul";
//		정보를 전달해줄 변수 선언
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 정보 오류");
			e.printStackTrace();
		}
//		try~catch문을 설정하여 오류가 났을 때 강제 종료 방지
		
		return connection;
//		성공 시 connection을 리턴하여 정보 전달 완료
	}
}
