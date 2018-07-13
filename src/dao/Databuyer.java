package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dto.Buyer;

public class Databuyer {
	private static final String FILES_PATH = "save/buyerdata.dat";

	public List<Buyer> loadData() {
		List<Buyer> buyers = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(FILES_PATH));
			buyers = (List<Buyer>) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		return buyers;
	}

	public  void saveData(List<Buyer> buyers) {
		// TODO �Զ����ɵķ������
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILES_PATH));
			oos.writeObject(buyers);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}

	}
	
	
/*	public static void main(String[] args) {
		Databuyer db=new Databuyer();
		List<Buyer> bs = new ArrayList<Buyer>();
		  Buyer b1=new Buyer();
		  b1.setName("Ҷ����");b1.setPassword("19961118");
		  Buyer b2=new Buyer();
		  b2.setName("������");b2.setPassword("123456");
		  Buyer b3=new Buyer();
		  b3.setName("ϰ��ƽ");b3.setPassword("999999");
		  bs.add(b1);
		  bs.add(b2);
		  bs.add(b3);
		  db.saveData(bs);
		  List<Buyer> b = new ArrayList<Buyer>(); 
		  b=db.loadData();
		  for(Buyer d:b){
			  System.out.println(d.getName()+"  "+d.getPassword());
		  }	
	}
*/

}
