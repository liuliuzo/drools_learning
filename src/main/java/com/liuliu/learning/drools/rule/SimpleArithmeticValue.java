package com.liuliu.learning.drools.rule;

public class SimpleArithmeticValue {

	private String content;

	private SimpleArithmetic arithmetic;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public SimpleArithmetic getArithmetic() {
		return arithmetic;
	}

	public void setArithmetic(SimpleArithmetic arithmetic) {
		this.arithmetic = arithmetic;
	}

	public String getId() {
		String id = content;
		if (arithmetic != null) {
			id += arithmetic.getId();
		}
		return id;
	}
}
