/**
 * 
 */
package com.demo.module.vo;

import java.io.Serializable;

/**
 * @author create by hibeary@126.com 2016年2月19日 下午2:51:23
 *
 */
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2264779435594961196L;

	private Integer userId;

    private String name;

    private String passWd;

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the passWd
	 */
	public String getPassWd() {
		return passWd;
	}

	/**
	 * @param passWd the passWd to set
	 */
	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}

}
