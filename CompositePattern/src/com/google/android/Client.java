package com.google.android;

public class Client {

	public static void main(String[] args) {
		Component root = new Composite("Root");
		Component branch1 = new Composite("branch1");
		
		Component leaf1 = new Leaf("Leaf1");
		Component leaf2 = new Leaf("Leaf2");
		Component leaf3 = new Leaf("Leaf3");
		
		root.addChild(leaf1);
		root.addChild(branch1);
		
		branch1.addChild(leaf2);
		branch1.addChild(leaf3);
		
		root.doSomething();
	}
}
