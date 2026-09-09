public class Main {

    public static void main(String[] args) {
        // matriz bagunçada representada como String (o 0 é o espaço vazio)
        // exemplo de matriz:
        // 1 2 3
        // 5 6 0
        // 7 8 4
        String estadoInicial = "724506831";

        // estado objetivo organizado: 123456780

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
