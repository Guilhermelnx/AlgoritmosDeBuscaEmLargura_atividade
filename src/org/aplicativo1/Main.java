package src.org.aplicativo1;

public class Main {

    public static void main(String[] args) {

        String estadoInicial = "724506831";


        String estadoObjetivo = "012345678";

        System.out.println("Buscando a solução mais curta...");
        int movimentos = Quebra_cabeca_Deslizante.buscarEmLargura(estadoInicial, estadoObjetivo);

        if (movimentos != -1) {
            System.out.println("Feito! O número mínimo de movimentos necessários é: " + movimentos);
        } else {
            System.out.println("Este tabuleiro não possui solução.");
        }
    }
}
