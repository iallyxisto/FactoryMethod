package Maquinas.Impressoras;

import FactoryMethod.MaquinasFactory;

public class ImpresoraHp implements MaquinasFactory {


    @Override
    public void criarMaquinas() {
        System.out.println("Impressora Hp criada");
    }
}
