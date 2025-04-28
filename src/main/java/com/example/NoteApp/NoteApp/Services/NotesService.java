package com.example.NoteApp.NoteApp.Services;

import com.example.NoteApp.NoteApp.Entities.Notes;
import com.example.NoteApp.NoteApp.Repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class NotesService {

    @Autowired
    private NotesRepository repo;

    public List<Notes> getAllNotes(){
        return repo.findAll();
    }

    public Optional<Notes> findNotesByID(String myId){
        return repo.findById(myId);
    }

    public void addNotes(Notes note){
        note.setDate(new Date());
        repo.save(note);
    }

    public void Update(Notes notes){
        Optional<Notes> note=repo.findById(notes.getId());
        if(note.isPresent()){
            Notes n=note.get();
            n.setDate(new Date());
            if(notes.getContent()!=null && !notes.getContent().equals("")){
                n.setContent(notes.getContent());
            }
            repo.deleteById(notes.getId());
            repo.save(n);
        }
        else{
            addNotes(notes);
        }
    }

    public void delete(String id){
        Optional<Notes> note=repo.findById(id);
        if(note.isPresent()){
            repo.deleteById(id);
        }
    }

}
