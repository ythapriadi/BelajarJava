package com.tutorial;

public class Main {

    public static void main(String[] args) {

        //Operator komparasi ini akan menghasilkan niali dalam bentuk Boolean
        int a,b;
        boolean hasilKomparasi;

        //Operator Equal(Persamaan)
        System.out.println("-----Persamaan");
        a = 10;
        b= 10;
        hasilKomparasi = (a==b);
        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b= 10;
        hasilKomparasi = (a==b);
        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        //Operator non Equal atau pertidaksamaan
        System.out.println("------Pertidaksamaan");
        a = 10;
        b= 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b= 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b,hasilKomparasi);

        //Operator LESS THAN atau Kurang dari (<)
        System.out.println("------LESS THAN atau Kurang dari");
        a = 9;
        b= 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b= 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b,hasilKomparasi);

        //Operator GREATER THAN atau lebih dari (>)
        System.out.println("------GREATER THAN atau lebih dari");
        a = 9;
        b= 10;
        hasilKomparasi = (a >b);
        System.out.printf("%d > %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b= 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b,hasilKomparasi);

        //Operator LESS THAN EQUAL atau Kurang dari sama dengan(<=)
        System.out.println("------LESS THAN EQUAL atau Kurang dari sama dengan");
        a = 10;
        b= 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b= 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilKomparasi);

        //Operator LESS THAN EQUAL atau Kurang dari sama dengan (>=)
        System.out.println("------LESS THAN EQUAL atau Kurang dari sama dengan");
        a = 9;
        b= 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b= 12;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilKomparasi);
    }
}
