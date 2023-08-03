package com.bookmarket.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bookmarket.domain.Cart;

@Repository
public class CartRepositoryImpl implements CartRepository {
	
	private Map<String, Cart> listOfCarts;
	
	public CartRepositoryImpl() {
		listOfCarts = new HashMap<String, Cart>();
	}
	
	public Cart create(Cart cart) {
		if (listOfCarts.keySet().contains(cart.getCartId())) {
			throw new IllegalArgumentException(String.format("장바구니 Id가 이미 존재합니다.", cart.getCartId()));
		}
		
		listOfCarts.put(cart.getCartId(), cart);
		return cart;
	}
	
	public Cart read(String cartId) {
		return listOfCarts.get(cartId);	
	}
}
