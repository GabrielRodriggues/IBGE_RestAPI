package com.example.IBGE_RestAPI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ibge")
public class IbgeEntity {
    @Id
    private String id;
    private String modelo;
    private String count;
    private String page;
    private String totalPages;
    private String nextPage;
    private String previousPage;
    private String showingFrom;
    private String showingTo;
    private String items;

    public IbgeEntity() {

    }

    public IbgeEntity(String id, String modelo, String count, String page, String totalPages, String nextPage,String previousPage, String showingFrom, String showingTo, String items) {
        this.id = id;
        this.modelo = modelo;
        this.count = count;
        this.page = page;
        this.totalPages = totalPages;
        this.nextPage = nextPage;
        this.previousPage = previousPage;
        this.showingFrom = showingFrom;
        this.showingTo = showingTo;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCount() {
        return count;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }
    public void setPreviousPage(String previousPage) {
        this.previousPage = previousPage;
    }
    public void setShowingFrom(String showingFrom) {
        this.showingFrom = showingFrom;
    }
    public void setShowingTo(String showingTo) {
        this.showingTo = showingTo;
    }
    public void setItems(String items) {
        this.items = items;
    }
}
