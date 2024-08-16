package Maquinas.Copiadoras;

import FactoryMethod.MaquinasFactory;

public class Copiadora implements MaquinasFactory {
    @Override
    public void criarMaquinas() {

    }
    public  void xerox(){
        System.out.println("copiando xerox");
    }


}