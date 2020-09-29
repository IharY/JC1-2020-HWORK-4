package by.htp.les08.Test02;

/*
Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Test02 {
	
	int var1 = 2;
    int var2 = 0;

    public Test02(int var1,int var2){
        this.var1 = var1;
        this.var1 = var2;
    }
    public void setVar1(int var1){
        this.var1 = var1;
    }

    public void setVar2(int var2){
        this.var2 = var2;
    }

    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }

}
