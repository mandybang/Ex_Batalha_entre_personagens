import java.util.Random;

// Interface Jogo
interface Jogo {
    // Métodos abstratos
    void iniciar();
    void jogar();
    void finalizar();
}

// Classe JogoBatalha que implementa a Interface Jogo
public class JogoBatalha implements Jogo {
    // Atributos
    private int forca;
    private int agilidade;
    private int inteligencia;

    // Método para setar atributos com valores aleatórios de acordo com o tipo de personagem
    public void setAtributos(String tipo) {
        Random rand = new Random();
        switch (tipo) {
            case "Guerreiro":
                this.forca = rand.nextInt(101); // Força varia de 0 a 100
                this.agilidade = rand.nextInt(51); // Agilidade varia de 0 a 50
                this.inteligencia = rand.nextInt(51); // Inteligência varia de 0 a 50
                break;
            case "Arqueiro":
                this.forca = rand.nextInt(51); // Força varia de 0 a 50
                this.agilidade = rand.nextInt(101); // Agilidade varia de 0 a 100
                this.inteligencia = rand.nextInt(51); // Inteligência varia de 0 a 50
                break;
            case "Mago":
                this.forca = rand.nextInt(51); // Força varia de 0 a 50
                this.agilidade = rand.nextInt(51); // Agilidade varia de 0 a 50
                this.inteligencia = rand.nextInt(101); // Inteligência varia de 0 a 100
                break;
            default:
                System.out.println("Tipo de personagem inválido.");
        }
    }

    // Implementação dos métodos da interface Jogo
    @Override
    public void iniciar() {
        System.out.println("Iniciando jogo de batalha...");
    }

    @Override
    public void jogar() {
        System.out.println("Jogando o jogo de batalha...");
    }

    @Override
    public void finalizar() {
        System.out.println("Finalizando jogo de batalha...");
    }

    // Método para exibir os atributos do personagem
    public void exibirAtributos() {
        System.out.println("Força: " + this.forca);
        System.out.println("Agilidade: " + this.agilidade);
        System.out.println("Inteligência: " + this.inteligencia);
    }

    // Método main para testar a classe JogoBatalha
    public static void main(String[] args) {
        JogoBatalha jogo = new JogoBatalha();
        jogo.iniciar();
        jogo.setAtributos("Guerreiro");
        System.out.println("\nAtributos do Guerreiro:");
        jogo.exibirAtributos();
        jogo.jogar();
        jogo.finalizar();
    }
}
