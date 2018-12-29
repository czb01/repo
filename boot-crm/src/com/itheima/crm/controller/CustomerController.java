package com.itheima.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 客户信息请求处理
 * @author 曹智博
 *
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

	@RequestMapping("list")
	public String list(){
		return "customer";
	}
	
}
