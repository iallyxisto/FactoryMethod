package Maquinas.Copiadoras;

import FactoryMethod.FabricarMaquinas;
import FactoryMethod.MaquinasFactory;

public class FabricaCopiadora implements FabricarMaquinas {

    @Override
    public MaquinasFactory criarMaquinas() {
        return new Copiadora();
    }
}
