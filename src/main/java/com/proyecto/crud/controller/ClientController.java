package com.proyecto.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.crud.models.entities.Client;
import com.proyecto.crud.models.entities.Country;
import com.proyecto.crud.models.services.IClientService;
import com.proyecto.crud.models.services.ICountryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/views/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @Autowired
    private ICountryService countryService;

    @GetMapping("/index")
    public String index(Model model) {

        List<Client> listClient = clientService.listAll();

        model.addAttribute("title", "Listado de Clientes");
        model.addAttribute("list", listClient);
        return "/views/client/index";
    }

    @GetMapping("/create")
    public String create(Model model) {

        Client client = new Client();
        List<Country> countries = countryService.index();

        model.addAttribute("client", client);
        model.addAttribute("country", countries);

        return "/views/client/create";
    }

    @PostMapping("/store")
    public String store(@ModelAttribute Client client) {
        clientService.save(client);
        return "redirect:/views/client/index";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long client_id, Model model) {

        Client client = clientService.show(client_id);
        List<Country> countries = countryService.index();

        model.addAttribute("client", client);
        model.addAttribute("country", countries);

        return "/views/client/create";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long client_id) {
        clientService.delete(client_id);
        return "redirect:/views/client/index";
    }
}
