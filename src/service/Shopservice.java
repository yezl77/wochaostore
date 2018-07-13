package service;

import java.util.List;

import dao.Databuyer;
import dao.Dataseller;
import dto.Buyer;
import dto.Seller;

public class Shopservice {
	
	
	public Shopservice(){
		
		
	}
	
	public void saveseller(Seller seller){
		Dataseller datas=new Dataseller();
		List<Seller> sellers=datas.loadData();
		sellers.add(seller);
		datas.saveData(sellers);
	}
	
	public void savebuyer(Buyer buyer){
		Databuyer datab=new Databuyer();
		List<Buyer> buyers=datab.loadData();
		buyers.add(buyer);
		datab.saveData(buyers);
	}
	
	
	public boolean loginseller(Seller seller){
		Dataseller datas=new Dataseller();
		List<Seller> sellers=datas.loadData();
		for(Seller s:sellers){
			if(seller.getName().equals(s.getName())&&
					seller.getPassword().equals(s.getPassword()))
				return true;
		}
		return false;
	}
	
	public boolean loginbuyer(Buyer buyer){
		Databuyer datas=new Databuyer();
		List<Buyer> buyers=datas.loadData();
		for(Buyer s:buyers){
			if(buyer.getName().equals(s.getName())&&
					buyer.getPassword().equals(s.getPassword()))
				return true;
		}
		return false;
	}


	
	
	
	
	

}
