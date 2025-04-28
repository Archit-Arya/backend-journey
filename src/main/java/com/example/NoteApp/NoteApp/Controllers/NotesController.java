package com.example.NoteApp.NoteApp.Controllers;

import com.example.NoteApp.NoteApp.Entities.Notes;
import com.example.NoteApp.NoteApp.Services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/notes")
public class NotesController {
    @Autowired
    private NotesService service;

    @GetMapping("/all")
    public List<Notes> getAll(){
        return service.getAllNotes();
    }

    @GetMapping("/getById/{id}")
    public Optional<Notes> getNotesById(@PathVariable String id){
        return service.findNotesByID(id);
    }

    @PutMapping("/update")
    public void addNotes(@RequestBody Notes note){
        service.Update(note);
    }

    @PostMapping("/add")
    public void updateNotes(@RequestBody Notes note){
        service.addNotes(note);
    }

    @DeleteMapping("/delete/{myId}")
    public void deleteNotes(@PathVariable String myId){
        service.delete(myId);
    }

}
