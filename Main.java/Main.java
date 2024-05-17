public class Main {
    public static void main(String[] args) {
        // Exemplo de utilização das classes
        Guerreiro guerreiro = new Guerreiro("Natifer Ulaan");
        guerreiro.setForca(20);
        guerreiro.setAgilidade(10);
        guerreiro.setInteligencia(5);
        guerreiro.setPontosVida(guerreiro.calcularPontosVida());
        System.out.println("Guerreiro: ");
        System.out.println(guerreiro);
        System.out.println("Dano: " + guerreiro.calcularDano());

        Arqueiro arqueiro = new Arqueiro("Synx Bakalyn");
        arqueiro.setForca(10);
        arqueiro.setAgilidade(20);
        arqueiro.setInteligencia(5);
        arqueiro.setPontosVida(arqueiro.calcularPontosVida());
        System.out.println("\nArqueiro: ");
        System.out.println(arqueiro);
        System.out.println("Dano: " + arqueiro.calcularDano());

        Mago mago = new Mago("Nemesys du Vale");
        mago.setForca(15);
        mago.setAgilidade(15);
        mago.setInteligencia(20);
        mago.setPontosVida(mago.calcularPontosVida());
        System.out.println("\nMago: ");
        System.out.println(mago);
        System.out.println("Dano: " + mago.calcularDano());
    }
}