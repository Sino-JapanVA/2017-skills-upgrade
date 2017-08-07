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
		
		// 假如我新增了折线图，我不需要去动原来的类，我只要自己新写一个LineChart
		// 不修改原来的代码，达到新增的效果
		
		// 若是之前的做法是怎么样的？在display的时候传入一个参数来指定？
		ChartDisplay chart3 = new ChartDisplay(new LineChart());
		chart3.display();
	}
}
