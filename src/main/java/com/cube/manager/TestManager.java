package com.cube.manager;

import com.cube.pojo.dataobject.UserDO;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年4月25日
 */
public interface TestManager {

	/**
	 * desc
	 * 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param id
	 * @return
	 */
	UserDO findUserById(Long id);

	/**
	 * desc
	 * 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param bean
	 * @return
	 */
	int saveUser(UserDO bean);

	/**
	 * desc
	 * 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param bean
	 * @return
	 */
	int deleteUser(UserDO bean);

	/**
	 * desc
	 * 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param bean
	 * @return
	 */
	int updateUser(UserDO bean);

}
