package dto;

public class Goods {
	private String name;       //����
	private int kind;          //��Ʒ
	private double price;      //�۸�
	private double discount;   //�ۿ�
	private String photorotue; //ͼƬ·��
	private String seller;     //����
	private String information;//������Ϣ
	private int sales;         //����
	private int stock;         //���
	
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
