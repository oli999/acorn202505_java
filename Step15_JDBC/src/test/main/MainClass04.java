package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnector;

/*
 *  Java DataBase Connectivity (JDBC)
 *  
 *  - java 에서 DB 에 연결해서 INSERT, UPDATE, DELETE, SELECT 등의 작업을 할수가 있다.
 *  - 우리는 ORACLE DataBase 에 연결해서 이런 작업을 할 예정이다.
 *  - ORACLE 연결 driver 클래스가 있어야 연결이 가능하다
 */
public class MainClass04 {
	public static void main(String[] args) {
		
		//SELECT 작업을 위해서 필요한 객체을 담을 지역변수 미리 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//우리가 설계한 DBConnector 클래스를 이용해서 Connection 객체 얻어내기 
			conn=new DBConnector().getConn();
			//실행할 sql 문 미리 준비하기 (java10 부터 추가된 문법)
			String sql="""
				SELECT empno, ename, deptno, dname
				FROM emp
				JOIN dept USING(deptno)
				ORDER BY empno ASC
			""";
			// sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			// SELECT 문 실행하고 결과를 ResultSet 객체로 얻어내기
			rs=pstmt.executeQuery();
			//반복문 돌면서
			while(rs.next()) {
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				int deptno=rs.getInt("deptno");
				String dname=rs.getString("dname");
				String info = String.format("사원번호:%d 사원이름:%s 부서번호:%d 부서명:%s",
						empno, ename, deptno, dname);
				System.out.println(info);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}













