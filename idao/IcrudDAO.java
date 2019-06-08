package vn.demo.idao;

import java.sql.SQLException;
import java.sql.Statement;
import jsp.examples.bo.News;

public interface IcrudDAO {
	public void addNews( Statement s)  ;
	public void showNews(Statement st1);
	public void editNewsByName (String latestnew,Statement st2);
	public void deleteNewsByName(String nameinput, Statement st3);
	//public News findNewsByName(String nameinput);
	
}
