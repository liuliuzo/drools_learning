package com.liuliu.learning.drools.decisiontree;

import java.util.List;

import com.liuliu.learning.drools.rule.action.Action;

public class ActionTreeNode extends TreeNode {

	private List<Action> actions;

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
}
