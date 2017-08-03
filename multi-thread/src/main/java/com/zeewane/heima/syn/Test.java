package com.zeewane.heima.syn;

/**
 * 成功验证，只要catch住异常，线程不会挂
 *
 * @author zeewane
 * @date 2017年7月5日 上午9:50:11
 */
public class Test {

	public static void main(String[] args) {
		new Thread(new thread()).start();
	}

	static class thread implements Runnable {
		public void run() {
			int index = 10;
			while (true) {

				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				index--;
				try {
					System.out.println(100 / index);
				} catch (Exception e) {
					System.out.println("抓住一个异常" + e);
				}
			}
		}
	}
}
