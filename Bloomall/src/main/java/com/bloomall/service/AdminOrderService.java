package com.bloomall.service;

import java.util.List;
import java.util.Map;

import com.bloomall.domain.AdminOrderListVO;

public interface AdminOrderService {

	// 존재하는 주문번호 가져오기
	public List<Integer> getOrdIDX() throws Exception;
	
	// 주문 목록
	public List<AdminOrderListVO> orderList(Map<String, Object> map) throws Exception;
	
	// 주문 총 개수
	public int orderTotal() throws Exception;
	
	// 주문 당 주문상품 종류 개수
	public int productCount(int ord_idx) throws Exception;
	
	// 주문 상태 변경
	public void updateState(int ord_idx, int ord_state) throws Exception;
	
}
