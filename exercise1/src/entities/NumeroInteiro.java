package entities;


    public class NumeroInteiro {
        private int valor;

        public NumeroInteiro(int valor) {
            this.valor = valor;
        }

        public boolean ehPar() {
            return valor % 2 == 0;
        }

        public boolean ehPrimo() {
            if (valor < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(valor); i++) {
                if (valor % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public int fatorial() {
            int fatorial = 1;
            for (int i = 1; i <= valor; i++) {
                fatorial *= i;
            }
            return fatorial;
        }

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }
    }

