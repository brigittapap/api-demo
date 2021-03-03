package com.apidemo.Controller;

import com.apidemo.Model.Note;
import com.apidemo.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/allnotes")
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @PostMapping("/addnote")
    public void createNote(@RequestBody Note note) {
        System.out.println(note);
        noteService.addnewNote(note);
    }

    @DeleteMapping("/deletenote/{id}")
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
    }

    @PutMapping("/editnote/{id}")
    public void editNote(@RequestBody Note note, @PathVariable Long id) {
        noteService.editNote(id, note);
    }

    @GetMapping("/notesbyuser/{id}")
    public List<Note> getNotesbyUser(@PathVariable Long id) {
        return noteService.getNotesbyUser(id);
    }

}
