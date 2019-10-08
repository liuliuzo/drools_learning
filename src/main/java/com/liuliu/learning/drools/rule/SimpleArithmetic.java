package com.liuliu.learning.drools.rule;

public class SimpleArithmetic extends Arithmetic {

	private SimpleArithmeticValue value;

	public SimpleArithmeticValue getValue() {
		return value;
	}

	public void setValue(SimpleArithmeticValue value) {
		this.value = value;
	}

	@Override
	public String getId() {
		String id = type.toString() + value.getId();
		return id;
	}
}
