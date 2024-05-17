import java.util.Random;

class Arqueiro extends Personagem {
    private final double tiroCerteiro = 0.15;
    private final double camuflagem = 0.03;

    public Arqueiro(String nome) {
        super(nome);
    }


    @Override
    public int calcularPontosVida() {
        Random random = new Random();
        int r = random.nextInt(11) - 5; // Número aleatório entre -5 e 5
        return 4 * getAgilidade() + r;
    }

    @Override
    public int calcularDano() {
        Random random = new Random();
        int r = random.nextInt(11) - 5; // Número aleatório entre -5 e 5
        return 2 * getAgilidade() + r;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTiro Certeiro: " + tiroCerteiro + "\nCamuflagem: " + camuflagem;
    }

    public double getTiroCerteiro() {
        return tiroCerteiro;
    }

    public double getCamuflagem() {
        return camuflagem;
    }
}