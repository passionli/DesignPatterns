package com.android.designpatterns;

/**
 * ���������İ�װ�ࡣֻ�Ǵ�������ʵ�ֽ���Context��һ������ContextImpl��
 * ����ʹ��һ��������˾����Լ�����Ĺ���֮�⣬Ҳ������һ������Ĺ��ܡ�
 * ����ģ�黯�������Ըߡ�
 * @author passionli@vip.qq.com
 *
 */
public class ContextWrapper extends Context {
	// ����
	private Context mBase;

	public void attachBaseContext(Context context) {
		if (mBase != null) {
			throw new IllegalStateException();
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
