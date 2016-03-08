package com.google.android;

public class ComponentWrapper extends Component {
	//被装饰对象的引用
	private Component mComponent;

	public ComponentWrapper(Component component) {
		mComponent = component;
	}

	@Override
	public void operate() {
		//扩展被装饰对象的功能
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
