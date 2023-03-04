package br.com.ada.persistence;

import br.com.ada.model.Carro;
import br.com.ada.model.Cliente;

public class CarroRepository extends Repository<Carro> {
    private static CarroRepository instance = null;
    public static synchronized CarroRepository getInstance() {
        if (instance == null) {
            instance = new CarroRepository();
        }
        return instance;
    }


}