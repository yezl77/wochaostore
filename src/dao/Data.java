package dao;

import java.util.List;

import dto.Seller;

public interface Data {
	/**
	 * 读取数据
	 * @return
	 */
	public List<Seller> loadData();
	
	/**
	 * 保存数据
	 * @param player
	 */
	public void saveData(List<Seller> seller);

}
