package com.example.NoteApp.NoteApp.Controllers;

import com.example.NoteApp.NoteApp.Entities.Notes;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/notes")
public class NotesController {
    Map<String,Notes> notes=new HashMap<>();

    @GetMapping("/all")
    public List<Notes> getAll(){
        List<Notes> resultSet=new ArrayList<>();
        for(String ids: notes.keySet()){
            resultSet.add(notes.get(ids));
        }
        return resultSet;
    }

    @GetMapping("/getById/{id}")
    public Optional<Notes> getNotesById(@PathVariable String id){
        return Optional.ofNullable(notes.getOrDefault(id, null));
    }

    @PutMapping("/update")
    public void addNotes(@RequestBody Notes note){
        note.setDate(new Date());
        notes.put(note.getId(),note);
    }

    @PostMapping("/add")
    public void updateNotes(@RequestBody Notes note){
        note.setDate(new Date());
        notes.put(note.getId(),note);
    }

    @DeleteMapping("/delete/{myId}")
    public void deleteNotes(@PathVariable String myId){
        notes.remove(myId);
    }

}
