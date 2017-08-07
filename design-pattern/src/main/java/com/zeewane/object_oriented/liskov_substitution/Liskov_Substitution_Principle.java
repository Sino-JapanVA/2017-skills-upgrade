package com.zeewane.object_oriented.liskov_substitution;

/**
 * 里氏代换原则，能接受父类的，传进去子类也一定能接受
 * 
 * @author qizw19186
 *
 */
public class Liskov_Substitution_Principle {

	public static void main(String[] args) {
		EmailSender sender = new EmailSender();

		// sender就公用了
		sender.send(new NormalCustomer("qizw","qizw123@qq.com"));
		sender.send(new VIPCustomer("zeewane","zeewane@163.com"));

	}
}
