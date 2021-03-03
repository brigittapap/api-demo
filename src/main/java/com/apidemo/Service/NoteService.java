package com.apidemo.Service;

import com.apidemo.Model.Note;
import com.apidemo.Repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NoteService {

    @Autowired
    private NotesRepository notesRepository;

    public List<Note> getAllNotes() {
        return notesRepository.findAll();
    }

    public void addnewNote(Note note) {
        notesRepository.save(note);
    }

    public void deleteNote(Long id) {
        notesRepository.deleteById(id);
    }

    public void editNote(Long id, Note updatednote) {
        Note note = notesRepository.findById(id).get();

        note.setTitle(updatednote.getTitle());
        note.setNote(updatednote.getNote());

        notesRepository.save(note);
    }

    public List<Note> getNotesbyUser(Long id) {
        return notesRepository.getNotesbyUser(id);
    }


}
