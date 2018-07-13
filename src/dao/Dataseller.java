package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dto.Seller;

public class Dataseller implements Data {
	private static final String FILES_PATH ="save/sellerdata.dat";

	@Override
	public List<Seller> loadData() {
		List<Seller> sellers=null;
		ObjectInputStream ois=null;
		try {
			ois = new ObjectInputStream(new FileInputStream(FILES_PATH));
			sellers=(List<Seller>)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				ois.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return sellers;
	}

	@Override
	public void saveData(List<Seller>sellers) {
		// TODO 自动生成的方法存根
		ObjectOutputStream oos=null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILES_PATH));
			oos.writeObject(sellers);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				oos.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
	}
	
/*	public static void main(String[] args) {
		Dataseller db=new Dataseller();
		List<Seller> bs = new ArrayList<Seller>();
		 Seller b1=new Seller();
		  b1.setName("叶镇亮");b1.setPassword("19961118");
		  Seller b2=new Seller();
		  b2.setName("陈奕敏");b2.setPassword("123456");
		  Seller b3=new Seller();
		  b3.setName("习近平");b3.setPassword("999999");
		  bs.add(b1);
		  bs.add(b2);
		  bs.add(b3);
		  db.saveData(bs);
		  List<Seller> b = new ArrayList<Seller>(); 
		  b=db.loadData();
		  for(Seller d:b){
			  System.out.println(d.getName()+"  "+d.getPassword());
		  }	
	}*/
	


}
