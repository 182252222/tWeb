/**
 * 
 */
package com.demo.module.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.module.vo.User;

/**
 * @author create by hibeary@126.com 2016年2月23日 下午1:59:48
 *
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
	  @RequestMapping("/{id}")
	    private User view(@PathVariable("id") int id) {
	        User user = new User();
	        user.setUserId(id);
	        user.setName("zhang");
	        return user;
	    }


}