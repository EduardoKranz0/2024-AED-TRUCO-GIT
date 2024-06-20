public class Rodada {
    private Carta cartaJogador1;
    private Carta cartaJogador2;

    public void jogarCartas(Carta carta1, Carta carta2) {
        this.cartaJogador1 = carta1;
        this.cartaJogador2 = carta2;
    }

    public int determinarVencedor() {
        String[] ordem = {"4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"};
        int rank1 = -1;
        int rank2 = -1;

        for (int i = 0; i < ordem.length; i++) {
            if (cartaJogador1.getValor().equals(ordem[i])) {
                rank1 = i;
            }
            if (cartaJogador2.getValor().equals(ordem[i])) {
                rank2 = i;
            }
        }

        if (rank1 > rank2) {
            return 1;
        } else if (rank2 > rank1) {
            return 2;
        } else {
            return 0;
        }
    }
}