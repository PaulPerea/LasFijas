package com.example.examen.repository;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.examen.entity.Pais;

public interface PaisRepository extends MongoRepository<Pais,ObjectId>{

    public abstract List<Pais> findByName(String name);

    @Query("{'altSpellings' : { $in: ?0 } }")
    public abstract List<Pais> listaPoraltSpellings(List<String> altSpellings);

    @Query("{alpha2Code: { $regex:  '^?0'  , '$options' : 'i'} }")
    public abstract List<Pais> listaPaisPorAlpha2Code(String alpha2Code);
}
