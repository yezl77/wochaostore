package dto;

import java.util.List;

public class Shopcart {
	private List<Goods> car;
	
	private double allprice;
	
	private int allnumber;

	public List<Goods> getCar() {
		return car;
	}

	public void setCar(List<Goods> car) {
		this.car = car;
	}

	public double getAllprice() {
		return allprice;
	}

	public void setAllprice(double allprice) {
		this.allprice = allprice;
	}

	public int getAllnumber() {
		return allnumber;
	}

	public void setAllnumber(int allnumber) {
		this.allnumber = allnumber;
	} 
	
	
	

}
