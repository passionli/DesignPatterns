package com.android.designpatterns.activity;

public class PluginActivity implements Plugin {
	private static final String TAG = PluginActivity.class.getSimpleName();

	@Override
	public void onCreate() {
		System.out.println(TAG + " onCreate");
	}

	@Override
	public void onResume() {
		System.out.println(TAG + " onResume");
	}

	@Override
	public void onPause() {
		System.out.println(TAG + " onPause");
	}

	@Override
	public void onDestroy() {
		System.out.println(TAG + " onDestroy");
	}

}
