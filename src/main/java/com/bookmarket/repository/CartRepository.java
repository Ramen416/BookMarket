package com.bookmarket.repository;

import com.bookmarket.domain.Cart;

public interface CartRepository {
	
	Cart create(Cart cart);
	Cart read(String cartId);
	
	
}
