package br.com.ada.persistence;

import br.com.ada.model.Cliente;

public class ClienteRepository extends Repository<Cliente> {
    private static ClienteRepository instance = null;
    public static synchronized ClienteRepository getInstance() {
        if (instance == null) {
            instance = new ClienteRepository();
        }
        return instance;
    }


}