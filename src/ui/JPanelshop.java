package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelshop extends JPanel {
	
	public JPanelshop(){

		initlayer();

	}

	private void initlayer() {

	}
	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(Img.BACKGROUND_START, 0, 0,1346, 728,null);
		this.requestFocus();
	
	}
}
