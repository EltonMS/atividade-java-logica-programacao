/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IMAP
 */


//Crie um programa que leia dois valores e escreva o resultado da multiplicação.
import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite o segundo valor");
        double valor2 = scanner.nextDouble();
        double res = valor1 * valor2;
        
        System.out.println("O resultado da multiplicação é "+ res);
        
        
        scanner.close();
    }
    
}
