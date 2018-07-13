package dto;

import java.io.Serializable;

public class Buyer implements Comparable<Buyer>, Serializable{
	String name;
	String password;
	Shopcart shopcart;
	
	public Buyer(){
		
	}
	public Shopcart getShopcart() {
		return shopcart;
	}
	public void setShopcart(Shopcart shopcart) {
		this.shopcart = shopcart;
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
	@Override
	public int compareTo(Buyer arg0) {
		// TODO 自动生成的方法存根
		return 0;
	}
	public int Compareno(Buyer pla){
		return 0;
	}
	
	
	

}
