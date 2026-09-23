package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L; // Casting (Estou forçando um numero maior q o int suporta)
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("char " + caracter);
        System.out.println("Oi meu nome é " + nome);
    }
}
