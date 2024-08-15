package Maquinas.Multifuncional;

import FactoryMethod.FabricarMaquinas;
import FactoryMethod.MaquinasFactory;

public class FabricaMultifuncional implements FabricarMaquinas {
    @Override
    public MaquinasFactory criarMaquinas() {
        return new  PoderosaMaquina();
    }

}
