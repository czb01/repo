package com.itheima.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * �ͻ���Ϣ������
 * @author ���ǲ�
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
