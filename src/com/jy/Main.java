package com.jy;

public class Main {

	public static void main(String[] args) {
		char[] chars = new char[] { 'a', 'b', 'c' };
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

	}

}
