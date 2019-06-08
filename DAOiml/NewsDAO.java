package vn.demo.DAOiml;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jdbc.ConnectionUtils;
import jsp.examples.bo.News;
import vn.demo.idao.IcrudDAO;
import vn.demo.utils.ConenectionUtils;
import java.util.ArrayList;
import java.util.Scanner;

public class NewsDAO implements IcrudDAO {
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scanner1 = new Scanner(System.in);
	ArrayList<News> list = new ArrayList<>();
	@Override
	public void addNews(Statement st) {
		// TODO Auto-generated method stub
	     System.out.println("Nhap ID News: ");
	     int id_news = scanner.nextInt();
	     System.out.println("Nhap ID category: ");
	     int id_category = scanner.nextInt();
	     System.out.println("Nhap Names: ");
	     String name = scanner1.nextLine();
	     System.out.println("Nhap Description News: ");
	     String des_news = scanner.nextLine();
	     System.out.println("Nhap Details: ");
	     String detail_news = scanner.nextLine();
	     System.out.println("Nhap Image: ");
	     String image_news = scanner.nextLine();
	     System.out.println("Nhap Date: ");
	     String date_news = scanner.nextLine();
	     System.out.println("Nhap ID News: ");
	     int id_users = scanner.nextInt();
		 String sql = "insert into news values("+id_news+","+id_news+",'"+name+"','"+des_news+"','"+detail_news+"','"+image_news +"','"+image_news +"','"+date_news +"',"+id_users+")";
		 System.out.println(sql);
		 try {
				st.execute(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	  }
	}		 

	@Override
	public void showNews(Statement st1) {
		// TODO Auto-generated method stub
		try {
			String sql = "select *from News";
			ResultSet rs=null;
			while (rs.next()) {
				int id_news = rs.getInt("ID");
				int id_category = rs.getInt("Category_id");
				String names = rs.getString("Names");
				String des_news = rs.getString("Description_news");
				String detail_news = rs.getString("Detail");
				String image_news = rs.getString("Image_news");
				String date = rs.getString("Date_news");
				int id_users = rs.getInt("User_ids");
				News n = new News(id_news,  id_category, names, des_news ,detail_news, image_news, date, id_users );
				list.add(n);
				for (News news : list) {
		 			System.out.println(news. getID()+"	 "+news.getCategory_id()+"	"+news.getNames()+"	"+news.getDescription_news()+"	   	 "+news.getDetail()+"	"+news.getImage_news()+"		"+news. getDate_news()+"   "+news.getUser_ids());
		 		}
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	


	@Override
	public void editNewsByName (String latestnew,Statement st2) {
		// TODO Auto-generated method stub
		System.out.println("Input Name update");
		String latestnew1 = scanner.nextLine();
		String sql ="update News\r\n" + 
				"set Names = "+"'"+latestnew1+"'"+"\r\n" + 
				"where Name ="+"'"+latestnew+"'";
		System.out.println(sql);
		try {
			st2.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
}

	@Override
	public void deleteNewsByName(String nameinput, Statement st3) {
		// TODO Auto-generated method stub
		String sql =" delete News\r\n" + 
				"where Names = "+"'"+nameinput+"'";
		System.out.println(sql);
		try {
			st3.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
}		

	/*@Override
	public News findNewsByName(String nameinput) {
		// TODO Auto-generated method stub
		
		return null;
	}*/

}
