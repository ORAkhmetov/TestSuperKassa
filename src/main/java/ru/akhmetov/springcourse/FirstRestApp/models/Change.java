package ru.akhmetov.springcourse.FirstRestApp.models;

import jakarta.persistence.Id;

/**
 * @author Oleg Akhmetov on 20.12.2022
 */
public class Change {
    @Id
    private int id;

    private int add;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }
}
