package com.liuliu.learning.drools.rule;

import java.util.ArrayList;
import java.util.List;

public class RuleSet {
	
	private String remark;
	
	private List<Library> libraries;
	
	private List<Rule> rules;

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<Library> getLibraries() {
		return libraries;
	}

	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}

	public void addLibrary(Library library) {
		if (this.libraries == null) {
			this.libraries = new ArrayList<Library>();
		}
		this.libraries.add(library);
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}
}
