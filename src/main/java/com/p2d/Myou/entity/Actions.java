package com.p2d.Myou.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "actions", schema = "myou")
public class Actions {
    private Long id;
    private String actionName;
    private String actionKey;
    private Timestamp creationDate;
    private Timestamp modifDate;
    private String actionscol;

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
    @Column(name = "action_name")
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
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
    @Column(name = "creation_date")
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "modif_date")
    public Timestamp getModifDate() {
        return modifDate;
    }

    public void setModifDate(Timestamp modifDate) {
        this.modifDate = modifDate;
    }

    @Basic
    @Column(name = "actionscol")
    public String getActionscol() {
        return actionscol;
    }

    public void setActionscol(String actionscol) {
        this.actionscol = actionscol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actions that = (Actions) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (actionName != null ? !actionName.equals(that.actionName) : that.actionName != null) return false;
        if (actionKey != null ? !actionKey.equals(that.actionKey) : that.actionKey != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (modifDate != null ? !modifDate.equals(that.modifDate) : that.modifDate != null) return false;
        if (actionscol != null ? !actionscol.equals(that.actionscol) : that.actionscol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (actionName != null ? actionName.hashCode() : 0);
        result = 31 * result + (actionKey != null ? actionKey.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (modifDate != null ? modifDate.hashCode() : 0);
        result = 31 * result + (actionscol != null ? actionscol.hashCode() : 0);
        return result;
    }
}
