package ru.akhmetov.springcourse.FirstRestApp.models;



import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;



/**
 * @author Oleg Akhmetov on 20.12.2022
 */
@Entity
@Table(name = "sk_example_table")
public class ObjData {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "obj")
    @JdbcTypeCode(SqlTypes.JSON)
    private JsonObject jsonObject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JsonObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}
