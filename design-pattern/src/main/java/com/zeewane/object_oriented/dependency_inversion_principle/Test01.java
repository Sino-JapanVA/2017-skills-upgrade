package com.zeewane.object_oriented.dependency_inversion_principle;

import java.util.Arrays;
import java.util.List;

/**
 * 依赖倒转原则要求我们在程序代码中传递参数时或在关联关系中，尽量引用层次高的抽象层类，
 * 即使用接口和抽象类进行变量类型声明、参数类型声明、方法返回类型声明，
 * 以及数据类型的转换等，而不要用具体类来做这些事情
 * 
 * 我个人认为这个原则，可以最大限度的让接口能够通用，比如我一个返回List的接口，和一个返回ArrayList
 * 这个的兼容性是完全不一样的，同样的就是，要在一开始时候就定义好顶层的抽象接口
 * 
 * 为了确保该原则的应用，一个具体类应当只实现接口或抽象类中声明过的方法，而不要给出多余的方法，
 * 否则将无法调用到在子类中增加的新方法。
 * 
 * @author qizw19186
 *
 */
public class Test01 {

	
	public static void main(String[] args) {
		
		System.out.println(getList());
		
	}
	
	public static List<String> getList(){
		return Arrays.asList("hello");
	}
}
