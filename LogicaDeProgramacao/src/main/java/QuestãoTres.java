/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IMAP
 */
//Construa um algoritmo que calcula a quantidade de litros de combustível gastos em uma 
//viagem utilizando-se um automóvel que faz 12 Km por litro. 

//Para realizar esse cálculo, 
//o usuário deverá fornecer o tempo gasto da viagem e a velocidade média durante a 
//mesma. 

//O algoritmo deverá apresentar como resultado os valores da velocidade média, 
//tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada na 
//viagem.

import java.util.Scanner;

public class QuestãoTres {
    public static void main(String[] args) {
        //automóvel faz 12 km/l
        double consumo_do_veiculo = 12;
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Qual foi o tempo gasto na viagem?");
        double tempo_gasto_na_viagem = scanner.nextDouble();
        
        System.out.println("Qual foi a velocidade média?");
        double velocidade_media_viagem = scanner.nextDouble();
        
        //cálculo da distância percorrida
        double distancia_percorrida = tempo_gasto_na_viagem * velocidade_media_viagem;
        
        System.out.println("A distância percorrida na viagem foi: " + distancia_percorrida);
        
        //quantidade de litros utilizada na viagem
        double quantidade_litros_utilizado = distancia_percorrida / consumo_do_veiculo;

        System.out.println("O consumo de combustível total para a viagem foi: " + quantidade_litros_utilizado +
                "Litros"+ ",a velocidade média foi de "+ velocidade_media_viagem +
                " ,o tempo gasto na viagem foi de "+tempo_gasto_na_viagem+" horas.");
    }
}
