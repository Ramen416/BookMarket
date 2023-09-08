package com.bookmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bookmarket.domain.Cart;
import com.bookmarket.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	public Cart create(Cart cart) {
		return cartRepository.create(cart);
	}
	
	public Cart read(String cartId) {
		return cartRepository.read(cartId);
	}
	
	public void update(String cartId, Cart cart) {
		cartRepository.update(cartId, cart);
	}
	
	public void delete(String cartId) {
		cartRepository.delete(cartId);
	}
	
	
}
