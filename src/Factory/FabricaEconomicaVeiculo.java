package Factory;

import Factory.economica.CarroEconomico;
import Factory.economica.MotoEconomico;

public class FabricaEconomicaVeiculo implements FabricaVeiculo{
    @Override
    public Carro createCar() {
        return new CarroEconomico();
    }

    @Override
    public Moto createMoto() {
        return new MotoEconomico();
    }
}
