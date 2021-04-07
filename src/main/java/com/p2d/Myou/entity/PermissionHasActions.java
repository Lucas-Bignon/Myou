package com.p2d.Myou.entity;

import javax.persistence.*;

@Entity
@Table(name = "permission_has_actions", schema = "myou")
public class PermissionHasActions {
    private Long id;
    private int permissionId;
    private int actionsId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "permission_id")
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Id
    @Column(name = "actions_id")
    public int getActionsId() {
        return actionsId;
    }

    public void setActionsId(int actionsId) {
        this.actionsId = actionsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PermissionHasActions that = (PermissionHasActions) o;

        if (permissionId != that.permissionId) return false;
        if (actionsId != that.actionsId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = permissionId;
        result = 31 * result + actionsId;
        return result;
    }
}
