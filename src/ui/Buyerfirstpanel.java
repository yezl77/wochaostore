package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dto.Buyer;
import dto.Goods;
import main.ShopControl;
import service.Shopservice;

public class Buyerfirstpanel extends JPanel {
	
	public static Image BACKGROUND_START=new ImageIcon("gradic/background/.png").getImage();

	public static Shopservice shopservice = new Shopservice();
	private static Random random = new Random();
	private static final int MAX_TYPE = 6;
	public static int idrandom = random.nextInt(MAX_TYPE);

	public static Buyer thebuy = new Buyer();

	public Buyerfirstpanel(Buyer buyer) {
		thebuy = buyer;
		initlayer();
	}

	private void initlayer() {
		this.setLayout(null);
		
		
		JTextField keyword = new JTextField(50);
		keyword.setBackground(Color.white);
		keyword.setFont(new Font("宋体", Font.BOLD, 20));
		keyword.setBounds(348, 67, 501, 35);
		this.add(keyword);
		
		ImageButton buttonsearch = new ImageButton(new ImageIcon("gradic/button/search.png"));
		buttonsearch.setLocation(848, 64);
		this.add(buttonsearch);
		buttonsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "搜索不到该关键词“"+keyword.getText()+
						"”相关商品，请换个关键词！");
				keyword.setText("");
				keyword.requestFocus();
			}

		});
		
		
		int i = 0;
		ImageButton buttoncart = new ImageButton(new ImageIcon("gradic/button/mycart.png"));
		buttoncart.setLocation(1035, 305);
		this.add(buttoncart);
		buttoncart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "购物车暂时不存在");
			}

		});

		ImageButton buttonshop = new ImageButton(new ImageIcon("gradic/button/shopping.png"));
		buttonshop.setLocation(1035, 370);
		this.add(buttonshop);
		buttonshop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "因您的信用问题，您暂时不能购物，\n造成不便，敬请原谅。");
			}

		});
		
		
		ImageButton good1 = new ImageButton(new ImageIcon("gradic/button/good1.png"));
		good1.setLocation(280, 183);
		this.add(good1);
		good1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "该商品暂不出售");
			}
		});
		
		ImageButton good2 = new ImageButton(new ImageIcon("gradic/button/good2.png"));
		good2.setLocation(810, 184);
		this.add(good2);
		good2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "该商品暂不出售");
			}
		});
		
		
		ImageButton good3 = new ImageButton(new ImageIcon("gradic/button/good3.png"));
		good3.setLocation(280, 492);
		this.add(good3);
		good3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "该商品暂不出售");
			}
		});
		
		
		ImageButton good4 = new ImageButton(new ImageIcon("gradic/button/good4.png"));
		good4.setLocation(453, 492);
		this.add(good4);
		good4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "该商品暂不出售");
			}
		});
		
		
		ImageButton good5 = new ImageButton(new ImageIcon("gradic/button/good5.png"));
		good5.setLocation(453, 593);
		this.add(good5);
		good5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "该商品暂不出售");
			}
		});
		
		ImageButton good6 = new ImageButton(new ImageIcon("gradic/button/good6.png"));
		good6.setLocation(627, 492);
		this.add(good6);
		good6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "该商品暂不出售");
			}
		});
		
		ImageButton good7 = new ImageButton(new ImageIcon("gradic/button/good7.png"));
		good7.setLocation(627, 593);
		this.add(good7);
		good7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "该商品暂不出售");
			}
		});
		
		ImageButton good8 = new ImageButton(new ImageIcon("gradic/button/good8.png"));
		good8.setLocation(810, 495);
		this.add(good8);
		good8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "该商品暂不出售");
			}
		});
		
		ImageButton good9 = new ImageButton(new ImageIcon("gradic/button/good9.png"));
		good9.setLocation(980, 442);
		this.add(good9);
		good9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Goods g9=new Goods();
				g9.setName("NIKE护腕耐克男运动女保暖篮球扭伤网球跑步擦汗健身吸汗护手腕带");
				g9.setPrice(49.50);g9.setDiscount(9.5);
				g9.setKind(7);g9.setSales(405);g9.setStock(8546);
				g9.setSeller("卓希运动专营店");
				g9.setInformation("品牌名称：Nike/耐克关注 产品参数\n上市时间: 2016年夏季品牌: Nike/耐克是否商场同款: 是颜色分类: 【短款】白色黑钩04101 【短款】黑色白钩04010 【短款】红色白钩04601 【短款】蓝色白钩04402 【短款】玫红白钩04639 【短款】墨绿绿钩04313 【短款】深绿绿钩04392 【长款】白色黑钩05101 【长款】橙色蓝钩05839 【长款】黑色白钩05010 【长款】红色白钩05601 【长款】湖兰橙钩05481 【长款】灰色黑钩05078 【长款】兰色蓝钩05487 【长款】绿色黑钩05710 【长款】墨绿绿钩05313 【长款】深蓝白钩05416 【长款】深绿绿钩05392货号: NNN04010OS护具种类: 护腕运动户外项目: 羽毛球 乒乓球 网球 足球 篮球 台球 棒球 高尔夫 壁球 保龄球 自行车 轮滑 瑜伽 舞蹈 橄榄球 F1赛车 排球 器械健身 武术 冰上健身 其他尺码: 均码2只装|〖买两件评价返5元〗");
				buyersecondJpanel(g9);
			}
		});

		Img.buttonadd();

		for (ImageButton b : Img.buttons) {
			b.setLocation(80, 170 + i * 31);
			this.add(b);
			i++;
		}

		for (ImageButton b : Img.buttons) {
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "你选择的商品暂时不存在");
				}

			});
		}

		JLabel buyername = new JLabel(thebuy.getName());
		buyername.setForeground(Color.green);
		buyername.setFont(new Font("宋体", 0, 11));
		buyername.setBounds(1105, 265, 100, 10);
		this.add(buyername);
	}
	
	
	public void buyersecondJpanel(Goods g){
		ShopControl run = new ShopControl();
		this.setVisible(false);
		run.turnSecond(g);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(BACKGROUND_START, 0, 0,null);
		/*
		 * g.drawImage(img, 891, 175,null); g.drawImage(idcode, 891+130+115,
		 * 175+205,null); this.requestFocus();
		 */

	}

}
