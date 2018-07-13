package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dto.Buyer;
import dto.Seller;
import main.ShopControl;
import service.Shopservice;

public class JpanelSeller extends JPanel{

private static List<String> ids=new ArrayList<String>();

public static Shopservice shopservice = new Shopservice();
private static Random random = new Random();
private static final int MAX_TYPE = 19;
public  static int idrandom=random.nextInt(MAX_TYPE);
private static int i=idrandom;


	public JpanelSeller(){
		idinit();

		initlayer();

	}
	

	private void initlayer() {
		this.setLayout(null);
		
		final ImageButton buttonregister = new ImageButton(new ImageIcon("gradic/button/registe.png"));
        buttonregister.setLocation(891+34, 175+272); 
        this.add(buttonregister); 
        
        final ImageButton buttonlogin = new ImageButton(new ImageIcon("gradic/button/login.png"));
        buttonlogin.setLocation(891+205,175+272);
        this.add(buttonlogin);
        
        
        JTextField name = new JTextField(50);
		name.setBackground(Color.white);
		name.setFont(new Font("宋体",Font.BOLD,20));
		name.setBounds(891+100, 175+100, 215, 30);
		this.add(name);
		
		JTextField password = new JTextField(50);
		password.setBackground(Color.white);
		password.setFont(new Font("宋体",Font.BOLD,20));
		password.setBounds(891+100, 175+155, 215, 30);
		this.add(password);
		
		JTextField idcode = new JTextField(50);
		idcode.setBackground(Color.white);
		idcode.setFont(new Font("宋体",Font.BOLD,20));
		idcode.setBounds(891+130, 175+205, 110, 30);
		this.add(idcode);
        
        
        buttonregister.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        				// TODO 自动生成的方法存根
        				String n = name.getText().trim();
        				String pw=password.getText().trim();
        				String id=idcode.getText().trim();
        				Seller seller=new Seller();
        				seller.setName(n);
        				seller.setPassword(pw);
        				shopservice.saveseller(seller);
        				if (!n.equals("")&& !pw.equals("")) {

        					if (id.equals(ids.get(i))) {
        						JOptionPane.showMessageDialog(null, "卖家注册成功");
        						name.setText("");
        						password.setText("");
        						idcode.setText("");
        						name.requestFocus();
        						newpanel();

        					} else {
        						JOptionPane.showMessageDialog(null, "验证码错误");
        						idcode.setText("");
        						idcode.requestFocus();
        						newpanel();
        					}
        				}
        				else  JOptionPane.showMessageDialog(null, "密码姓名不能为空");
        				}
            
        });
        buttonlogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	
            	String n = name.getText().trim();
				String pw=password.getText().trim();
				String id=idcode.getText().trim();
				Seller seller=new Seller();
				seller.setName(n);
				seller.setPassword(pw);
				if(shopservice.loginseller(seller)){
					if (id.equals(ids.get(i))) {
						JOptionPane.showMessageDialog(null, "卖家登录成功");
						newsellerfirst(seller);

					} else {
						JOptionPane.showMessageDialog(null, "验证码错误");
						newpanel();
						idcode.setText("");
						idcode.requestFocus();

					}
				} else {
					JOptionPane.showMessageDialog(null, "卖家登录失败");
					name.setText("");
					password.setText("");
					idcode.setText("");
					name.requestFocus();
					newpanel();

				}
           
              
            	
            	
            }
        });
	}
	
	
	public void newpanel() {
		i = random.nextInt(MAX_TYPE);
		this.repaint();
	}
        
	
	public void newsellerfirst(Seller seller) {
		ShopControl run = new ShopControl();
		this.setVisible(false);
		run.turnstore(seller);
	}
        /*name.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if (ch <= '0' || ch >= '9')
					e.consume();
				
			}
			
		});
	}*/
	
	
	/*public void newFirst(){
		ShopControl run=new ShopControl();
		this.setVisible(false);
		run.turnseller();
	}*/
	
	public void idinit(){
		ids.add("UYTy");ids.add("39DM");ids.add("5PyN");ids.add("P7TC");ids.add("7T4Q");
		ids.add("HYFV");ids.add("9dGD");ids.add("QpwL");ids.add("gMNg");ids.add("FEXY");
		ids.add("UVYC");ids.add("AQ7R");ids.add("yBFU");ids.add("9L3V");ids.add("88kA");
		ids.add("EQgy");ids.add("xM3L");ids.add("Rpvc");ids.add("d3MF");ids.add("RQCH");
		
	}
	
	
	
	
	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Img.BACKGROUND_ID, 0, 0,1346, 728,null);
		g.drawImage(Img.BACKGROUND_SELLERID, 891, 175,null);
		g.drawImage(Img.IDCODES, 891+130+115, 175+205,891+130+115+80,175+205+40,0+80*i,0,80+80*i,40,null);
		this.requestFocus();
		
		
	
	}

}
