package ui;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Img {
	public Img(){
		buttonadd();
		
	}
	
	public static Image BACKGROUND_START=new ImageIcon("gradic/background/start.png").getImage();
	//程序开始界面背景
	public static Image BACKGROUND_ID=new ImageIcon("gradic/background/identity.png").getImage();
	//登录界面选择背景
	public static Image BACKGROUND_BUYERID=new ImageIcon("gradic/background/buyerID.png").getImage();
	//买家登录界面背景
	public static Image BACKGROUND_SELLERID=new ImageIcon("gradic/background/sellerID.png").getImage();
	//卖家登录界面背景	
	public static Image BUYERFIRST=new ImageIcon("gradic/background/buyerfirst.png").getImage();
	
	public static Image BUYERSECOND=new ImageIcon("gradic/background/buysecond.png").getImage();
	
	public static Image SELLERSTORE=new ImageIcon("gradic/background/store.png").getImage();
	
	public static Image IDCODES=new ImageIcon("gradic/other/idcodes.png").getImage();
	
	public static Image BUTTON1=new ImageIcon("gradic/button/button1.png").getImage();
	public static Image BUTTON2=new ImageIcon("gradic/button/button2.png").getImage();
	public static Image BUTTON3=new ImageIcon("gradic/button/button3.png").getImage();
	public static Image BUTTON4=new ImageIcon("gradic/button/button4.png").getImage();
	public static Image BUTTON5=new ImageIcon("gradic/button/button5.png").getImage();
	public static Image BUTTON6=new ImageIcon("gradic/button/button6.png").getImage();
	public static Image BUTTON7=new ImageIcon("gradic/button/button7.png").getImage();
	public static Image BUTTON8=new ImageIcon("gradic/button/button8.png").getImage();
	public static Image BUTTON9=new ImageIcon("gradic/button/button9.png").getImage();
	public static Image BUTTON10=new ImageIcon("gradic/button/button10.png").getImage();
	public static Image BUTTON11=new ImageIcon("gradic/button/button11.png").getImage();
	public static Image BUTTON12=new ImageIcon("gradic/button/button12.png").getImage();
	public static Image BUTTON13=new ImageIcon("gradic/button/button13.png").getImage();
	public static Image BUTTON14=new ImageIcon("gradic/button/button14.png").getImage();
	public static Image BUTTON15=new ImageIcon("gradic/button/button15.png").getImage();
	public static Image BUTTON16=new ImageIcon("gradic/button/button16.png").getImage();
	public static Image BUTTON_BUYER=new ImageIcon("gradic/button/buyer.png").getImage();
	public static Image BUTTON_SELLER=new ImageIcon("gradic/button/seller.png").getImage();
	public static Image BUTTON_LOGIN=new ImageIcon("gradic/button/login.png").getImage();
	public static Image BUTTON_REGISTE=new ImageIcon("gradic/button/registe.png").getImage();
	
	
	public  static List<ImageButton> buttons=new ArrayList<ImageButton>();
	public static void buttonadd(){
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button1.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button2.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button3.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button4.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button5.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button6.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button7.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button8.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button9.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button10.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button11.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button12.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button13.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button14.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button15.png")));
		buttons.add(new ImageButton(new ImageIcon("gradic/button/button16.png")));
		
		
	}
	
	
}
