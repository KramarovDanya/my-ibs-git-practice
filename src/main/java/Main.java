package main.java;
public class Main {
    public static void main(String[] args) {
        for (int i = 9; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
            System.out.println("Take one down, pass it around");
            System.out.println((i - 1) + " bottles of beer on the wall!\n");
        }
        System.out.println("The bottles are empty, and the money’s gone too. Time to go to sleeeep!");
    }
}