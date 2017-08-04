package com.zeewane.object_oriented.open_close;

/**
 * 开闭原则
 * @author qizw19186
 *
 */
public class Open_Closed_Principle {

	public static void main(String[] args) {
		
		ChartDisplay chart1 = new ChartDisplay(new PieChart()); // 饼形图
		chart1.display();
		
		ChartDisplay chart2 = new ChartDisplay(new BarChart()); // 柱形图
		chart2.display();
	}
}
