package ui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import main.ShopControl;

public class JpanelID extends JPanel{
	private static Image img=new ImageIcon("gradic/identity.png").getImage();
	
	//ShopRun runs=new ShopRun();
	
	public JpanelID(){

		initlayer();

	}

	private void initlayer() {
		this.setLayout(null);
		final ImageButton buttonbuyer = new ImageButton(new ImageIcon("gradic/buyer.png")); 
		
		
		buttonbuyer.setLocation(914, 302); 
        this.add(buttonbuyer); 
        final ImageButton buttonseller = new ImageButton(new ImageIcon("gradic/seller.png"));
        buttonseller.setLocation(914, 384);
        this.add(buttonseller);
        
        
        buttonseller.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
           
              newseller();
            	
            	
            }
        });
        buttonbuyer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            
            	newbuyer();
            	
            	
            }
        });
	}
	
	
	public void newseller(){
		ShopControl run=new ShopControl();
		this.setVisible(false);
		run.turnseller();
	}
	public void newbuyer(){
		ShopControl run=new ShopControl();
		this.setVisible(false);
		run.turnbuyer();
		
	}
	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(Img.BACKGROUND_ID, 0, 0,1346, 728,null);
		this.requestFocus();
		
		
		
		
		
	
	}

}
