package vn.demo.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jsp.examples.bo.News;
import vn.demo.DAOiml.NewsDAO;
import vn.demo.idao.IcrudDAO;
import vn.demo.utils.ConenectionUtils;

public class MainProgram {

		// TODO Auto-generated method stub
		public static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			ConenectionUtils conn = new ConenectionUtils();
			Connection conne = conn.getMyConnection();
			Statement s = conne.createStatement();
			// TODO Auto-generated method stub
			IcrudDAO news = new NewsDAO();
			
			int so;
			do {
				System.out.println("-----MENU-----");
				System.out.println("1. Create News");
				System.out.println("2. Show The List Of News");
				System.out.println("3. Exit");
				/*System.out.println("4. Search News By Name Or Category ");*/
				System.out.println("5. Edit News ");
				System.out.println("6.Delete News");
				System.out.println("0. Return Menu");

				System.out.println("---> Choose one number in MENU:  ");
				so = scanner.nextInt();
				System.out.println("The number you chose:  "+ so);
			
			switch(so) {
			
			case 1:
				news.addNews(s);
				break;
			case 2:
				news.showNews(s);
				break;
			case 3:
				break;
			/*case 4:
				System.out.println("Input name to search: ");
				String nameInput = scanner1.nextLine();
				
				
				break;*/
			case 5:
				System.out.println("Input Name update");
				String latestnew1 = scanner.nextLine();
				news.editNewsByName(latestnew1, s);
				break;
			case 6:
				System.out.println("Input Name Delete");
				String nameinput1 = scanner.nextLine();
				news.deleteNewsByName(nameinput1, s);
				break;
			default:
				System.out.println("Nhap sai. Moi nhap lai");
				break;
			}
			}while( so != 5);
		}
	}

