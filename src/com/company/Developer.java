package com.company;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;


public class Developer extends Users implements CSV {
   ArrayList<String> lang;

   public Developer(String name, int number, short id) {
       this.name = name;
       this.number = number;
       this.id = id;
       this.lang = new ArrayList();
   }

    public Developer(@JsonProperty(value = "name")String name, @JsonProperty(value = "number") int number,
                     @JsonProperty(value = "id") short id, @JsonProperty(value = "lang") ArrayList<String> lang) {
        this.name = name;
        this.number = number;
        this.id = id;
        this.lang = new ArrayList();
    }

    public ArrayList GetLang() {

       return lang;
    }

    public void SetLang(ArrayList lang) {

       this.lang = lang;
    }


    public void AddLang(String... args) { //В кач-ве параметра может передаваться любое количество строк или их массив
       for (String str : lang) {
           lang.add(str);
       }
    }
}
