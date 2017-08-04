package com.zeewane.object_oriented.single_responsibility;

/**
 * 用户信息图形模块
 * 
 * @author qizw19186
 *
 */
public class CustomerDataChart {

	private CustomerDao customerDao;

	public CustomerDataChart(CustomerDao dao) {
		this.customerDao = dao;
	}
	

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void createChart() {
		// use dao
	}

	public void displayChart() {
		// use dao
	}

}
