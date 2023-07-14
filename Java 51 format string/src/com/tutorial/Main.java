package com.tutorial;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Formatter;

public class Main {

    public static void main(String[] args) {
        String nama = "Udin";
        int umur = 17;

        //outpur : nama saya adalah udin, umur saya adalah 17
        System.out.println("nama saya adalah " + nama + ", umur saya adalah " + umur);

        //Cara lainnya adalah format string
        System.out.printf("Nama saya adalah %s, umur %s adalah %d",nama,nama,umur);

        //conversion : f = floating point
        //c = character
        //s = string
        //d = integer
        //b = boolean

        //Struktur fromat = %[argumen_index$][flags][width][.precision]conversion

        //[argumen_index$]
        System.out.println("\n[argumen_index$]");
        //udin, wahai udin, kemana saja kamu udin
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s \n", nama);
        //umur udin berapa, udin menjawab : 17, wah masih muda ya umurnya 17
        System.out.printf("\numur %1$s berapa, \n%1$s menjawab : %2$d, \nwah masih muda ya umurnya %2$d", nama, umur);

        //[flags]
        System.out.printf("\n[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("\n%d - %d = %d", int1, int2, hasil);

        //[width]
        System.out.printf("\n[width]");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d \n", int3);
        System.out.printf("%5d \n", int3);
        System.out.printf("%-5d \n", int3); //flags = "-", artinya rata kiri
        System.out.printf("%+5d \n", int3); //flags akan mengambil didalam format
        System.out.printf("%+-6d \n", int3); //flags bisa digabungkan
        System.out.printf("%10d \n", int3);
        System.out.printf("%10d \n", int3);
        System.out.printf("%010d \n", int3); //flags = "0", kita menambahkan leading '0' didepan
        System.out.printf("%+010d \n", int3);
        System.out.printf("%,10d \n", int3); // flags = ",", menandakan delimeter perseribu
        int int4 = 1000000000;
        System.out.printf("%-,15d \n", int4); // flags = ",", menandakan delimeter perseribu

        System.out.println("\nFLOATING POINT");
        float float1 = 1.54f;
        System.out.printf("%f\n",float1);
        System.out.printf("%5f\n", float1);
        System.out.printf("%9f\n", float1); //floating poin akan mengambil width dengan 6 desimal

        //.[precision]
        System.out.println("\n[.precision]");
        float float2 = 15.678f;
        System.out.printf("%f\n", float2);
        System.out.printf("%.1f\n", float2);
        System.out.printf("%.2f\n", float2);
        System.out.printf("%8.2f\n", float2); //gabungkan dengan width
        System.out.printf("%+08.2f\n", float2); //gabungkan dengan width dan flags

        //contoh
        String nama2 = "Ucup";
        float ipk = 3.78123563f;
        System.out.printf("\nIPK %1$s berapa ?, \n%1$s : saya dapat %2$+5.2f\n", nama2,ipk);

        //Kesimpulan
        //Save format ini kedalam variabel string
        String infoBiasa = "nama : " + nama2 + " , IPK + " + ipk;
        System.out.println("Biasa = " + infoBiasa);

        String infoFormat = String.format("nama : %s, IPK = %2$+5.2f", nama2, ipk);
        System.out.println("String Format = " + infoFormat);

        //Save format kedalam string builder
        StringBuilder builderInfo = new StringBuilder();
        Formatter formatBuilder = new Formatter(builderInfo);

        formatBuilder.format("nama : %s, IPK = %2$+5.2f", nama2, ipk);
        System.out.println("String Builder format = " + builderInfo);

    }
}
