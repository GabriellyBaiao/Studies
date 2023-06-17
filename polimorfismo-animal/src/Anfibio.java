public class Anfibio extends Animal {

    public Anfibio(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O anfíbio coaxou.");
    }
}
