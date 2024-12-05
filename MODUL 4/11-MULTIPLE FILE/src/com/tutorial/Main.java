package com.tutorial;

// keyword untuk import package eksternal
import com.terminal.Console;

class Main {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("Dill");
        Player player2 = new Player("Dall");
        Player player3 = new Player("Doll");
        player1.cetak();
        player2.cetak();
        player3.cetak();

        Console.log("Hallo");


    }
}
