package com.liuliu.learning.drools.rule.lhs;

import java.util.List;

public class NamedJunction extends BaseCriterion {

	private JunctionType junctionType;

	private List<NamedItem> items;

	public JunctionType getJunctionType() {
		return junctionType;
	}

	public void setJunctionType(JunctionType junctionType) {
		this.junctionType = junctionType;
	}

	public List<NamedItem> getItems() {
		return items;
	}

	public void setItems(List<NamedItem> items) {
		this.items = items;
	}
}
