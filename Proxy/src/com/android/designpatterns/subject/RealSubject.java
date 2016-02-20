package com.android.designpatterns.subject;

public class RealSubject extends Subject {

	@Override
	public void visit(String ip) {
		System.out.println("Real subject");
	}

}
