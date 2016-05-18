package io.pivotal.util;

import io.pivotal.domain.Customer;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class CustomerMapper implements FieldSetMapper<Customer> {

	@Override
	public Customer mapFieldSet(FieldSet fieldSet) throws BindException {
		Customer customer = new Customer();
		
		customer.setId(fieldSet.readString("SSN")+fieldSet.readString("PurchaseDate")+fieldSet.readString("PurchaseAmount"));
		customer.setFirstName(fieldSet.readString("FirstName"));
		customer.setLastName(fieldSet.readString("LastName"));
		customer.setSsn(fieldSet.readString("SSN"));
		customer.setAddress(fieldSet.readString("Address"));
		customer.setPurchaseDate(fieldSet.readString("PurchaseDate"));
		customer.setPurchaseAmount(fieldSet.readString("PurchaseAmount"));
		
		return customer;
	}

}
