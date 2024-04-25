package Factory;

import Factory.luxo.CarroLuxo;
import Factory.luxo.MotoLuxo;

public class FabricaLuxoVeiculo implements FabricaVeiculo{
    @Override
    public Carro createCar() {
        return new CarroLuxo();
    }

    @Override
    public Moto createMoto() {
        return new MotoLuxo();
    }
}
