package com.liuliu.learning.drools.rule;

public abstract class Arithmetic {
	
	protected ArithmeticType type;

	public ArithmeticType getType() {
		return type;
	}

	public void setType(ArithmeticType type) {
		this.type = type;
	}

	public abstract String getId();
}