import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        String[] valores = {"4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"};
        for (Naipe naipe : Naipe.values()) {
            for (String valor : valores) {
                cartas.add(new Carta(valor, naipe));
            }
        }
        Collections.shuffle(cartas);
    }

    public Carta distribuirCarta() {
        return cartas.remove(0);
    }
}