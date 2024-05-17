abstract class Personagem {
    private String nome;
    private int forca;
    private int agilidade;
    private int inteligencia;
    private int pontosVida;

    
    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getPontosVida() {
        return pontosVida;
    }
    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    // Métodos abstratos para calcular pontos de vida e dano
    public abstract int calcularPontosVida();

    public abstract int calcularDano();

    // Método para calcular o dano recebido
    public void receberDano(int dano) {
        pontosVida -= dano;
    }

    
    @Override //@Override, significando que estamos sobrescrevendo o método da superclasse.
    public String toString() {
        return "Nome: " + nome + "\nForça: " + forca + "\nAgilidade: " + agilidade +
               "\nInteligência: " + inteligencia + "\nPontos de Vida: " + pontosVida;
    }
}