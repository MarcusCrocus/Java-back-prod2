package producto2_065_BearsJava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import producto2_065_BearsJava.repository.VehiclesRepo;

@Service
public class VehiclesServiceImplementation implements VehiclesService{
    @Autowired
    private VehiclesRepo vehiclesRepo;

    // Implementar los métodos de servicio
}
