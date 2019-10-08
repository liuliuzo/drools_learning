package com.liuliu.learning.drools.ruleset.test;

import java.util.List;

import com.google.common.collect.Lists;
import com.liuliu.learning.drools.library.Datatype;
import com.liuliu.learning.drools.rule.Op;
import com.liuliu.learning.drools.rule.Rule;
import com.liuliu.learning.drools.rule.RuleSet;
import com.liuliu.learning.drools.rule.Value;
import com.liuliu.learning.drools.rule.lhs.Lhs;
import com.liuliu.learning.drools.rule.lhs.NamedItem;
import com.liuliu.learning.drools.rule.lhs.NamedJunction;
import com.liuliu.learning.utils.FastJsonUtil;

//rule "GoodBye"
//when
//    Message( status == Message.GOODBYE, myMessage : message )
//then
//    System.out.println( myMessage );
//end
public class RuleSetTest {
	public static void main(String[] args) {
		
		RuleSet rs = new RuleSet();
		
		Lhs lhs01 = new Lhs();
		
		NamedItem ni01 = new NamedItem();
		ni01.setDatatype(Datatype.Object);
		ni01.setVariableName("message");
		ni01.setVariableLabel("myMessage");
		ni01.setOp(Op.Equals);
		Value value01=new MyValue();
		ni01.setValue(value01);
		
		NamedItem ni02 = new NamedItem();
		ni02.setDatatype(Datatype.Object);
		ni02.setVariableName("message");
		ni02.setVariableLabel("myMessage");
		ni02.setOp(Op.LessThen);
		Value value02=new MyValue();
		ni01.setValue(value02);
		
		List<NamedItem> items = Lists.newArrayList();
		items.add(ni01);
		items.add(ni02);
		
		NamedJunction parent = new NamedJunction();
		parent.setItems(items);
		
		lhs01.setCriterion(parent);
		
		
		
		Rule rule01 = new Rule();
		rule01.setSalience(0);
		rule01.setName("GoodBye");
		rule01.setLhs(lhs01);	
		rule01.setRhs(null);
		
		Rule rule02 = new Rule();
		rule02.setName("rule02");
		rule02.setSalience(1);

		List<Rule> rules = Lists.newArrayList();
		rules.add(rule01);
		rules.add(rule02);
		rs.setRules(rules);
		
		System.out.println(FastJsonUtil.toJSONString(rs));

	}
}
