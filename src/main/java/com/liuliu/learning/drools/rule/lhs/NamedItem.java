package com.liuliu.learning.drools.rule.lhs;

import com.liuliu.learning.drools.library.Datatype;
import com.liuliu.learning.drools.rule.Op;
import com.liuliu.learning.drools.rule.Value;

public class NamedItem {
	
	private String variableName;
	
	private String variableLabel;
	
	private Datatype datatype;
	
	private Op op;
	
	private Value value;

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public String getVariableLabel() {
		return variableLabel;
	}

	public void setVariableLabel(String variableLabel) {
		this.variableLabel = variableLabel;
	}

	public Datatype getDatatype() {
		return datatype;
	}

	public void setDatatype(Datatype datatype) {
		this.datatype = datatype;
	}

	public Op getOp() {
		return op;
	}

	public void setOp(Op op) {
		this.op = op;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}
}
