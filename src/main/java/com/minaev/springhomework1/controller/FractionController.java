package com.minaev.springhomework1.controller;


import com.minaev.springhomework1.entities.Fraction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FractionController {

    @GetMapping("/isProper")   //task1
    public Fraction isProper(@RequestParam() int num, @RequestParam() int denum) {
        return new Fraction(num, denum);
    }

    @GetMapping("/redaction")  //task2
    public Fraction redaction(@RequestParam() int num, @RequestParam() int denum) {
        Fraction fraction = new Fraction(num, denum);
        fraction.reduce();
        return fraction;
    }

    @GetMapping("/sum")  //task3
  public Fraction sum(@RequestParam() int num1, @RequestParam int denum1 ,
                      @RequestParam() int num2, @RequestParam int denum2) {
        Fraction fraction1 = new Fraction(num1, denum1);
        Fraction fraction2 = new Fraction(num2, denum2);
        fraction1.sum(fraction2);
        return fraction1;
    }

    @GetMapping("/dif")  //task4
    public Fraction dif(@RequestParam() int num1, @RequestParam int denum1 ,
                        @RequestParam() int num2, @RequestParam int denum2) {
        Fraction fraction1 = new Fraction(num1, denum1);
        Fraction fraction2 = new Fraction(num2, denum2);
        fraction1.dif(fraction2);
        return fraction1;
    }

    @GetMapping("/mult")  //task5
    public Fraction mult(@RequestParam() int num1, @RequestParam int denum1 ,
                        @RequestParam() int num2, @RequestParam int denum2) {
        Fraction fraction1 = new Fraction(num1, denum1);
        Fraction fraction2 = new Fraction(num2, denum2);
        fraction1.mult(fraction2);
        return fraction1;
    }

    @GetMapping("/div")  //task6
    public Fraction div(@RequestParam() int num1, @RequestParam int denum1 ,
                         @RequestParam() int num2, @RequestParam int denum2) {
        Fraction fraction1 = new Fraction(num1, denum1);
        Fraction fraction2 = new Fraction(num2, denum2);
        fraction1.div(fraction2);
        return fraction1;
    }
}
