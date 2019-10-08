package com.liuliu.learning.drools.decisiontree;

import org.codehaus.jackson.annotate.JsonIgnore;

public abstract class TreeNode {
	
	@JsonIgnore
	private TreeNode parentNode;
	
	private TreeNodeType nodeType;

	public void setParentNode(TreeNode parentNode) {
		this.parentNode = parentNode;
	}

	public TreeNode getParentNode() {
		return parentNode;
	}

	public TreeNodeType getNodeType() {
		return nodeType;
	}

	public void setNodeType(TreeNodeType nodeType) {
		this.nodeType = nodeType;
	}
}
