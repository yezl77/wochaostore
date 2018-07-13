package uiBuyer;

import java.awt.Graphics;

import javax.swing.JPanel;

import dto.Goods;
import ui.Img;

public class Buyersecondpanel extends JPanel{
	
	public Buyersecondpanel(Goods good){
		
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Img.BUYERSECOND, 0, 0,null);
	

	}
}
