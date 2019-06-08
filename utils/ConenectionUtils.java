package vn.demo.utils;

import java.sql.Connection;
import java.sql.SQLException;
import jdbc.SQLServerConnUtils_JTDS;
	 
	public class ConenectionUtils {
	 
	  public static Connection getMyConnection() throws SQLException,
	          ClassNotFoundException {

	      // Bạn có thể thay thế bởi Database nào đó.
	      return SQLServerConnUtils_JTDS.getSQLServerConnection();
	  }
	 
	  //
	  // Test Connection ...	
	  //
	  public static void main(String[] args) throws SQLException,
	          ClassNotFoundException {
	 
	      System.out.println("Get connection ... ");
	 
	      // Lấy ra đối tượng Connection kết nối vào database.
	      Connection conn = ConenectionUtils.getMyConnection();
	 
	      System.out.println("Get connection " + conn);
	 
	      System.out.println("Done!");
	  }
	 

}
