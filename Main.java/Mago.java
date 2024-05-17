import java.util.Random;

class Mago extends Personagem {
    private final double cura = 0.05;
    private final double conflagrar = 0.10;

    
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public int calcularPontosVida() {
        Random random = new Random();
        int r = random.nextInt(11) - 5; // Número aleatório entre -5 e 5
        return 7 * getInteligencia() + r;
    }

    @Override
    public int calcularDano() {
        Random random = new Random();
        int r = random.nextInt(11) - 5; // Número aleatório entre -5 e 5
        return 2 * getInteligencia() + r;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCura: " + cura + "\nConflagrar: " + conflagrar;
    }
    public double getCura() {
        return cura;
    }

    public double getConflagrar() {
        return conflagrar;
    }
}
