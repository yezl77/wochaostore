package dao;

import java.util.List;

import dto.Seller;

public interface Data {
	/**
	 * ��ȡ����
	 * @return
	 */
	public List<Seller> loadData();
	
	/**
	 * ��������
	 * @param player
	 */
	public void saveData(List<Seller> seller);

}
