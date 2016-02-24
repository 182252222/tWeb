/**
 * 
 */
package com.demo.module.service;

import java.util.List;

import com.demo.module.vo.City;

/**
 * @author create by hibeary@126.com 2016年2月23日 下午3:44:57
 *
 */
public interface CityService {

	List<City> getAll(City city);

	City getById(Integer id);

	void deleteById(Integer id);

	void save(City country);

}