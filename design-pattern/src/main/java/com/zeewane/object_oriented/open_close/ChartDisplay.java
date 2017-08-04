package com.zeewane.object_oriented.open_close;

/**
 * 绘制图标<br/>
 * 使用这种抽象类的方式，来实现开闭原则，有新的种类，直接构建一个新的类去实现absChart接口。<br/>
 * chartDisplay是通用的
 * 
 * @author qizw19186
 *
 */
public class ChartDisplay {

	private AbstractChart chart;

	/**
	 * 构造方法
	 * 
	 * @param chart
	 */
	public ChartDisplay(AbstractChart chart) {
		this.chart = chart;
	}

	public AbstractChart getChart() {
		return chart;
	}

	public void setChart(AbstractChart chart) {
		this.chart = chart;
	}

	public void display() {
		chart.display();
	}

}
