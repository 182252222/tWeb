/**
 * 
 */
package com.demo.module.service;

import java.util.List;

import com.demo.module.vo.UserInfo;

/**
 * @author create by hibeary@126.com 2016年2月23日 下午3:46:34
 *
 */
public interface UserInfoService {

	List<UserInfo> getAll(UserInfo UserInfo);

	UserInfo getById(Integer id);

	void deleteById(Integer id);

	void save(UserInfo country);

}