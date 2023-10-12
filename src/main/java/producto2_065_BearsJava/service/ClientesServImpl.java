package producto2_065_BearsJava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import producto2_065_BearsJava.model.Clientes;
import producto2_065_BearsJava.repository.ClientesRepo;

import java.util.List;
@Service
public class ClientesServImpl implements ClientesServ {

    @Autowired
    private ClientesRepo clientesRepo;
    @Override
    public List<Clientes> getAllClientes() {
        return clientesRepo.findAll();
    }

    @Override
    public void guardarCliente(Clientes cli) {
        this.clientesRepo.save(cli);
    }
}
