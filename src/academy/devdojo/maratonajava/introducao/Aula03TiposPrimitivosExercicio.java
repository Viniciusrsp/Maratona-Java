package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Kirito";
        String endereco = "AV Joao das Galileias";
        double salario = 5000;
        String dataRecebimentoSalario = "20/12/2021";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco +
                "\n confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
