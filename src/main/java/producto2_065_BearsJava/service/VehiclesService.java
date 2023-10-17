package producto2_065_BearsJava.service;

import producto2_065_BearsJava.model.Coche;
import producto2_065_BearsJava.model.Vehicles;

import java.util.List;

public interface VehiclesService {
    // Definir métodos de servicio para las operaciones CRUD
    List <Vehicles> getAllVehicles();
    void guardarVehicle(Vehicles vh);
}
