package com.example.NoteApp.NoteApp.NotesServices;

import com.example.NoteApp.NoteApp.Repository.NotesRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class NotesServiceTests {

    @Autowired
    private NotesRepository repo;

    @ParameterizedTest
    @CsvSource({
            "1","2","3"
    })
    public void checkFindByID(String id){
        assertNotNull(repo.findById(id));
    }
}
