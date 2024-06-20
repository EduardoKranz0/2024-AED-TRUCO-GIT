public class Carta {
    private String valor;
    private Naipe naipe;

    public Carta(String valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public String getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}