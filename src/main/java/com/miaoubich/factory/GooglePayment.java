package com.miaoubich.factory;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class GooglePayment implements Payment{

	@Override
	public void pay(BigDecimal amount) {
		System.out.println(
				MessageFormat.format("Amount ${0} successfully paid using Google Pay", amount));
	}
}
