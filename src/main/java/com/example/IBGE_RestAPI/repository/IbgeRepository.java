package com.example.IBGE_RestAPI.repository;

import com.example.IBGE_RestAPI.model.IbgeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IbgeRepository extends MongoRepository<IbgeEntity, String> {
}
