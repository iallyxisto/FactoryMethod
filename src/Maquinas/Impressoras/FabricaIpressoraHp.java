package Maquinas.Impressoras;

import FactoryMethod.FabricarMaquinas;
import FactoryMethod.MaquinasFactory;

public class FabricaIpressoraHp implements FabricarMaquinas {
    @Override
    public MaquinasFactory criarMaquinas() {
        return  new ImpresoraHp();
    }
     public  void imprimirDocumento(){
        System.out.println("imprimindo documennto");
    }
}
