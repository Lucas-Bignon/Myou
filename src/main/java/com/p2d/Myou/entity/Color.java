package com.p2d.Myou.entity;

import javax.persistence.*;

@Entity
@Table(name = "color", schema = "myou")
public class Color {
    private Long id;
    private String name;
    private String actionKey;
    private String moduleKey;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "action_key")
    public String getActionKey() {
        return actionKey;
    }

    public void setActionKey(String actionKey) {
        this.actionKey = actionKey;
    }

    @Basic
    @Column(name = "module_key")
    public String getModuleKey() {
        return moduleKey;
    }

    public void setModuleKey(String moduleKey) {
        this.moduleKey = moduleKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Color that = (Color) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (actionKey != null ? !actionKey.equals(that.actionKey) : that.actionKey != null) return false;
        if (moduleKey != null ? !moduleKey.equals(that.moduleKey) : that.moduleKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (actionKey != null ? actionKey.hashCode() : 0);
        result = 31 * result + (moduleKey != null ? moduleKey.hashCode() : 0);
        return result;
    }
}
