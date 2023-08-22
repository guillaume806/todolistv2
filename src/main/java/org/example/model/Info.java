package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Info {

    @Id
    @GeneratedValue
    @Column(name = "id_info")
    private long id;

    private String description;

    private Date finalDate;

    private int Priority;

    public Info() {
    }

    public Info(long id, String description, Date finalDate, int priority) {
        this.id = id;
        this.description = description;
        this.finalDate = finalDate;
        Priority = priority;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int priority) {
        Priority = priority;
    }
}
