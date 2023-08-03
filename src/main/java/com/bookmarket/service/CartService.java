package com.bookmarket.service;

import com.bookmarket.domain.Cart;

public interface CartService {
	Cart create(Cart cart);
	Cart read(String cartId);
}
