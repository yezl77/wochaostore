package dto;

import java.io.Serializable;

public class Seller implements Comparable<Seller>, Serializable{
	private String name;
	private String password;
	private String shopname;
	private GoodsShelves mygoods;
	public Seller(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public int compareTo(Seller plo) {
		// TODO 自动生成的方法存根
		return 0;
	}
	public int Compareno(Seller pla){
		return 0;
	}

	public GoodsShelves getMygoods() {
		return mygoods;
	}

	public void setMygoods(GoodsShelves mygoods) {
		this.mygoods = mygoods;
	}
	

	
	
	
	

}
