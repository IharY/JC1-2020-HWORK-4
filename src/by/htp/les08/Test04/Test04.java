package by.htp.les08.Test04;

/*
Составте описание класса для представления времени. Предусмотрите возможности установки времени и изменения его
отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class Test04 {

	private int hours;
	private int minutes;
	private int seconds;

	public Test04() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours >= 24 || hours < 0) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes > 60 || minutes < 0) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds > 60 || seconds < 0) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	public Test04(int hours, int minutes, int seconds) {
		if (hours >= 24 || hours < 0) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
		if (minutes > 60 || minutes < 0) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
		if (seconds > 60 || seconds < 0) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
		
		
	}
	
    public void increaseHours(int value) {
		if(this.hours + value <= 24) {
			this.hours = this.hours + value;
		}
		else {
			this.hours = 0;
		}
	}
	
	public void increaseMinutes(int value) {
		if(this.minutes + value < 60) {
			this.minutes = this.minutes + value; 
		}
		else {
			int box = (this.minutes + value) - 60;
			increaseMinutes(box);
			increaseHours(1);
		}
	}
	
	public void increaseSeconds(int value) {
		if(this.seconds + value < 60) {
			this.seconds = this.seconds + value; 
		}
		else {
			int box = (this.seconds + value) - 60;
			increaseSeconds(box);
			increaseMinutes(1);
		}
	}
	
    public void decreaseHours(int value) {
    	if(this.hours - value >= 0) {
			this.hours = this.hours - value;
		}
		else {
			this.hours = 0;
		}
	}
    
    public void decreaseMinutes(int value) {
    	if(this.minutes - value >= 0) {
			this.minutes = this.minutes - value; 
		}
		else {
			int box = (this.seconds - value) + 60;
			if(box >= 0) {
				this.minutes = box;
				decreaseHours(1);
			}
			else {
				decreaseHours(1);
				decreaseMinutes(box*(-1));
			}
			
			
		}
	}

    public void decreaseSeconds(int value) {
    	if(this.seconds - value >= 0) {
			this.seconds = this.seconds - value; 
		}
		else {
			int box = (this.seconds - value) + 60;
			if(box >= 0) {
				this.seconds = box;
				decreaseMinutes(1);
			}
			else {
				decreaseMinutes(1);
				this.seconds = 0;
				decreaseSeconds(box*(-1));
			}
			
			
		}
	}

	
	

}
