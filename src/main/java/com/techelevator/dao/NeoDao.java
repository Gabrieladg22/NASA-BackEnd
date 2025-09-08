package com.techelevator.dao;

import com.techelevator.model.Neo;

import java.time.LocalDate;

public interface NeoDao {

    //CREATE READ UPDATE DELETE

    //Save Neo to database
    Neo saveNeo(Neo neo, int userId, LocalDate date);

    //get neo by neoId
    Neo getNeoByDBId(int id);

}
