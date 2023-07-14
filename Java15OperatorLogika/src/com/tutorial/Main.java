package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// Operator Logika... Operasi yang bisa kitalakukan kepada tipe data Boolean
    // AND, OR, XOR, NEGASI
        boolean a,b,c;

        //OR = Atau (|)
        System.out.println("----- OR = Atau (|)-----");
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c );

        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c );

        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c );

        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c );

        //AND = Dan (&&)
        System.out.println("----- AND = Dan (&&)-----");
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c );

        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c );

        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c );

        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c );

        //XOR = Exclusive (^)
        System.out.println("----- XOR = Exclusive ( ^ )-----");
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c );

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c );

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c );

        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c );

        //NOT = Negasi ---> Flipping (!)
        System.out.println("----- NOT = Negasi ---> Flipping (!)-----");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c );
        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c );

    }
}
