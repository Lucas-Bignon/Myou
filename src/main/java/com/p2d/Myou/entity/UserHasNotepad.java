package com.p2d.Myou.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_has_notepad", schema = "myou")
public class UserHasNotepad {
    private Long id;
    private int userId;
    private int notepadId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "notepad_id")
    public int getNotepadId() {
        return notepadId;
    }

    public void setNotepadId(int notepadId) {
        this.notepadId = notepadId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHasNotepad that = (UserHasNotepad) o;

        if (userId != that.userId) return false;
        if (notepadId != that.notepadId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + notepadId;
        return result;
    }
}
