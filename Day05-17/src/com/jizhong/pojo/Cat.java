package com.jizhong.pojo;

//java程序是单继承
//多实现：接口
public class Cat extends Animal implements Pet,AAA{

	//猫类亲密方法
	@Override
	public void beFriendly() {
		System.out.println("我是一只可爱的小猫，我叫" + super.name + "，"
				+ "我正在挠主人。");
	}

	//猫类游戏方法
	@Override
	public void play() {
		System.out.println("我是一只可爱的小猫，我叫" + 	super.name + "，"
				+ "我正在滚毛线球。");
	}
	
}
