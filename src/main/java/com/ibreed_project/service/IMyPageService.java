package com.ibreed_project.service;

import java.util.ArrayList;

import com.ibreed_project.model.MyPageVO;

public interface IMyPageService {

	public int countPayment(String user_id);
	
	public ArrayList<MyPageVO> selectPayment(String user_id);
	
	public ArrayList<MyPageVO> selectOrder(int pay_number);
	
}
