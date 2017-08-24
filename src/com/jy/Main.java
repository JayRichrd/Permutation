package com.jy;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		char[] chars = new char[] { 'a', 'b', 'c' };
		System.out.println("字符串：" + Arrays.toString(chars));
		System.out.print("排列组合：");
		permutation(chars);
	}

	/**
	 * 对输入的字符做排列
	 * 
	 * @param chars
	 *            待排列的字符数组
	 */
	public static void permutation(char[] chars) {
		if (chars == null)
			return;
		// 调用重载方法
		permutation(chars, 0);

	}

	/**
	 * 对输入的字符做排列
	 * 
	 * @param chars
	 *            待排列的字符数组
	 * @param begin
	 *            做全排列开始的字符
	 */
	public static void permutation(char[] chars, int begin) {
		int charLength = chars.length;
		if (begin == charLength - 1) { // 最后一个字符就开始打印
			for (char c : chars)
				System.out.print(c);
			System.out.print(" ");
		} else {
			for (int i = begin; i < charLength; i++) {
				// 将第一个开始字符和后面的字符交换
				char temp = chars[i];
				chars[i] = chars[begin];
				chars[begin] = temp;

				// 继续从begin后面的字符开始递归
				permutation(chars, begin + 1);

				// 递归返回后交换回来，继续将下一个字符与begin交换
				// 注意到递归是保存在堆栈上的，所以递归返回时与刚交换过去是一样的
				// 这里只要再交换一次就可以恢复原样
				temp = chars[i];
				chars[i] = chars[begin];
				chars[begin] = temp;
			}
		}
	}

}
