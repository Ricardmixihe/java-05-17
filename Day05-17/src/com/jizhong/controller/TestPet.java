package com.jizhong.controller;

import com.jizhong.pojo.Cat;
import com.jizhong.pojo.Dog;
import com.jizhong.pojo.Pet;
import com.jizhong.pojo.Zhuren;

public class TestPet {
	public static void main(String[] args) {
		//多态：父类引用指向子类对象
		//实例化出来的对象是哪一个，执行的方法就会是哪一个对象中的方法
//		Pet cat = new Cat();
//		cat.beFriendly();//亲热方法
//		cat.play();//玩耍
//		Pet dog = new Dog();
//		dog.beFriendly();
//		dog.play();
		
//		Zhuren zhuren = new Zhuren();
//		Dog dog = new Dog();//狗类实现了宠物接口
//		Cat cat = new Cat();//猫类实现了宠物接口
//		zhuren.play(cat);
//		zhuren.eat(cat);
		
		//父类引用指向子类对象
		Pet cat = new Cat();
		cat.beFriendly();//亲热方法
		cat.play();//玩耍
		Pet dog = new Dog();
		dog.beFriendly();
		dog.play();
		
		//只能调用父类存在的方法，无法调用子类特有方法.如果想要调用子类中特有方法，必须强制类型转换
		//强制类型转换
		int i = (int)12.3;
		Cat cat2 = (Cat)cat;//Pet dog
		cat2.eat();
		
		
		
		
		
		
		
		
	}
}
