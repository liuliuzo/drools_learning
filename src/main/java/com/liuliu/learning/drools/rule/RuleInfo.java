package com.liuliu.learning.drools.rule;

import java.util.Date;

public interface RuleInfo {
	
	String getName();

	Date getEffectiveDate();

	Integer getSalience();

	Boolean getEnabled();

	Boolean getAutoFocus();

	Date getExpiresDate();

	String getActivationGroup();

	String getAgendaGroup();

	String getRuleflowGroup();
}
