package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameshop extends JFrame {
	
	public JFrameshop(){
		this.setTitle("sc");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit  toolkit = Toolkit.getDefaultToolkit();
		Dimension screen=toolkit.getScreenSize();
		int sw=(int)(screen.getWidth()-20);
		int sh=(int)(screen.getHeight()-40);
		this.setSize(sw,sh);
		//System.out.println("w:"+sw);1346
		//System.out.println("h:"+sh);728
		int w=(int )(screen.getWidth()-this.getWidth())>>1;
		int h=(int )(screen.getHeight()-this.getHeight())>>1;
		
		this.setResizable(false);
		
		this.setLocation(w,0);
		
		
		
	}

}
