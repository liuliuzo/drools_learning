package com.liuliu.learning.drools.rule;

public interface Value {
	
	ComplexArithmetic getArithmetic();

	ValueType getValueType();

	String getId();
}
