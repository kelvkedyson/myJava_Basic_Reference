package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50, false);
        System.out.println("Initial Pages count : " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(40);
        System.out.println("Pages printed : " + pagesPrinted + ", new total print counts for printer : " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(24);
        System.out.println("Pages printed : " + pagesPrinted + ", new total print counts for printer : " + printer.getPagesPrinted());
    }
}
