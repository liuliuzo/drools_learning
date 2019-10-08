package com.liuliu.learning.drools.decisiontree;

import java.util.Date;
import java.util.List;

import com.liuliu.learning.drools.rule.Library;

public class DecisionTree {

	/**
	 * 优先级
	 */
	private Integer salience;
	/**
	 * 生效日期
	 */
	private Date effectiveDate;
	/**
	 * 失效日期
	 */
	private Date expiresDate;
	/**
	 * 是否启用
	 */
	private Boolean enabled;
	/**
	 * 允许调试信息输出
	 */
	private Boolean debug;
	/**
	 * 备注
	 */
	private String remark;

	private List<Library> libraries;

	private VariableTreeNode variableTreeNode;

	public Integer getSalience() {
		return salience;
	}

	public void setSalience(Integer salience) {
		this.salience = salience;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpiresDate() {
		return expiresDate;
	}

	public void setExpiresDate(Date expiresDate) {
		this.expiresDate = expiresDate;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getDebug() {
		return debug;
	}

	public void setDebug(Boolean debug) {
		this.debug = debug;
	}

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

	public VariableTreeNode getVariableTreeNode() {
		return variableTreeNode;
	}

	public void setVariableTreeNode(VariableTreeNode variableTreeNode) {
		this.variableTreeNode = variableTreeNode;
	}
}
