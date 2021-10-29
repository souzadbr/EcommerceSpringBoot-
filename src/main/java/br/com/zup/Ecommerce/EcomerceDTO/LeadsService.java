package br.com.zup.Ecommerce.EcomerceDTO;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LeadsService {
    private List<LeadsDTO> ecommerce = new ArrayList<>();



    public void salvarLead(LeadsDTO leadsDTO) {
        ecommerce.add(leadsDTO);
    }

    public List<LeadsDTO> pegarTodososLeads (){
            return ecommerce;
        }

    public LeadsDTO buscarLead(String nomeDoLead){

        for(LeadsDTO objeto : ecommerce){
            if(objeto.getNome().equals(nomeDoLead)){
                return objeto;
            }
        }
         throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não encontrei");
    }

    public LeadsDTO atualizarLead(String nomeDoLead, LeadsDTO leadsDTO){
        LeadsDTO lead = buscarLead(nomeDoLead);
        lead.setEmail(leadsDTO.getEmail());
        lead.setNome(leadsDTO.getNome());
        lead.setTelefone(leadsDTO.getTelefone());
        lead.setProdutoDTOS(leadsDTO.getProdutoDTOS());

        return lead;
    }


}

