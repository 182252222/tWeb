/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.demo.module.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.module.mapper.CityMapper;
import com.demo.module.service.CityService;
import com.demo.module.vo.City;
import com.github.pagehelper.PageHelper;

/**
 * @author create by hibeary@126.com
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    /* (non-Javadoc)
	 * @see com.demo.module.service.impl.CityService#getAll(com.demo.module.vo.City)
	 */
    @Override
	public List<City> getAll(City city) {
        if (city.getPage() != null && city.getRows() != null) {
            PageHelper.startPage(city.getPage(), city.getRows(), "id");
        }
        return cityMapper.selectAll();
    }

    /* (non-Javadoc)
	 * @see com.demo.module.service.impl.CityService#getById(java.lang.Integer)
	 */
    @Override
	public City getById(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc)
	 * @see com.demo.module.service.impl.CityService#deleteById(java.lang.Integer)
	 */
    @Override
	public void deleteById(Integer id) {
        cityMapper.deleteByPrimaryKey(id);
    }

    /* (non-Javadoc)
	 * @see com.demo.module.service.impl.CityService#save(com.demo.module.vo.City)
	 */
    @Override
	public void save(City country) {
        if (country.getId() != null) {
            cityMapper.updateByPrimaryKey(country);
        } else {
            cityMapper.insert(country);
        }
    }
}
