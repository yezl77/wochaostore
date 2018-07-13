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
		keyword.setFont(new Font("����", Font.BOLD, 20));
		keyword.setBounds(348, 67, 501, 35);
		this.add(keyword);
		
		ImageButton buttonsearch = new ImageButton(new ImageIcon("gradic/button/search.png"));
		buttonsearch.setLocation(848, 64);
		this.add(buttonsearch);
		buttonsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "���������ùؼ��ʡ�"+keyword.getText()+
						"�������Ʒ���뻻���ؼ��ʣ�");
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
				JOptionPane.showMessageDialog(null, "���ﳵ��ʱ������");
			}

		});

		ImageButton buttonshop = new ImageButton(new ImageIcon("gradic/button/shopping.png"));
		buttonshop.setLocation(1035, 370);
		this.add(buttonshop);
		buttonshop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�������������⣬����ʱ���ܹ��\n��ɲ��㣬����ԭ�¡�");
			}

		});
		
		
		ImageButton good1 = new ImageButton(new ImageIcon("gradic/button/good1.png"));
		good1.setLocation(280, 183);
		this.add(good1);
		good1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "����Ʒ�ݲ�����");
			}
		});
		
		ImageButton good2 = new ImageButton(new ImageIcon("gradic/button/good2.png"));
		good2.setLocation(810, 184);
		this.add(good2);
		good2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "����Ʒ�ݲ�����");
			}
		});
		
		
		ImageButton good3 = new ImageButton(new ImageIcon("gradic/button/good3.png"));
		good3.setLocation(280, 492);
		this.add(good3);
		good3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "����Ʒ�ݲ�����");
			}
		});
		
		
		ImageButton good4 = new ImageButton(new ImageIcon("gradic/button/good4.png"));
		good4.setLocation(453, 492);
		this.add(good4);
		good4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "����Ʒ�ݲ�����");
			}
		});
		
		
		ImageButton good5 = new ImageButton(new ImageIcon("gradic/button/good5.png"));
		good5.setLocation(453, 593);
		this.add(good5);
		good5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "����Ʒ�ݲ�����");
			}
		});
		
		ImageButton good6 = new ImageButton(new ImageIcon("gradic/button/good6.png"));
		good6.setLocation(627, 492);
		this.add(good6);
		good6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "����Ʒ�ݲ�����");
			}
		});
		
		ImageButton good7 = new ImageButton(new ImageIcon("gradic/button/good7.png"));
		good7.setLocation(627, 593);
		this.add(good7);
		good7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "����Ʒ�ݲ�����");
			}
		});
		
		ImageButton good8 = new ImageButton(new ImageIcon("gradic/button/good8.png"));
		good8.setLocation(810, 495);
		this.add(good8);
		good8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "����Ʒ�ݲ�����");
			}
		});
		
		ImageButton good9 = new ImageButton(new ImageIcon("gradic/button/good9.png"));
		good9.setLocation(980, 442);
		this.add(good9);
		good9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Goods g9=new Goods();
				g9.setName("NIKE�����Ϳ����˶�Ů��ů����Ť�������ܲ��������������������");
				g9.setPrice(49.50);g9.setDiscount(9.5);
				g9.setKind(7);g9.setSales(405);g9.setStock(8546);
				g9.setSeller("׿ϣ�˶�רӪ��");
				g9.setInformation("Ʒ�����ƣ�Nike/�Ϳ˹�ע ��Ʒ����\n����ʱ��: 2016���ļ�Ʒ��: Nike/�Ϳ��Ƿ��̳�ͬ��: ����ɫ����: ���̿��ɫ�ڹ�04101 ���̿��ɫ�׹�04010 ���̿��ɫ�׹�04601 ���̿��ɫ�׹�04402 ���̿õ��׹�04639 ���̿ī���̹�04313 ���̿�����̹�04392 �������ɫ�ڹ�05101 �������ɫ����05839 �������ɫ�׹�05010 �������ɫ�׹�05601 ����������ȹ�05481 �������ɫ�ڹ�05078 �������ɫ����05487 �������ɫ�ڹ�05710 �����ī���̹�05313 ����������׹�05416 ����������̹�05392����: NNN04010OS��������: �����˶�������Ŀ: ��ë�� ƹ���� ���� ���� ���� ̨�� ���� �߶��� ���� ������ ���г� �ֻ� �٤ �赸 ����� F1���� ���� ��е���� ���� ���Ͻ��� ��������: ����2ֻװ|�����������۷�5Ԫ��");
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
					JOptionPane.showMessageDialog(null, "��ѡ�����Ʒ��ʱ������");
				}

			});
		}

		JLabel buyername = new JLabel(thebuy.getName());
		buyername.setForeground(Color.green);
		buyername.setFont(new Font("����", 0, 11));
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
