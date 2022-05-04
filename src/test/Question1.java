package test;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入:");
		int i = scan.nextInt();
		long total = getNum(i);
		System.out.println("第" + i + "个月总共有" + (total * 2) + "只.");
	}

	public static long getNum(int i) {
		long num = 1;
		if (i > 3) {
			num = getNum(i - 1) + getNum(i - 3);
		}
		return num;
	}
}
