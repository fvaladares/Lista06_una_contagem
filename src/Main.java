import src.Voo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int QTD_AVIOES = 12;
        int numeroVoo = 0;
        String origemVoo;
        String destinoVoo;
        int acentosVoo;
        Scanner s = new Scanner(System.in);
        Voo[] voos = new Voo[QTD_AVIOES];

        System.out.println("Insira as informaçoes sobre os voos");
        for (int i = 0; i < QTD_AVIOES; i++) {
            System.out.print("Numero do voo " + i + 1 + ": ");
            numeroVoo = s.nextInt();
            System.out.print("Origem do voo " + i + 1 + ": ");
            origemVoo = s.nextLine();
            System.out.print("Destino do voo " + i + 1 + ": ");
            destinoVoo = s.nextLine();
            System.out.print("Quantidade de acentos do voo " + i + 1 + ": ");
            acentosVoo = s.nextInt();
            voos[i] = new Voo(numeroVoo,
                    origemVoo,
                    destinoVoo,
                    acentosVoo);
        }

        System.out.println(voos[0].getOrigem());
        for (int i = 0; i < QTD_AVIOES; i++) {

            if(voos[i].validarNumeroVoo(123)) {

            }
                // salvar o indice e encerrar oloop

        }
    }
}

/*

 int x, y, z, k, l;
        char op;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a operaçao desjada: ");
        x = s.nextInt();
        op = s.next().charAt(0);
        y = s.nextInt();
        System.out.println();
        System.out.println(x + op + y);

        switch (op) {
            case '+':
                System.out.println("Adiçao");
                break;
            case '-':
                System.out.println("Subtraçao");
                break;
            default:
                System.out.println("NAO SEI...");
                break;
        }
 */