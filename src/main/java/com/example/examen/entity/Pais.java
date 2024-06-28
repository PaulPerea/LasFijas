package com.example.examen.entity;

import java.util.Currency;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Language;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pais {
     private String name;
    private List<String> topLevelDomain;
    private String alpha2Code;
    private String alpha3Code;
    private List<String> callingCodes;
    private String capital;
    private List<String> altSpellings;
    private String subregion;
    private String region;
    private long population;
    private List<Double> latlng;
    private String demonym;
    private long area;
    private List<String> timezones;
    private List<String> borders;
    private String nativeName;
    private String numericCode;
    private flags flags;
    private List<String> currencies;
    private List<Language> languages;
    private translations translations;
    private String flag;
    private List<String> regionalBlocs;
    private String cioc;
    private boolean independent;
}
