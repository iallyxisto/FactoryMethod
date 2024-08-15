package Maquinas.Digitalizadoras;

import FactoryMethod.FabricarMaquinas;
import FactoryMethod.MaquinasFactory;

public class FabricaDigitalizadora implements FabricarMaquinas {

    @Override
    public MaquinasFactory criarMaquinas() {
        return new Digitalizadora();
    }
}
