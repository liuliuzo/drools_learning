package com.liuliu.learning.drools.rule.lhs;

import com.liuliu.learning.drools.rule.SimpleArithmetic;

public class Left {
	
	private String id;
	private LeftPart leftPart;
	private LeftType type;
	private SimpleArithmetic arithmetic;

	public LeftPart getLeftPart() {
		return leftPart;
	}

	public void setLeftPart(LeftPart leftPart) {
		this.leftPart = leftPart;
	}

	public SimpleArithmetic getArithmetic() {
		return arithmetic;
	}

	public void setArithmetic(SimpleArithmetic arithmetic) {
		this.arithmetic = arithmetic;
	}

	public LeftType getType() {
		return type;
	}

	public void setType(LeftType type) {
		this.type = type;
	}

	public String getId() {
		if (id == null) {
			id = leftPart.getId();
			if (arithmetic != null) {
				id = id + arithmetic.getId();
			}
		}
		return id;
	}
}
