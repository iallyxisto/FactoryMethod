package FactoryMethod;


import Maquinas.Copiadoras.FabricaCopiadora;
import Maquinas.Digitalizadoras.FabricaDigitalizadora;
import Maquinas.Impressoras.FabricaIpressoraHp;
import Maquinas.Multifuncional.FabricaMultifuncional;
import Maquinas.Multifuncional.PoderosaMaquina;

public class LogisticaDeFabricacao {

    public void FabricarMaquinas(int op) {
        FabricarMaquinas  maquinaFabricada ;
        Object produtoCriado;
        switch (op) {
            case 1:
                maquinaFabricada = new FabricaIpressoraHp();
                produtoCriado = maquinaFabricada;
               System.out.println("Impressora Hp selecionada");
                break;
            case 2:
                maquinaFabricada = new FabricaDigitalizadora();
                System.out.println("Digitalizadora selecionada");
                break;
            case 3:
                maquinaFabricada = new FabricaCopiadora();
                System.out.println("Copiadora selecionada");
                break;
                case 4:
                    maquinaFabricada = new FabricaMultifuncional();
                    produtoCriado = maquinaFabricada.criarMaquinas();
                    System.out.println("Multifuncional selecionada");
                    if (produtoCriado instanceof PoderosaMaquina) {
                        PoderosaMaquina poderosaMaquina = (PoderosaMaquina) produtoCriado;
                        poderosaMaquina.imprimir();
                        poderosaMaquina.digitalizar();
                        poderosaMaquina.copiar();
                    }


                    break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }


}
