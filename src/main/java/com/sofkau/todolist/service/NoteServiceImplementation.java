package com.sofkau.todolist.service;

import com.sofkau.todolist.entity.Note;
import com.sofkau.todolist.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImplementation implements NoteService{

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteNote(Long id) {
        noteRepository.deleteById(id);

    }

    @Override
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }
}
