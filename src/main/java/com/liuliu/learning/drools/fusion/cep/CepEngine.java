package com.liuliu.learning.drools.fusion.cep;

import java.util.Date;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.liuliu.learning.drools.fusion.model.Person;

public class CepEngine {

	private static KieSession getSession() {		
        // load up the knowledge base
        KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	return kContainer.newKieSession("ksession-person");
	}

	public static void runBoy() {
		KieSession ks = getSession();
		Person p1 = new Person("白展堂", 2, new Date());
		Person p2 = new Person("佟湘玉", 7, new Date());	
	    try {
	        Thread.sleep(4000);
	      } catch (InterruptedException e) {
	        System.out.println(e);
	      }
		
		Person p3 = new Person("李大嘴", 16, new Date());
		ks.insert(p1);
		ks.insert(p2);
		ks.insert(p3);
		int count = ks.fireAllRules();
		System.out.println("总执行了" + count + "条规则------------------------------");
	    ks.dispose();
	}
	
	public static void runOld() {
	    KieSession ks = getSession();
	    Person p1 = new Person("白展堂", 52,new Date());
	    Person p2 = new Person("佟湘玉", 57,new Date());
	    try {
	      Thread.sleep(4000);
	    } catch (InterruptedException e) {
	      System.out.println(e);
	    }
	    Person p3 = new Person("李大嘴", 56,new Date());
	    ks.insert(p1);
	    ks.insert(p2);
	    ks.insert(p3);
	    int count = ks.fireAllRules();
	    System.out.println("总执行了" + count + "条规则------------------------------");
	    ks.dispose();
	  }

	public static void main(String[] args) {
		runBoy();
		runOld();
	}
}
