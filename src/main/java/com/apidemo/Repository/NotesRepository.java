package com.apidemo.Repository;

import com.apidemo.Model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {

    @Override
    List<Note> findAll();

    @Override
    Optional<Note> findById(Long aLong);

    @Query(value = "select n from Note n where user_id = ?1")
    List<Note> getNotesbyUser(Long id);
}
