package com.liuliu.learning.drools.decisiontree;

import java.util.List;

import com.liuliu.learning.drools.rule.lhs.Left;

public class VariableTreeNode extends TreeNode {
	
	private Left left;
	
	private List<ConditionTreeNode> conditionTreeNodes;

	public Left getLeft() {
		return left;
	}

	public void setLeft(Left left) {
		this.left = left;
	}

	public List<ConditionTreeNode> getConditionTreeNodes() {
		return conditionTreeNodes;
	}

	public void setConditionTreeNodes(List<ConditionTreeNode> conditionTreeNodes) {
		this.conditionTreeNodes = conditionTreeNodes;
	}
}
