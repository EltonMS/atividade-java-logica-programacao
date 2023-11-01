
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elton
 */
//Tem-se um conjunto de dados de um grupo de pessoas, serão coletados a altura e o 
//sexo (1- masculino, 2 - feminino). O final do conjunto é determinado quando for 
//informada uma altura menor ou igual a zeros. Imprima:
//a) a maior e a menor altura do grupo;
//c) o número de homens;
//d) a média de altura das mulheres;
//e) o percentual de mulheres abaixo de 1,68. 
public class QuestaoSete {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Cadastrar nova pessoa.");

            System.out.println("Qual a altura desta pessoa?");
            double altura = scanner.nextDouble();

            if (altura <= 0) {
                break;
            }

            System.out.println("Qual o sexo dessa pessoa? (1- masculino, 2 - feminino)");
            int sexo = scanner.nextInt();

            Pessoa pessoa = new Pessoa(altura, sexo);
            pessoas.add(pessoa);
        }

        Pessoa o_maior_do_grupo = null;
        Pessoa o_menor_do_grupo = null;
        int quantidade_de_homens = 0;
        double soma_altura_mulheres = 0;
        int quantidade_mulheres_menores_1_68 = 0;
        
        for (Pessoa pessoa : pessoas) {
            if (o_maior_do_grupo == null) {
                o_maior_do_grupo = pessoa;
                o_menor_do_grupo = pessoa;
            }

            if (pessoa.sexo == 1) {
                quantidade_de_homens = quantidade_de_homens + 1;
            } else {
                soma_altura_mulheres = soma_altura_mulheres + pessoa.altura;

                if (pessoa.altura < 1.68) {
                    quantidade_mulheres_menores_1_68 = quantidade_mulheres_menores_1_68 + 1;
                }
            }

            if (pessoa.altura > o_maior_do_grupo.altura) {
                o_maior_do_grupo = pessoa;
            }

            if (pessoa.altura < o_menor_do_grupo.altura) {
                o_menor_do_grupo = pessoa;
            }
        }
        
        boolean b = true;
        
        if(b){
            System.out.println("true");
        }

        System.out.printf("O mais alto do grupo tem: %2f M", o_maior_do_grupo.altura);
        System.out.println("");

        System.out.printf("O menor do grupo tem: %2f M", o_menor_do_grupo.altura);
        System.out.println("");

        System.out.printf("A quantidade de homens é: %d", quantidade_de_homens);
        System.out.println("");

        int quantidade_de_mulheres = (pessoas.size() - quantidade_de_homens);

        System.out.printf("A quantidade de mulheres é: %d", quantidade_de_mulheres);
        System.out.println("");

        System.out.printf("A média da altura das mulheres é: %2f", soma_altura_mulheres / quantidade_de_mulheres);
        System.out.println("");

        double percentual_mulheres_abaixo_1_68 = (quantidade_mulheres_menores_1_68 * 100) / quantidade_de_mulheres;

        System.out.printf("O percentual das mulheres abaixo de 1,68 M é : %2f %%", percentual_mulheres_abaixo_1_68);
    }

    public static class Pessoa {

        private double altura;
        private int sexo;

        public Pessoa(double altura, int sexo) {
            this.altura = altura;
            this.sexo = sexo;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public int getSexo() {
            return sexo;
        }

        public void setSexo(int sexo) {
            this.sexo = sexo;
        }
    }
}
