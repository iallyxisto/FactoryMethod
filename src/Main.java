import FactoryMethod.LogisticaDeFabricacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LogisticaDeFabricacao fabricacao = new LogisticaDeFabricacao();
        Scanner sc = new Scanner(System.in);
        int op;
        op = sc.nextInt();
        fabricacao.FabricarMaquinas(op);
        System.out.println(fabricacao.toString());


    }
}
