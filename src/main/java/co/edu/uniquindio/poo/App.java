package co.edu.uniquindio.poo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
    }

public void dividir(int a, int b){
    if (b==0) {
        throw new ArithmeticException("no se puede dividir entre 0 ");
    }
    System.out.println(a +"/"+ b);
}






}
