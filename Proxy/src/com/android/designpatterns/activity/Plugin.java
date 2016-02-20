package com.android.designpatterns.activity;

public interface Plugin {
	public void onCreate();

	public void onResume();

	public void onPause();

	public void onDestroy();
}
