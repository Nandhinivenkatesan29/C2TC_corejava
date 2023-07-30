package com.cg.day01;

public class Print_emoji {

	public static void main(String[] args) {
		System.out.println("\uD83C");
		String str="HERE IS A BOY!:\uD83D\uDC66\uD83C\uDFFF!";
		System.out.println(EmojiParser.parseToAliases(str));

	}

}
