package producto2_065_BearsJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import producto2_065_BearsJava.service.VehiclesService;

@Controller
@RequestMapping("/vehicles")
public class VehiclesController {
    @Autowired
    private VehiclesService vehicleService;

    // Definimos los métodos para las operaciones CRUD y mapear las rutas
}
