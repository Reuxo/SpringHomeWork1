package com.minaev.springhomework1.entities;

public class Fraction {
    private int num;
    private int denum;

    public int getNum() {
        return num;
    }

    public int getDenum() {
        return denum;
    }

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public boolean isProper() {  // task1
        return this.num < this.denum;
    }

    private int euclid() {
        int a = num;
        int b = denum;
        while (a != 0 && b != 0) {
            if (a < b) {
                b %= a;
            } else {
                a %= b;
            }
        }
        if (a != 0) {
            return a;
        } else {
            return b;
        }
    }

    public void reduce() {   // task2
        int div = euclid();
        this.num /= div;
        this.denum /= div;
    }

    public void sum(Fraction fraction) {  //task3
        this.num *= fraction.denum;
        this.num += fraction.num * this.denum;
        this.denum *= fraction.denum;
        this.reduce();
    }

    public void dif(Fraction fraction) {  //task4
        this.num *= fraction.denum;
        this.num -= fraction.num * this.denum;
        this.denum *= fraction.denum;
        this.reduce();
    }

    public void mult(Fraction fraction) { //task5
        this.num *= fraction.num;
        this.denum *= fraction.denum;
        this.reduce();
    }

    public void div(Fraction fraction) { //task6
        this.num *= fraction.denum;
        this.denum *= fraction.num;
        this.reduce();
    }
}
