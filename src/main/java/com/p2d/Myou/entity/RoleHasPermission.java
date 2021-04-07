package com.p2d.Myou.entity;

import javax.persistence.*;

@Entity
@Table(name = "role_has_permission", schema = "myou", catalog = "")
@IdClass(RoleHasPermission.class)
public class RoleHasPermission {
    private Long id;
    private int rolesId;
    private int permissionId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "roles_id")
    public int getRolesId() {
        return rolesId;
    }

    public void setRolesId(int rolesId) {
        this.rolesId = rolesId;
    }

    @Id
    @Column(name = "permission_id")
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleHasPermission that = (RoleHasPermission) o;

        if (rolesId != that.rolesId) return false;
        if (permissionId != that.permissionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rolesId;
        result = 31 * result + permissionId;
        return result;
    }
}
