package com.example.examen.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.example.examen.entity.Pais;

public interface PaisService {
    
    public List<Pais> all();

    //crud
    public abstract List<Pais> listaPorname(String name);
    public abstract Pais agregarActualizar(Pais pais);
    public abstract void eliminarPais(ObjectId id);
    public abstract Pais buscarPorPk(ObjectId idPais);

    //consulta
    public abstract List<Pais> listaPoraltSpellings (List<String> altSpellings);
    public abstract List<Pais> listaPoralpha2Code(String alpha2Code);
    
    
}
