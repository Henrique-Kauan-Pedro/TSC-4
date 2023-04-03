package atividade15;
import java.util.Scanner;
public class atividade15 {
    public static void main(String[] args) {
        double numero;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um número:");
        while (!num.hasNextDouble()){
            System.out.println("Digite um número válido");
            num.next();
        }
        numero = num.nextDouble();
        if ((numero >100) && (numero <200))
        System.out.println("Este número está entre 100 e 200");
        if (!(numero >100) && (numero <200))
        System.out.println("Este número não está entre 100 e 200");
        num.close();
    }
    
}

