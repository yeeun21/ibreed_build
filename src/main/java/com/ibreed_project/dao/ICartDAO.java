package com.ibreed_project.dao;

import java.util.ArrayList;

import com.ibreed_project.model.CartVO;

public interface ICartDAO {
	
	// 장바구니 리스트 조회 
	public ArrayList<CartVO> listAllCart(String user_id);
	
	// 장바구니 상품 추가
	public void addCartPrd(CartVO vo);
	
	// 장바구니 수정
	public void updateCart(CartVO vo);
	
	// 장바구니 상품 수량 1씩 변경
	public void updateCartQuantity(String user_id, int product_id, int quantity);
	
	
	// 장바구니 상품 삭제
	public void deleteCartItem(String user_id, int product_id);
	
	// 장바구니 전체 삭제
	public void deleteAllCart();
	
	// 장바구니 품절 삭제
	
	// 장바구니 전체 가격 조회
	public Double getTotalCartPrice(String user_id);
	
	

}
