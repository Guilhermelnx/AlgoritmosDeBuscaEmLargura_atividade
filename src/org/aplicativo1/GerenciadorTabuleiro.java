package src.org.aplicativo1;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTabuleiro {
    //transforma a String em um vetor de caracteres e gera as novas Strings
    public static List<String> obterVizinhos(String estadoAtual) {
        List<String> vizinhos = new ArrayList<>();

        // acha o índice do espaço vazio (0) na String
        int posicaoZero = estadoAtual.indexOf('0');

        // linhas e colunas feitas com divisão e resto
        int linha = posicaoZero / 3;
        int coluna = posicaoZero % 3;

        // vetores de controle para mover: Cima, Baixo, Esquerda e Direita
        int[] movLinha = {-1, 1, 0, 0};
        int[] movColuna = {0, 0, -1, 1};

        // testa as 4 direções de movimento
        for (int i = 0; i < 4; i++) {
            int novaLinha = linha + movLinha[i];
            int novaColuna = coluna + movColuna[i];

            //limites da represntação 3x3
            if (novaLinha >= 0 && novaLinha < 3 && novaColuna >= 0 && novaColuna < 3) {
                //trocas
                int novaPosicaoZero = novaLinha * 3 + novaColuna;
                char[] caracteres = estadoAtual.toCharArray();
                char temporario = caracteres[posicaoZero];
                caracteres[posicaoZero] = caracteres[novaPosicaoZero];
                caracteres[novaPosicaoZero] = temporario;

                //nova String
                vizinhos.add(new String(caracteres));
            }
        }
        return vizinhos;
    }
}
