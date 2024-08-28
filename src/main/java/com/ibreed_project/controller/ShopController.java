package com.ibreed_project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibreed_project.model.ProductVO;
import com.ibreed_project.service.ProductService;

@Controller
public class ShopController {

	@Autowired
	ProductService prdService;

	@RequestMapping("shop")
	public String viewIndex(Model model) {

		ArrayList<ProductVO> topTenList = prdService.selectTopTen();
		ArrayList<ProductVO> newItemList = prdService.selectNewItem();
		ArrayList<ProductVO> bestItemList = prdService.bestItem();
		ArrayList<ProductVO> soldOutItemList = prdService.soldOutItem();

		model.addAttribute("topTenList", topTenList);
		model.addAttribute("newItemList", newItemList);
		model.addAttribute("bestItemList", bestItemList);
		model.addAttribute("soldOutItemList", soldOutItemList);

		return "shop/shop_main";
	}

	// 장바구니 페이지 (예은)
	@RequestMapping("/shop/cart")
	public String viewShoppingCart() {

		return "shop/shopping_cart";
	}

	// 주문 페이지 (예은)
	@RequestMapping("/shop/order")
	public String viewOrderPage() {

		return "shop/order";
	}

	// 주문 확인 페이지 (예은)
	@RequestMapping("/shop/order_confirm")
	public String viewOrderConfirmPage() {

		return "shop/order_confirm";
	}
	@RequestMapping("shop_detail")
	public String detailView() {
		return "shop/shop_detail";
	}
	
	@RequestMapping("shop_list")
	public String listView(Model model) {
		
		ArrayList<ProductVO> viewAllPrd = prdService.viewAllPrd();
		
		model.addAttribute("viewAllPrd", viewAllPrd);
		
		return "shop/shop_list";
	}
}
