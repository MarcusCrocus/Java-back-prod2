package producto2_065_BearsJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import producto2_065_BearsJava.model.Clientes;
import producto2_065_BearsJava.model.Coche;
import producto2_065_BearsJava.model.Vehicles;
import producto2_065_BearsJava.service.VehiclesService;

@Controller

public class VehiclesController {
    @Autowired
    private VehiclesService vehicleService;
    @GetMapping("/vehiculosTable")
    public String vehiculosTable(Model model){
        model.addAttribute("listaVehiculos", vehicleService.getAllVehicles());
        return "vehiculos/vehiculos_table";
    }
    // Definimos los métodos para las operaciones CRUD y mapear las rutas
    @GetMapping("/showNewVehicles")
    public String showNewVehicles(Model model){
        Coche ch = new Coche();
        model.addAttribute("vehicle", ch);
        return "vehiculos/new_coche";
    }

    @PostMapping("/saveCoche")
    public String saveCoche(@ModelAttribute("vehicle") Vehicles vh){
        vehicleService.guardarVehicle(vh);
        return "redirect:/vehiculosTable";
    }

}
