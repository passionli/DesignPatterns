package com.android.designpatterns;

/**
 * 包装器
 * 
 * @author passionli@vip.qq.com
 *
 */
public class ContextWrapper extends Context {
	// 代理
	private Context mBase;

	public void attachBaseContext(Context context) {
		if (mBase != null) {
			throw new IllegalStateException("Already has a context");
		}

		mBase = context;
	}

	@Override
	void startActivity() {
		mBase.startActivity();
	}

	@Override
	void sendBroadcast() {
		mBase.sendBroadcast();
	}
}
