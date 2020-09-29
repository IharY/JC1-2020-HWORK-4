package by.htp.les08.main;

import by.htp.les08.Test04.Test04;

public class Main {
	public static void main(String []args) {
	Test04 test = new Test04(10,10,10);
	test.decreaseHours(0);
	//test.decreaseMinutes(11);
	test.decreaseSeconds(120);
	System.out.println(test.getHours());
	System.out.println(test.getMinutes());
	System.out.println(test.getSeconds());
	}
}
