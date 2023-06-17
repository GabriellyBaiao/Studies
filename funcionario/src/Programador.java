public class Programador extends Funcionario {

    private String linguagem;
    private String sistOper;

    public Programador(String nome, String mail, int idade, String linguagem, String sistOper){
        super(nome, mail, idade);
        this.linguagem = linguagem;
        this.sistOper = sistOper;
    }

    public void setLinguagem(String ling){
        linguagem = ling;
    }

    public void setSO(String so){
        sistOper = so;
    }

    public void exibeDados() {
        super.exibeDados();
        System.out.printf("Linguagem: %s\nSistema Operacional: %s\n", linguagem, sistOper);
    }
}
