package main;

import dto.Buyer;
import dto.Goods;
import dto.Seller;
import ui.Buyerfirstpanel;
import ui.JFrameshop;
import ui.JPanelshop;
import ui.JpanelBuyer;
import ui.JpanelID;
import ui.JpanelSeller;
import uiBuyer.Buyersecondpanel;
import uiselller.Sellerstore;

public class ShopControl{
	
	final public static JFrameshop shop=new JFrameshop();
	
	public static JPanelshop panelshop = new JPanelshop();
	public static JpanelID Enter=new JpanelID();
	public static JpanelSeller seller=new JpanelSeller();
	public static JpanelBuyer buyer=new JpanelBuyer();
	public static Buyerfirstpanel buyerfirst;
	public static Buyersecondpanel buyersecond;
	public static Sellerstore store;
	
	
	public void Shopstart() { 
		shop.setContentPane(panelshop);
		//显示窗口
		shop.setVisible(true);
		try {
			Thread.sleep(2000); // 暂停，每一秒输出一次
			shop.setVisible(false);
		} catch (InterruptedException e) {
			return;
		}
		shop.setContentPane(Enter);
		shop.setVisible(true);
		
		
	}
	
	
	public  void turnseller(){
		shop.setContentPane(seller);
		shop.setVisible(true);
	}
	
	public  void turnbuyer(){
		shop.setContentPane(buyer);
		shop.setVisible(true);
	}
	
	public void turnFirst(Buyer b){
		buyerfirst=new Buyerfirstpanel(b);
		shop.setContentPane(buyerfirst);
		shop.setVisible(true);
	}
	
	
	public void turnSecond(Goods g){
		buyersecond =new Buyersecondpanel(g);
		shop.setContentPane(buyersecond);
		shop.setVisible(true);
	}
	
	public void turnThird(){
		
	}
	
	
	public void turnstore(Seller seller){
		store=new Sellerstore(seller);
		shop.setContentPane(store);
		shop.setVisible(true);
		
	}

}
