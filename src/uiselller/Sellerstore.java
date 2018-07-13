package uiselller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import dto.Seller;
import ui.Img;

public class Sellerstore extends JPanel{
	
	
	
	public static Seller seller=new Seller();
	
	public Sellerstore(Seller seller){
		this.seller=seller;
		initial();
		
	}
	
	public void initial(){
		JLabel sellername = new JLabel(seller.getName());
		sellername.setForeground(Color.green);
		sellername.setFont(new Font("ËÎÌו", 0, 20));
		sellername.setBounds(1105, 265, 100, 20);
		this.add(sellername);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Img.SELLERSTORE, 0, 0,null);
	

	}
}