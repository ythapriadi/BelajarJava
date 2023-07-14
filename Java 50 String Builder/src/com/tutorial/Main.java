package com.tutorial;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder( "Halo");

        printData(builder);
        //Append
        builder.append(" Semuanya");
        printData(builder);

        builder.append(" Warga Surabaya");
        printData(builder);

        //insert
        builder.insert(19, " Kota");
        printData(builder);

        //delete
        builder.delete(19, 24);
        printData(builder);

        //Rubah karakter pada index tertentu
        builder.setCharAt(14, 'W');
        printData(builder);

        //replace
        builder.replace(20,28, "Bandung");
        printData(builder);

        //Casting menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addresString = System.identityHashCode(kalimat);
        System.out.println("Address = " + Integer.toHexString(addresString));
    }

    private static void printData (StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panajang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("Address = " + Integer.toHexString(addressBuilder));


    }

}


