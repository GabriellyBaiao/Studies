public abstract class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void emitirSom() {
        System.out.println("O animal emitiu um som.");
    }
}
