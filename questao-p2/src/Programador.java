class Programador extends Funcionario {
    private String linguagem;
    private String sistOper;

    public Programador(String nome, String mail, int idade, String linguagem, String sistOper) {
        super(nome, mail, idade);
        this.linguagem = linguagem;
        this.sistOper = sistOper;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void setSO(String sistOper) {
        this.sistOper = sistOper;
    }

    public void exibeDados() {
        super.exibeDados();
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Sistema Operacional: " + sistOper);
    }
}