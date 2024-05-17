import java.util.Random;

class Guerreiro extends Personagem {
    private final double adrenalina = 0.08;
    private final double heroismo = 0.06;

    
    public Guerreiro(String nome) {
        super(nome);
    }

    @Override //@Override, significando que estamos sobrescrevendo o método da superclasse.
    public int calcularPontosVida() {
        Random random = new Random();
        int r = random.nextInt(11) - 5; // Número aleatório entre -5 e 5
        return 5 * getForca() + r;
    }

    @Override
    public int calcularDano() {
        Random random = new Random();
        int r = random.nextInt(11) - 5; // Número aleatório entre -5 e 5
        return 3 * getForca() + r;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAdrenalina: " + adrenalina + "\nHeroísmo: " + heroismo;
    }

    public double getAdrenalina() {
        return adrenalina;
    }

    public double getHeroismo() {
        return heroismo;
    }
}