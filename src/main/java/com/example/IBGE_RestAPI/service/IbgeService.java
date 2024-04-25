package com.example.IBGE_RestAPI.service;

import com.example.IBGE_RestAPI.model.IbgeEntity;
import com.example.IBGE_RestAPI.repository.IbgeRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IbgeService {
    @Autowired
    private IbgeRepository ibgeRepository;

    private String consultarURL(String apiUrl){
        String dados = "";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
        inserirDados(dados);
        return dados;
    }
    public String consultarMarcas() {
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias");
    }

    /*public String consultarModelos(int id) {
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+id+"/modelos");
    }

    public String consultarAnos(int marca, int modelo) {
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+marca+"/modelos/"+modelo+"/anos");
    }

    public String consultarValor(int marca, int modelo, String ano) {
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+marca+"/modelos/"+modelo+"/anos/"+ano);
    }*/

    public void inserirDados(String dadosIbge) {
      IbgeEntity ie = new IbgeEntity();
      ie.setNoticia(dadosIbge);
      ibgeRepository.save(ie);
    }


}
