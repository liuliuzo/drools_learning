package com.liuliu.learning.drools.decisiontree.test;

import com.liuliu.learning.drools.decisiontree.ConditionTreeNode;
import com.liuliu.learning.drools.decisiontree.DecisionTree;
import com.liuliu.learning.drools.decisiontree.VariableTreeNode;
import com.liuliu.learning.drools.rule.Op;
import com.liuliu.learning.drools.rule.SimpleArithmetic;
import com.liuliu.learning.drools.rule.lhs.Left;
import com.liuliu.learning.drools.rule.lhs.LeftType;
import com.liuliu.learning.utils.FastJsonUtil;

public class DecisiontreeTest {

	public static void main(String[] args) {
		DecisionTree dt = new DecisionTree();

		VariableTreeNode rootvtn = new VariableTreeNode();
		
		
		
		

		ConditionTreeNode ctn = new ConditionTreeNode();
		
		

		Op operate01 = Op.parse(">");

		Op operate02 = Op.parse("==");
		
		
		
		
		

		System.out.println(FastJsonUtil.toJSONString(dt));
		
		
		
		System.out.println(FastJsonUtil.toJSONString(rootvtn));
	}
}
