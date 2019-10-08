package com.liuliu.learning.drools.rule;

import java.util.Date;

import com.liuliu.learning.drools.rule.lhs.Lhs;

public class Rule implements RuleInfo {

	private String name;
	
	private Integer salience;
	
	private Date effectiveDate;
	
	private Date expiresDate;
	
	private Boolean enabled;
	
	private Boolean debug;
	
	/**
	 * 系统会自动将此属性相同的规则划为一组，且这个组中只有一个规则会执行，待执行的规则如设置了优先级，则优先级最高的规则执行，否则随机；
	 * 需要注意的是，互斥组属性仅在当前规则集文件默认模式下有用，在顺序模式下互斥组属性将不起作用。
	 */
	private String activationGroup;
	
	/**
	 * 系统会自动将此属性相同的规则划为一组，默认情况下，引擎不会执行这个组里的规则，
	 * 需要我们在定义规则动作时利用系统内置的函数显示的指定要激活执行的执行组名，这样系统才会尝试匹配并执行组里的规则。
	 */
	private String agendaGroup;
	
	private Boolean autoFocus;
	
	private String ruleflowGroup;
	
	private Lhs lhs;
	
	private Rhs rhs;
	
	private Other other;
	
	/**
	 * 当执行“更新工作区对象”动作时，某些规则可以会再次满足条件，这时这个属性就是用来决定这种类型的规则是否允许再次触发执行。
	 */
	private Boolean loop;
	
	private Boolean loopRule = false;
	
	private String remark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public Integer getSalience() {
		return salience;
	}

	public void setSalience(Integer salience) {
		this.salience = salience;
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

	public Boolean getAutoFocus() {
		return autoFocus;
	}

	public void setAutoFocus(Boolean autoFocus) {
		this.autoFocus = autoFocus;
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

	public String getActivationGroup() {
		return activationGroup;
	}

	public void setActivationGroup(String activationGroup) {
		this.activationGroup = activationGroup;
	}

	public String getAgendaGroup() {
		return agendaGroup;
	}

	public void setAgendaGroup(String agendaGroup) {
		this.agendaGroup = agendaGroup;
	}

	public String getRuleflowGroup() {
		return ruleflowGroup;
	}

	public void setRuleflowGroup(String ruleflowGroup) {
		this.ruleflowGroup = ruleflowGroup;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Lhs getLhs() {
		return lhs;
	}

	public void setLhs(Lhs lhs) {
		this.lhs = lhs;
	}

	public Rhs getRhs() {
		return rhs;
	}

	public void setRhs(Rhs rhs) {
		this.rhs = rhs;
	}

	public Other getOther() {
		return other;
	}

	public void setOther(Other other) {
		this.other = other;
	}

	public Boolean getLoop() {
		return loop;
	}

	public void setLoop(Boolean loop) {
		this.loop = loop;
	}

	public Boolean isLoopRule() {
		return loopRule;
	}

	public void setLoopRule(Boolean loopRule) {
		this.loopRule = loopRule;
	}
}
