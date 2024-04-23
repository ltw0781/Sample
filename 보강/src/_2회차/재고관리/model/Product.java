package _2회차.재고관리.model;

import java.util.Date;

/**
 *  재고(상품)
 *  - 상품아이디 - productId
 *  - 상품명 
 *  - 가격
 *  - 수량
 *  - 카테고리
 *  - 등록일자
 *  - 수정일자
 *  
 */
public class Product {

	//상품아이디
	private String productId;
	//상품명
	private String name;
	// 가격
	private int price;
	// 수량
	private int quantity;
	// 카테고리
	private String category;
	//등록일자
	private Date uploadTime;
	//수정일자
	private Date editTime;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	public Date getEditTime() {
		return editTime;
	}
	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", category=" + category + ", uploadTime=" + uploadTime + ", editTime=" + editTime + "]";
	}	 

	
	
}

	






