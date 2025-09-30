public class AtividadeRandom {
    public static void main(String[] args) {
        // ======================
        // Exercício 1 – Quem começa o jogo?
        // ======================
        // O sistema deve escolher aleatoriamente quem inicia: Jogador 1 ou Jogador 2.
        // Pergunta: Por que multiplicamos Math.random() por esse número?
        int sorteio1 = (int) (Math.random() * 2); // complete aqui
        if (sorteio1 == 0) {
            System.out.println("Jogador 1 começa!");
        } else {
            System.out.println("Jogador 2 começa!");
        }
        // ======================
        // Exercício 2 – Sorteando os pontos de bônus
        // ======================
        // Cada rodada dá 10, 20 ou 30 pontos extras para o vencedor.
        // Pergunta: O que acontece se eu tirar o +1?
        int sorteio2 = (int) (Math.random() * 3) + 1; // complete aqui
        int pontos = sorteio2 * 10; // transforma 1→10, 2→20, 3→30

        System.out.println("Parabéns! Você ganhou " + pontos + " pontos.");

        // ======================
        // Exercício 3 – Roleta da Sorte
        // ======================
        // No final do torneio, os jogadores giram uma roleta que dá um número de 1 a 100.
        // Pergunta: Qual é a função do +1 nesse caso?
        int numero = (int) (Math.random() * 100) + 1; // complete aqui
        System.out.println("O resultado é: "+ numero);
    }
}