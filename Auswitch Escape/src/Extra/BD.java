package Extra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {
	
	static Connection conn;
	static Statement stmt;
	
	
	public static void main(String[] args) {
		try{
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:DataBase");
			stmt = conn.createStatement();
			operacionBD();
			
			stmt.close();
			conn.close();
		}catch(ClassNotFoundException e){
			System.out.println("No se ha encontrado la clase");
			e.printStackTrace();
		}catch(SQLException e){
			System.out.println("Error en la ejecucion");
			e.printStackTrace();
		}
	
	}
		
	public static void operacionBD() throws SQLException{
		
		int r;
		ResultSet rs;
		
		
		int temp = ResultTiempos.getTiempo();
		//stmt.executeUpdate("INSERT INTO RANKING VALUES (1, 'AAA', '"+ temp +" ')");
		stmt.executeUpdate("UPDATE RANKING SET TIEMPO = '"+temp+"' where NOMBRE = 'AAA'");
		rs=stmt.executeQuery("SELECT  TIEMPO FROM RANKING WHERE NOMBRE = 'AAA'");
		System.out.println(rs.getString(1));
	}
		

}


