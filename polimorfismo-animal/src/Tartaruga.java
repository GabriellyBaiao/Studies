public class Tartaruga extends Animal {

    public Tartaruga(String nome, int idade){
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("A Tartaruga não emite som!");
    }
}
