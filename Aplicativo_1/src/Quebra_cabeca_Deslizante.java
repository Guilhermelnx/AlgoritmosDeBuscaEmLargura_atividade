import java.util.*;

public class Quebra_cabeca_Deslizante {
    //busca em largura BFS
    public static int buscarEmLargura(String estadoInicial, String estadoObjetivo) {
        Queue<String> fila = new LinkedList<>();
        //histórico de movimentos
        Map<String, Integer> movimentos = new HashMap<>();
        Set<String> visitados = new HashSet<>();

        fila.add(estadoInicial);
        visitados.add(estadoInicial);
        movimentos.put(estadoInicial, 0);

        System.out.println("Estado Inicial recebido: " + estadoInicial);

        while (!fila.isEmpty()) {
            String estadoAtual = fila.poll();

            if (estadoAtual.equals(estadoObjetivo)) {
                System.out.println("Estado Alvo alcançado: " + estadoAtual);
                return movimentos.get(estadoAtual);
            }

            for (String vizinho : GerenciadorTabuleiro.obterVizinhos(estadoAtual)) {
                if (!visitados.contains(vizinho)) {
                    visitados.add(vizinho);
                    movimentos.put(vizinho, movimentos.get(estadoAtual) + 1); //n° de passos
                    fila.add(vizinho);
                }
            }
        }
        return -1;
    }
}
