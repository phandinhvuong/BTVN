package jsp.examples.bo;

import java.sql.Date;

public class News {
	public int ID;
	public int Category_id;
	public String Names;
	public String Description_news;
	public String Detail;
	public String Image_news;
	public String Date_news;
	public int User_ids;

	public News(int iD, int category_id, String names, String description_news, String detail, String image_news,
			String date_news, int user_ids) {
		super();
		ID = iD;
		Category_id = category_id;
		Names = names;
		Description_news = description_news;
		Detail = detail;
		Image_news = image_news;
		Date_news = date_news;
		User_ids = user_ids;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getCategory_id() {
		return Category_id;
	}

	public void setCategory_id(int category_id) {
		Category_id = category_id;
	}

	public String getNames() {
		return Names;
	}

	public void setNames(String names) {
		Names = names;
	}

	public String getDescription_news() {
		return Description_news;
	}

	public void setDescription_news(String description_news) {
		Description_news = description_news;
	}

	public String getDetail() {
		return Detail;
	}

	public void setDetail(String detail) {
		Detail = detail;
	}

	public String getImage_news() {
		return Image_news;
	}

	public void setImage_news(String image_news) {
		Image_news = image_news;
	}

	public String getDate_news() {
		return Date_news;
	}

	public void setDate_news(String date_news) {
		Date_news = date_news;
	}

	public int getUser_ids() {
		return User_ids;
	}

	public void setUser_ids(int user_ids) {
		User_ids = user_ids;
	}
	
}
