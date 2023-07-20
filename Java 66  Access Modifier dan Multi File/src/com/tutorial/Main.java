package com.tutorial;

import kelasTerbuka.util.Memasak;

public class Main {

    public static void main(String[] args) {
	//public, private, default, dan protected

//        dengan access modifier public, dapat diakses
        Lain.methodPublic();

//        dengan access modifier public, dapat diakses
          /*methodPrivate();*/  //<----- tidak bisa diakses

//        Karena dalam package yang sama, maka dapat diakses
        Lain.methodDefault();

//        Karena ada dalam package yang sama, maka dapat diakses
        Lain.methodProtected();

        Memasak.dagingpublic();
//        Memasak.dagingPrivate();  <---- Tidak bisa
//        Memasak.dagingDefault(); <--- tidak bisa
//        Memasak.dagingProtected(); <--- tidak bisa



    }

}
