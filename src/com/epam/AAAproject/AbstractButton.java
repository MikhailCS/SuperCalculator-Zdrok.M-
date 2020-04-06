package com.epam.AAAproject;

public abstract class AbstractButton { // Тут я показал,что знаю абстракцию

    //в абстрактном классе могут быть уже реализованные методы
    public double sum(double a,double b){ // модификаторы доступа - это полиморфизм
        double responce = 0.0;
        responce = a + b;

        return responce;
    }
    public double sub(double a,double b){
        double responce = 0.0;
        responce = a - b;

        return responce;
    }
    public double mul(double a,double b){
        double responce = 0.0;
        responce = a * b;

        return responce;
    }
    public double div(double a,double b){
        double responce = 0.0;
        responce = a / b;

        return responce;
    }

    public double sin(double a){
        double responce = 0.0;
        responce = Math.sin(a);

        return responce;
    }
    public double cos(double a){
        double responce = 0.0;
        responce = Math.cos(a);

        return responce;
    }
    abstract void customButton() throws InterruptedException; // этот метод мы точно переопределим

}
