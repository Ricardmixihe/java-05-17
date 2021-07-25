package com.jizhong.pojo;

public class Dog extends Animal implements Pet{

	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		System.out.println("我是一只可爱的小狗，我叫" + 		super.name + "，我正在舔主人的脸。");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("我是一只可爱的小狗，我叫" + 	super.name + "，我正在跟主人玩飞碟。");
	}

}
