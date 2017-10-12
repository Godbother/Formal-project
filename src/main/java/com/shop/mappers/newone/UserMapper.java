package com.shop.mappers.newone;

import com.shop.pojo.entity.User;

import java.util.List;

public interface UserMapper {
	
	/**
	 * ���ݲ����û���Ϣ��ȡ�ض��û�����(ID���û��������ﳵid������id)��infoΪ���򷵻�ȫ��user
	 * @param info
	 * @return
	 */
	public List<User> findUserByInfo(User info);
	/**
	 * ����idɾ���û�������ɾ������
	 * @param id
	 * @return integer
	 */
	public Integer deluser(Integer id);
	/**
	 * ������Ҫ�޸ĺ��user����id����Ϊ�գ�idΪΨһ��ʶ
	 * @param info
	 * @return 
	 */
	public Integer changeuser(User info);
}
