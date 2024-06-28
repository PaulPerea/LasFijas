package com.example.examen.entity;

import java.util.Currency;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Language;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "pais")
public class Pais {
    
    private ObjectId _id;
    
    private String name;
    
    private List<String> topLevelDomain;

    @Field("alpha2Code")
    private String alpha2Code;
    
    private String alpha3Code;
    
    private List<String> callingCodes;
    
    private String capital;
    @Field("altSpellings")
    private List<String> altSpellings;
    
    private String subregion;
    
    private String region;
    
    private int population;
    
    private List<Double> latlng;
    
    private String demonym;
    
    private int area;

    private double gini;
    
    private List<String> timezones;
    
    private List<String> borders;
    
    private String nativeName;
    
    private String numericCode;
    
    private Object flags;
    
    private List<Object> currencies;
    
    private List<Object> languages;
    
    private Object translations;
    
    private String flag;
    
    private List<Object> regionalBlocs;
    
    private String cioc;
    
    private boolean independent;
}
