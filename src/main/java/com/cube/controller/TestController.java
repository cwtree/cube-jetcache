package com.cube.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cube.manager.TestManager;
import com.cube.pojo.dataobject.UserDO;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年4月19日
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class TestController {

	@Resource
	private TestManager testManager;

	/**
	 * 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param string
	 * @return
	 */
	@GetMapping("/test")
	public String test() {
		UserDO ud = UserDO.builder().username("chiwei-save").age(31).address("杭州").build();
		testManager.saveUser(ud);
		ud.setUsername("chiwei-controller-update-test");
		testManager.updateUser(ud);
		UserDO bean = testManager.findUserById(1L);
		log.info("controller查询 {}", bean);
		testManager.deleteUser(bean);
		return "OK";
	}

}
