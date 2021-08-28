package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger=new Hamburger("Basic","Sausage",3.56,"White");
	//double price = hamburger.itemizeHamburger();
	hamburger.addHamburgerAddition1("lettuce",0.52);
	hamburger.addHamburgerAddition2("tomato",0.25);
	hamburger.addHamburgerAddition3("cheese",0.1);
	hamburger.addHamburgerAddition4("paprika",0.22);
	System.out.println("Total burger price is $"+hamburger.itemizeHamburger());
    HealthyBurger healthyBurger=new HealthyBurger("Bacon",5.67);
    healthyBurger.addHealthAddition1("egg",2.35);
    System.out.println("Total healthy burger price is $"+healthyBurger.itemizeHamburger());
    DeluxeBurger db=new DeluxeBurger();
    db.itemizeHamburger();
    }
}
