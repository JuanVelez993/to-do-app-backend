package com.sofkau.todolist.service;

import com.sofkau.todolist.entity.Note;
import org.springframework.stereotype.Service;

import java.util.List;


public interface NoteService {

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);

    List<Note> getNotes();
}
