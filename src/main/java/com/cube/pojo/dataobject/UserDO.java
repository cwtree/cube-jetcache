package com.cube.pojo.dataobject;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年4月25日
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class UserDO implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 7837566182603666437L;

	private String username;
	private Integer age;
	private String address;

}
