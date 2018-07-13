package dto;

import java.util.List;

public class GoodsShelves {
    private List<Goods> shelves;
	
	private double allprice;
	
	private int allnumber;

	public List<Goods> getShelves() {
		return shelves;
	}

	public void setShelves(List<Goods> shelves) {
		this.shelves = shelves;
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
