package com.company;

public class calculator {
    public calculator(){

    }
    public int add(int a, int b){
        int result = a + b;
        return result;
    }
    public int subtract(int a, int b){
        int result = a - b;
        return result;
    }
    public int multiply(int a, int b){
        int result = a * b;
        return result;
    }
    public int divide(int a, int b){
        int result = a / b;
        return result;
    }
    public int modulo(int a, int b){
        int result = a % b;
        return result;
    }
    public static void main(String[] args){
        calculator myCalculator = new calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
//        можно использовать сканнер и еще что-то для того, чтобы было похожа на калькулятор. Ладно сделаю след раз
    }
}
