package com.p2d.Myou.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_has_roles", schema = "myou")
public class UserHasRoles {
    private Long id;
    private int userId;
    private int rolesId;

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
    @Column(name = "roles_id")
    public int getRolesId() {
        return rolesId;
    }

    public void setRolesId(int rolesId) {
        this.rolesId = rolesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHasRoles that = (UserHasRoles) o;

        if (userId != that.userId) return false;
        if (rolesId != that.rolesId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + rolesId;
        return result;
    }
}
