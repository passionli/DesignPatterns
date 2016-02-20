package com.android.designpatterns.subject;

public class ProxySubject extends Subject {
	// Proxy has a reference to the real object
	private RealSubject mSubject;

	public ProxySubject(RealSubject realSubject) {
		mSubject = realSubject;
	}

	@Override
	public void visit(String ip) {
		mSubject.visit(ip);
	}

}
