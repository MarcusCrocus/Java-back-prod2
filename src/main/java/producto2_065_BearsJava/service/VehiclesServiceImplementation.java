package producto2_065_BearsJava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import producto2_065_BearsJava.model.Coche;
import producto2_065_BearsJava.model.Vehicles;
import producto2_065_BearsJava.repository.VehiclesRepo;

import java.util.List;

@Service
public class VehiclesServiceImplementation implements VehiclesService{
    // Implementar los métodos de servicio

    @Autowired
    private VehiclesRepo vehiclesRepo;

    @Override
    public List<Vehicles> getAllVehicles() {
        return vehiclesRepo.findAll();
    }

    @Override
    public void guardarVehicle(Vehicles vh) {
        this.vehiclesRepo.save(vh);
    }


}
