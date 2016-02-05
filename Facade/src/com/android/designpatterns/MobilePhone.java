package com.android.designpatterns;

public abstract class MobilePhone {
	private static final String TAG = MobilePhone.class.getSimpleName();
	private Phone mPhone = createPhone();
	private Camera mCamera = createdCamera();

	/**
	 * 由上层决定接口的实现
	 * 
	 * @return 电话
	 */
	public abstract Phone createPhone();

	public abstract Camera createdCamera();

	public void dail() {
		System.out.println(TAG + " dail");
		mPhone.dail();
	}

	public void hangup() {
		System.out.println(TAG + " hangup");
		mPhone.hangup();
	}

	public void videoChat() {
		System.out.println(TAG + " videoChat");
		mCamera.open();
		mPhone.dail();
	}

	public void hangupVideoChat() {
		System.out.println(TAG + " hangupVideoChat");
		mPhone.hangup();
		mCamera.close();
	}

	public void takePicture() {
		System.out.println(TAG + " takePicture");
		mCamera.open();
		mCamera.takePicture();
		mCamera.close();
	}
}
