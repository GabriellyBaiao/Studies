public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Instrutor("João", "joao@mail.com", 59, "Matemática");
        funcionarios[1] = new Instrutor("Maria", "maria@mail.com", 27, "Algoritmos");
        funcionarios[2] = new Programador("Pedro", "pedro@mail.com", 30, "Java", "Linux");

        for (Funcionario f : funcionarios) {
            f.exibeDados();
            System.out.println();
        }
    }
}
