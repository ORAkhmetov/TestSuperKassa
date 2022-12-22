package ru.akhmetov.springcourse.FirstRestApp.models;

import java.io.Serializable;

/**
 * @author Oleg Akhmetov on 20.12.2022
 */

public class JsonObject implements Serializable {

    private int current;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
