package com.example.NoteApp.NoteApp.Controllers;

import com.example.NoteApp.NoteApp.Entities.Notes;
import com.example.NoteApp.NoteApp.Services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/notes")
public class NotesController {
    @Autowired
    private NotesService service;

    @GetMapping("/all")
    public ResponseEntity<List<Notes>> getAll(){
        List<Notes> resultSet=service.getAllNotes();
        if(resultSet.isEmpty()){
            return new ResponseEntity<>(resultSet, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(resultSet, HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Optional<Notes>> getNotesById(@PathVariable String id){
        Optional<Notes> result=service.findNotesByID(id);
        if(result.isPresent()){
            return new ResponseEntity<>(result,HttpStatus.OK);
        }
        return new ResponseEntity<>(result,HttpStatus.NO_CONTENT);
    }

    @PutMapping("/update")
    public ResponseEntity<Boolean> addNotes(@RequestBody Notes note){
        service.Update(note);
        return new ResponseEntity<>(true,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Boolean> updateNotes(@RequestBody Notes note){
        service.addNotes(note);
        return new ResponseEntity<>(true,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{myId}")
    public ResponseEntity<Boolean> deleteNotes(@PathVariable String myId){
        service.delete(myId);
        return new ResponseEntity<>(true,HttpStatus.OK);
    }

}
