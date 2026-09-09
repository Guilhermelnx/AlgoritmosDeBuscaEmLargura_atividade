package src.org.principal;
import src.org.aplicativo1.Main;
import src.org.aplicativo2.RotaViagem;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n=================================================");
            System.out.println("   TRABALHO DE ALGORITMOS - BUSCA EM LARGURA (BFS) ");
            System.out.println("=================================================");
            System.out.println("1 - Rodar Aplicativo 1 (Quebra-cabeça Deslizante)");
            System.out.println("2 - Rodar Aplicativo 2 (Rota para Pirenópolis)");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("\n--- Iniciando Quebra-cabeça ---");
                        // Chama o main da classe do Gilvan passando null nos argumentos
                        Main.main(null);
                        break;
                    case 2:
                        System.out.println("\n--- Iniciando Rota de Viagem ---");
                        // Chama o main da classe do Matheus passando null nos argumentos
                        RotaViagem.main(null);
                        break;
                    case 3:
                        System.out.println("\nSaindo... Apresentação finalizada com sucesso!");
                        break;
                    default:
                        System.out.println("\nOpção inválida! Digite 1, 2 ou 3.");
                }
            } else {
                System.out.println("\nEntrada inválida! Por favor, digite um número.");
                scanner.next(); // Limpa a entrada errada do buffer
            }
        }
        scanner.close();
    }
}