package com.esq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esq.util.CommonUtil;

/**
  * webƽ̨ͳһ���
 * @author esqabc
 * @Create 2019-11-11 11:11:11
 * @Website www.esqabc.com
 * @WeChat 110
 */
@Controller
public class WebController{
	private static Logger log = LoggerFactory.getLogger(WebController.class);
	/**
	 * ��¼ҳ��
	 */
	@RequestMapping("/login")
	public String loginPage() {
		System.out.println("����������¼�ˣ��������һ��==��"+CommonUtil.ESQABC_WEBSITE);
		log.info("����������¼�ˣ��������һ��==��"+CommonUtil.ESQABC_WEBSITE);
		log.error("����������¼�ˣ��������һ��==��"+CommonUtil.ESQABC_WEBSITE);
		return "login";
	}
	/**
	 * ��ҳҳ��
	 */
	@RequestMapping("/index")
	public String indexPage() {
		System.out.println("����������ҳ�ˣ��������һ��==��"+CommonUtil.ESQABC_WEBSITE);
		log.info("����������ҳ�ˣ��������һ��==��"+CommonUtil.ESQABC_WEBSITE);
		log.error("����������ҳ�ˣ��������һ��==��"+CommonUtil.ESQABC_WEBSITE);
		return "index";
	}
}
