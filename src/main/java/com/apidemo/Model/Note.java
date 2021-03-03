package com.apidemo.Model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String note;

    private LocalDate datecreated;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Note() {
    }

    public Note(Long id, String title, String note, LocalDate datecreated, User user) {
        this.id = id;
        this.title = title;
        this.note = note;
        this.datecreated = datecreated;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", note='" + note + '\'' +
                ", datecreated=" + datecreated +
                ", user=" + user +
                '}';
    }
}
