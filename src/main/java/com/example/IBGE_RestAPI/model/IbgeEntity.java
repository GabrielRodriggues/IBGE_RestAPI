package com.example.IBGE_RestAPI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ibge")
public class IbgeEntity {
    @Id
    private String id;
    private String noticia;

    public IbgeEntity(){}

    public IbgeEntity(String id, String noticia) {
        this.id = id;
        this.noticia = noticia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }
}
