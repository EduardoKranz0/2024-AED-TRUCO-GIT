import java.util.Scanner;

public class UserInteract {
    private Scanner scanner;

    public UserInteract() {
        this.scanner = new Scanner(System.in);
    }

    public int solicitarCarta(Jogador jogador) {
        System.out.println(jogador.getNome() + ", suas cartas são: " + jogador.getMao());
        System.out.print("Escolha uma carta para jogar (1, 2, ou 3): ");
        return scanner.nextInt() - 1;
    }
}