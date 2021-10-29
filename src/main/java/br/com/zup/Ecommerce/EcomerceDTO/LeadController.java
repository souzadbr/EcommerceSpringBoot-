package br.com.zup.Ecommerce.EcomerceDTO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {

    @Autowired
    private LeadsService leadsService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrasLead(@RequestBody LeadsDTO leadsDTO) {
        leadsService.salvarLead(leadsDTO);
    }

    @GetMapping
    public List<LeadsDTO> exibirTodosOsLeads() {
        return leadsService.pegarTodososLeads();
    }

    @GetMapping("/{nomedoLead}")
    public LeadsDTO exibirLead(@PathVariable String nomedoLead) {

        return leadsService.buscarLead(nomedoLead);
    }

    @PutMapping("/{nomeDoLead}")
    public LeadsDTO atualizarLead(@PathVariable String nomeDoLead, @RequestBody LeadsDTO leadsDTO) {
        return leadsService.atualizarLead(nomeDoLead,leadsDTO);
    }
}
