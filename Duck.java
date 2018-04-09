package com.company;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }

    public abstract void display();

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }
    
}