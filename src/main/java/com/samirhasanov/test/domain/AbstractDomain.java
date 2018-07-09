/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samirhasanov.test.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 *
 * @author Hasanov (Asus)
 */
@MappedSuperclass
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractDomain implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(updatable = false)
    private Long id;
   
    @Column(name = "create_date", nullable = false, updatable = false, columnDefinition = "timestamp with time zone")
    private Date created = new Date();
    
    @Column(name = "last_update", nullable = false, columnDefinition = "timestamp with time zone")
    private Date updated = new Date();
    
    @Version
    private int version;

    @Column
    private int active = 1;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "AbstractDomain{" + "id=" + id + ", created=" + created + ", updated=" + updated + ", version=" + version + ", active=" + active + '}';
    }
}
