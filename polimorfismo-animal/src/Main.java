public class Main {
    public static void main(String[] args) {

        Animal p = new Passaro("Pardal", 2);
        Animal a = new Anfibio("Sapo", 3);
        Animal px = new Peixe("Tilápia",1);
        Animal tar = new Tartaruga("Tartaruga", 5);

        p.emitirSom();
        a.emitirSom();
        px.emitirSom();
        tar.emitirSom();
    }
}