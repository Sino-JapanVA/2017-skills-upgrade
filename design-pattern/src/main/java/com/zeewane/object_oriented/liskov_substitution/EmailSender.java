package com.zeewane.object_oriented.liskov_substitution;

/**
 * 邮件发送
 * 
 * @author qizw19186
 *
 */
public class EmailSender {

	/**
	 * 里氏代换原则，能搞定父类的，一定能搞定其子类
	 * 
	 * @param customer
	 */
	public void send(Customer customer) {
		System.out.println("send email to " + customer.getName() + " at " + customer.getEmail());
	}

}
