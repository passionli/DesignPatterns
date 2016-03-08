package com.google.android;

public class ComponentWrapper extends Component {
	//��װ�ζ��������
	private Component mComponent;

	public ComponentWrapper(Component component) {
		mComponent = component;
	}

	@Override
	public void operate() {
		//��չ��װ�ζ���Ĺ���
		beforeOperate();
		mComponent.operate();
		afterOperate();
	}

	private void afterOperate() {
		System.out.println("ComponentWrapper additional afterOperate");
	}

	private void beforeOperate() {
		System.out.println("ComponentWrapper additional beforeOperate");
	}
}
