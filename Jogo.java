public class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;
    private Baralho baralho;
    private UserInteract ui;

    public Jogo(String nomeJogador1, String nomeJogador2) {
        jogador1 = new Jogador(nomeJogador1);
        jogador2 = new Jogador(nomeJogador2);
        baralho = new Baralho();
        ui = new UserInteract();
    }

    public void distribuirCartas() {
        for (int i = 0; i < 3; i++) {
            jogador1.receberCarta(baralho.distribuirCarta());
            jogador2.receberCarta(baralho.distribuirCarta());
        }
    }

    public void jogar() {
        distribuirCartas();

        for (int i = 0; i < 3; i++) {
            Rodada rodada = new Rodada();
            int indiceCartaJogador1 = ui.solicitarCarta(jogador1);
            int indiceCartaJogador2 = ui.solicitarCarta(jogador2);

            Carta cartaJogador1 = jogador1.jogarCarta(indiceCartaJogador1);
            Carta cartaJogador2 = jogador2.jogarCarta(indiceCartaJogador2);

            rodada.jogarCartas(cartaJogador1, cartaJogador2);

            int vencedor = rodada.determinarVencedor();
            if (vencedor == 1) {
                System.out.println("Jogador 1 ganhou a rodada!");
            } else if (vencedor == 2) {
                System.out.println("Jogador 2 ganhou a rodada!");
            } else {
                System.out.println("Empate na rodada!");
            }
        }
    }
}