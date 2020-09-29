package by.htp.les08.Test03;

/*
Опишите класс, реализующий десятичный счетчик, который может увеличить или уменьшить свое значение на единицу в
заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольныеми значениями.
Счетчи имеет методы увеличения и уменьшения состояния, и метод позволяющий получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.
 */

public class Test03 {
	
	private int min = -100;
	private int max = 100;
	private int start;

	public Test03() {
		start = 0;
	}

	public Test03(int start) {
		this.start = start;

	}

	public Test03(int start, int min, int max) {
		this.start = start;
		this.min = min;
		this.max = max;
	}
	
	public boolean increase() {
		if(start < max) {
			start++;
			return true;
		}
		else {
			return false;
		}
	} 
	
	public boolean decrease() {
		if(start > min) {
			start--;
			return true;
		}
		else {
			return false;
		}
	} 
	
	public int getStart() {
		return start;
	}
}
