package producto2_065_BearsJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import producto2_065_BearsJava.model.TipoVehiculo;
import producto2_065_BearsJava.repository.TipoVehiculosRepo;


import java.util.List;
@Controller
public class TipoVehiculoContr {
    @Autowired
    private TipoVehiculosRepo repo;

    @GetMapping("/tipovehiculos")
    public String listTipoVehiculos(Model model){
        List<TipoVehiculo> listTipoVehiculos = repo.findAll();
        model.addAttribute("listTipoVehiculos", listTipoVehiculos);


        System.out.println("Number of TipoVehiculos: " + listTipoVehiculos.size());

        // Add log statements to verify the data
        for (TipoVehiculo tipoVehiculo : listTipoVehiculos) {
            System.out.println("ID: " + tipoVehiculo.getId() + ", Name: " + tipoVehiculo.getName());
        }
        return "vehiculos/tipovehiculos";
    }
    @GetMapping("/tipovehiculos/new")
    public String showTipovehiculosNewFrom(Model model){
        model.addAttribute("tipovehiculo", new TipoVehiculo());
            return "vehiculos/tipovehiculo_form";

    }
    //TODO: no funciona la parte de editar tipo de vehiculo, se esta creando nuevo reguistro de vehiculo
    @PostMapping("/tipodevehiculos/save")
    public String saveTipoVehiculo(TipoVehiculo vh){
        TipoVehiculo existingTipoVehiculo = repo.findByName(vh.getName());

        if (existingTipoVehiculo != null) {
            // Tipo de vehículo ya existe, actualiza sus datos en lugar de crear uno nuevo
            existingTipoVehiculo.setName(vh.getName());
            repo.save(existingTipoVehiculo);
        } else {
            // No existe un tipo de vehículo con ese nombre, puedes guardar el nuevo
            repo.save(vh);
        }

        return "redirect:/tipovehiculos";
    }

// Para poder editar reguistro con tipo de vehiculo

    @GetMapping("/tipovehiculos/edit/{id}")
    public String showEditTipoVehiculoForm(@PathVariable("id") int id, Model model) {
        TipoVehiculo tipoVehiculo = repo.findById(id).orElse(null);
        if (tipoVehiculo != null) {
            model.addAttribute("tipovehiculo", tipoVehiculo);
            return "vehiculos/tipovehiculo_form";
        } else {
            //TODO: Manejar el caso donde el TipoVehiculo con el ID dado no existe
            return "redirect:/tipovehiculos";
        }
    }
    //TODO: añadir botton de eliminar
}
