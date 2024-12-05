package com.tutorial;

public class Player {
    // varibel 
    private String nama;

    // constructor
    Player(String nama){
        this.nama = nama;
    }

    // mathod cetak 
    void cetak(){
        System.out.println("Nama : " + this.nama);
    }
}
