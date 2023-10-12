package producto2_065_BearsJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import producto2_065_BearsJava.model.Clientes;
import producto2_065_BearsJava.service.ClientesServ;

@Controller
public class ClientesContr {

    @Autowired
    private ClientesServ clientesServ;
    // mostrar lista de clientes
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listaClientes", clientesServ.getAllClientes());
        return "index";
    }
    @GetMapping("/showNewClientForm")
    public String showNewClientForm(Model model){
        // creamos atributo de modelo para vincular datos de formulario
        Clientes cli = new Clientes();
        model.addAttribute("cliente", cli);
        return "new_cliente";
    }
@PostMapping("/saveCliente")
    //creamos meta-handler
    public String saveCliente(@ModelAttribute("cliente") Clientes cli ){
        //guardamos clientes en DDBB
        clientesServ.guardarCliente(cli);
        return "redirect:/"; //viewHomePage
}
}
