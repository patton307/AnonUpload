package com.theironyard.services;

import com.theironyard.entities.AnonFile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by landonkail on 11/18/15.
 */
public interface AnonFileRepository extends CrudRepository<AnonFile, Integer> {
    /*
    @Query("Select f FROM AnonFile f WHERE isPermanent = false ORDER BY ID")
    List<AnonFile> findFile();
    */
}