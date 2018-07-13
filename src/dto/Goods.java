package dto;

public class Goods {
	private String name;       //名字
	private int kind;          //产品
	private double price;      //价格
	private double discount;   //折扣
	private String photorotue; //图片路径
	private String seller;     //卖家
	private String information;//具体信息
	private int sales;         //销量
	private int stock;         //库存
	
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getPhotorotue() {
		return photorotue;
	}
	public void setPhotorotue(String photorotue) {
		this.photorotue = photorotue;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	

}
