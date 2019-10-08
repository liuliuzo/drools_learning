package com.liuliu.learning.drools.rule.action;

public interface Action extends Comparable<Action> {

	ActionType getActionType();

	int getPriority();

	void setDebug(boolean debug);
}
