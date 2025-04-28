package com.example.NoteApp.NoteApp.Repository;

import com.example.NoteApp.NoteApp.Entities.Notes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends MongoRepository<Notes,String> {
    public void deleteById(String id);
}
