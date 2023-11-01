/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IMAP
 */

//Elabore um programa que lê 5 valores, um de cada vez, 
//e conta quantos destes valores 
//são negativos, quantos são positivos e quantos são zero, escrevendo esta informação.

import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[] args) {
        int i = 0;
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;
        
        Scanner scanner = new Scanner(System.in);
        for(i=0; i<5; i++){
            if(i > 0){
                System.out.println("Numero Positivo");
                positivos++;
            }else if(i<0){
                System.out.println("Numero Negativo");
                negativos++;
            }if (i == 0){
                System.out.println("Numero Zero");
                zeros++;
            }
            scanner.close();
        }
    }
}
