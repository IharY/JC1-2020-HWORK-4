package by.htp.les08.Test01;

/*
Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. Добавте
метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из
этих двух переменных
 */

public class Test01 {


    private int var1 = 0;
    private int var2 = 1;

    public void show(){
        System.out.println("переменная 1 - " + var1 + "переменная 2 - " + var2);
    }

    public int sum(){
        return var1 + var2;
    }

    public int max(){
        // return (var1 > var2) ? var1 : var2;
        if(var1 > var2){
            return var1;
        }
        else {
            return var2;
        }
    }

    public void setVar1(int var1) {
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
