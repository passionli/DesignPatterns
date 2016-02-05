package com.android.designpatterns;

public class PhoneImpl implements Phone {
	private static final String TAG = PhoneImpl.class.getSimpleName();

	@Override
	public void dail() {
		System.out.println(TAG + " dail");
	}

	@Override
	public void hangup() {
		System.out.println(TAG + " hangup");
	}

}
