/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elton
 */
//Calcular a quantidade de dinheiro gasto por um fumante. Dados: o número de anos que 
//ele fuma, o nº de cigarros fumados por dia e o preço de uma carteira.
import java.util.Scanner;

public class QuestaoCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A quantos anos você fuma?");
        int anos = scanner.nextInt();
        int dias = anos * 365;

        System.out.println("Qual o preço da carteira?");
        double preco_carteira = scanner.nextDouble();
        double preco_cigarro = preco_carteira / 20;

        System.out.println("Quantos cigarros você fuma por dia?");
        double quantidade_cigarros_dia = scanner.nextInt();

        double custo_diario = quantidade_cigarros_dia * preco_cigarro;

        double totalGasto = (custo_diario * dias);

        System.out.printf("O Total gasto com cigarros foi de R$ %.2f . No período de %d dias.", totalGasto, dias);
    }
}
