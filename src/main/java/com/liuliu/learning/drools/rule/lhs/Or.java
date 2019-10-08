package com.liuliu.learning.drools.rule.lhs;

public class Or extends Junction {

	@Override
	public String getJunctionType() {
		return JunctionType.or.name();
	}
}
