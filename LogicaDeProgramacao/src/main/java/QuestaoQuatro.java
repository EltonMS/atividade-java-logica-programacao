/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IMAP
 */
//Solicite a quantidade de bytes que um cliente deseja comprar e informe quantos 
//quilobytes (Kbytes) equivale esta quantidade. 
//Tenha cuidado para descobrir,exatamente, quantos bytes são um quilobyte, 
//pois ele não corresponde a 1000 bytes.

import java.util.Scanner;
public class QuestaoQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a quantidade de bytes que deseja comprar?");
        double quantidade_compra_byte = scanner.nextDouble();
        double valor_kbyte = 1024;
        double conversao_kbyte =   quantidade_compra_byte / valor_kbyte;
        System.out.println("O valor em Kbytes é de: " + conversao_kbyte);
        
        
        scanner.close();
        
        
    }
}
