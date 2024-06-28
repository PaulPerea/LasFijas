package com.example.examen.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.repository.PaisRepository;

import com.example.examen.entity.Pais;
@Service
public class PaisServiceImp implements PaisService{

    @Autowired
    private PaisRepository PaisRepos;

    @Override
    public List<Pais> listaPorname(String name) {
        return PaisRepos.findByName(name);
        
    }

    @Override
    public Pais agregarActualizar(Pais pais) {
        return PaisRepos.save(pais);
    }

    @Override
    public void eliminarPais(ObjectId id) {
        PaisRepos.deleteById(id);
    }

    @Override
    public List<Pais> listaPoraltSpellings(List<String> altSpellings) {
        return PaisRepos.listaPoraltSpellings(altSpellings);
    }

    @Override
    public List<Pais> listaPoralpha2Code(String alpha2Code) {
        return PaisRepos.listaPaisPorAlpha2Code(alpha2Code);
    }

    @Override
    public List<Pais> all() {
        return PaisRepos.findAll();
    }

    @Override
    public Pais buscarPorPk(ObjectId idPais) {
        return PaisRepos.findById(idPais).orElse(null);
    }
    
}
