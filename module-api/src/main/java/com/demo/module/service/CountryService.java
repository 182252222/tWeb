/**
 * 
 */
package com.demo.module.service;

import java.util.List;

import com.demo.module.vo.Country;

/**
 * @author create by hibeary@126.com 2016年2月23日 下午3:45:40
 *
 */
public interface CountryService {

	List<Country> getAll(Country country);

	Country getById(Integer id);

	void deleteById(Integer id);

	void save(Country country);

}