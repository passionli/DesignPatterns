package com.android.designpatterns;

public class SonyCamera implements Camera {
	private static final String TAG = SonyCamera.class.getSimpleName();

	@Override
	public void open() {
		System.out.println(TAG + " open");
	}

	@Override
	public void takePicture() {
		System.out.println(TAG + " takePicture");

	}

	@Override
	public void close() {
		System.out.println(TAG + " close");
	}

}
