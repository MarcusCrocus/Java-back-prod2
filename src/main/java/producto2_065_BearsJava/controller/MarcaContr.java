package producto2_065_BearsJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import producto2_065_BearsJava.model.MarcaVehiculo;
import producto2_065_BearsJava.model.TipoVehiculo;
import producto2_065_BearsJava.repository.MarcaVehiculoRepo;
import producto2_065_BearsJava.repository.TipoVehiculosRepo;

import java.util.List;

@Controller

public class MarcaContr {
    @Autowired
    private MarcaVehiculoRepo marcaVehiculoRepo;
    @Autowired
    private TipoVehiculosRepo tipoVehiculosRepo;

    @GetMapping ("/marcas/new")
    public String showCreateMarcaForm(Model model){
        List<TipoVehiculo> tipoVehiculoList = tipoVehiculosRepo.findAll();
        model.addAttribute("tipoVehiculoList", tipoVehiculoList);

        model.addAttribute("marca", new MarcaVehiculo());
        return "marca/marca_form";
    }
    @PostMapping("marcas/save")
    public String saveMarca(MarcaVehiculo marcaVehiculo){
        marcaVehiculoRepo.save(marcaVehiculo);
        return "redirect:/listamarcas_form";
    }
}
