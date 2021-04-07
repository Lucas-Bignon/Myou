package com.p2d.Myou.entity;

import javax.persistence.*;

@Entity
@Table(name = "permission_has_modules", schema = "myou")
public class PermissionHasModules {
    private Long id;
    private int permissionId;
    private int modulesId;

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
    @Column(name = "modules_id")
    public int getModulesId() {
        return modulesId;
    }

    public void setModulesId(int modulesId) {
        this.modulesId = modulesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PermissionHasModules that = (PermissionHasModules) o;

        if (permissionId != that.permissionId) return false;
        if (modulesId != that.modulesId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = permissionId;
        result = 31 * result + modulesId;
        return result;
    }
}
