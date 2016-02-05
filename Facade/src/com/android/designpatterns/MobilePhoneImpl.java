package com.android.designpatterns;

public class MobilePhoneImpl extends MobilePhone {

	@Override
	public Phone createPhone() {
		return new PhoneImpl();
	}

	@Override
	public Camera createdCamera() {
		return new SonyCamera();
	}

	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhoneImpl();
		mobilePhone.dail();
		mobilePhone.hangup();
		mobilePhone.takePicture();
		mobilePhone.videoChat();
		mobilePhone.hangupVideoChat();
	}
}
