package br.com.vivo;

public class Programador extends Funcionario{

    private String linguagem, sistOper;

    public Programador(String nome, String mail, String linguagem) {
        super(nome, mail);
        setLinguagem(linguagem);
    }

    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }

    public void setSO(String sistOper){
        this.sistOper = sistOper;
    }

    public void exibeDados(){
        super.exibeDados();
        System.out.println("Linguagem: " + linguagem);
        System.out.println("SO: " + sistOper);
    }
}
