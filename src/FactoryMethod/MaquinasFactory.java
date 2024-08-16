package FactoryMethod;

import Maquinas.Impressoras.ImpresoraHp;

public interface MaquinasFactory {
    // define um contrarto que obriga a implementação de um metodo que cria
    // define um contrato para as Fabricas que realmente criam as instaÇancias concretas de máquinas
    public void criarMaquinas();
}
