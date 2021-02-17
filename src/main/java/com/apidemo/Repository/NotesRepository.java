package com.apidemo.Repository;

import com.apidemo.Model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface NotesRepository extends JpaRepository<Note, Long> {

    @Override
    List<Note> findAll();

    @Override
    Optional<Note> findById(Long aLong);
}
