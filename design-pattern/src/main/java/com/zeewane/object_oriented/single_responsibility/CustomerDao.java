package com.zeewane.object_oriented.single_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装的对数据库表的操作，方便别的地方重用
 * 
 * @author qizw19186
 *
 */
public class CustomerDao {

	public List<Customer> findCustomers() {
		List<Customer> result = new ArrayList<Customer>();

		// 获取数据库连接
		DBUtil.getConnection();

		// 从数据库中获取需要的内容

		result.add(new Customer("qizw", 22));

		return result;
	}

}
