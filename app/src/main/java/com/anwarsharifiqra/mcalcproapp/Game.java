package com.anwarsharifiqra.mcalcproapp;

import java.util.List;
import java.util.Map;
import java.util.Random;

import ca.roumani.i2c.Country;
import ca.roumani.i2c.CountryDB;

public class Game {
    CountryDB db;
    public Game(){

        db = new CountryDB(); // calls the CountryDB() constructor which constructs the instance,db, of the class CountryDB



    }

    public String qa(){
        List<String> capitals = db.getCapitals();
        Random rand = new Random();
        int randomNumber = rand.nextInt(capitals.size());
        String c = capitals.get(randomNumber);
        Map<String, Country> data = db.getData(); //gives all the data in the db database/ instance of CountryDB
        Country ref = data.get(c);
        String quesAns = "What is the name of the capital of " + ref.getName() + "\n" + ref.getCapital();
        return quesAns;

    }


}
