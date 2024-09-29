package Model;

import java.util.ArrayList;
import java.util.List;

public class CreateProductBean {

	public CreateProductBean(String string, int i, String string2, List<String> images2, int j) {
		// TODO Auto-generated constructor stub
	}
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "CreateProductBean [title=" + title + ", price=" + price + ", description=" + description + ", images="
				+ images + ", categoryId=" + categoryId + "]";
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	private Integer price;
	private String description;
	private List<String> images = new ArrayList<String>();
	private Integer categoryId;

}
