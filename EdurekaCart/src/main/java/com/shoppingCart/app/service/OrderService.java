package com.shoppingCart.app.service;

import com.shoppingCart.app.model.Cart;

public interface OrderService {

	Long save(Cart cart);
	void add(Long idCart, Long idProduct, Integer quantity);
	Long ordered(Long idCart);

}
