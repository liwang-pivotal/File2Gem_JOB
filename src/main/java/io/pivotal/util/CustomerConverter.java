package io.pivotal.util;

import io.pivotal.domain.Customer;

import org.springframework.core.convert.converter.Converter;

public class CustomerConverter implements Converter<Customer,String>{

	@Override
	public String convert(Customer customer) {
		return customer.getId();
	}
	
}
