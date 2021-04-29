package com.cube.manager.impl;

import org.springframework.stereotype.Component;

import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.cube.manager.TestManager;
import com.cube.pojo.dataobject.UserDO;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年4月25日
 */
@Component
@Slf4j
public class TestManagerImpl implements TestManager {

	@Cached(name = "com.cube.user#", key = "#id", expire = 100, cacheType = CacheType.REMOTE)
	@Override
	public UserDO findUserById(Long id) {
		// TODO Auto-generated method stub
		UserDO ud = UserDO.builder().username("chiwei-find").age(31).address("杭州").build();
		log.info("查询UserDO {}", ud);
		return ud;
	}

	@Override
	public int saveUser(UserDO bean) {
		// TODO Auto-generated method stub
		log.info("保存UserDO {}", bean);
		return 1;
	}

	@Override
	public int deleteUser(UserDO bean) {
		// TODO Auto-generated method stub
		UserDO ud = UserDO.builder().username("chiwei-delete").age(31).address("杭州").build();
		log.info("删除UserDO {}", ud);
		return 1;
	}

	@Override
	public int updateUser(UserDO bean) {
		// TODO Auto-generated method stub
		UserDO ud = UserDO.builder().username("chiwei-delete").age(31).address("杭州").build();
		log.info("更新UserDO {}", ud);
		return 1;
	}

}
