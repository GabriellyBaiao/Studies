import java.util.Scanner;

/*
Receba a hora de início e de final de um jogo (HH,MM) sabendo que o
tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
 */
public class DuracaoJogo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora e o minuto de início do jogo (HH,MM):");
        int horaInicio = sc.nextInt();
        int minutoInicio = sc.nextInt();

        System.out.println("Digite a hora e o minuto de final do jogo (HH,MM):");
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int duracaoHora, duracaoMinuto;

        if (horaInicio > horaFinal || (horaInicio == horaFinal && minutoInicio > minutoFinal)) {
            duracaoHora = (24 - horaInicio) + horaFinal;
            duracaoMinuto = (60 - minutoInicio) + minutoFinal;

            if (duracaoMinuto >= 60) {
                duracaoHora += duracaoMinuto / 60;
                duracaoMinuto %= 60;
            }
        } else {
            duracaoHora = horaFinal - horaInicio;
            duracaoMinuto = minutoFinal - minutoInicio;

            if (duracaoMinuto < 0) {
                duracaoHora--;
                duracaoMinuto += 60;
            }
        }

        System.out.printf("A duração do jogo foi de %d:%02d horas.", duracaoHora, duracaoMinuto);

        sc.close();
        }
    }
