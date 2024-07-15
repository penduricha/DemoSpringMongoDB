package com.example.springmongodb.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
@Setter
@Getter
@Data
@Document(collection = "Penguin")
@TypeAlias("objectId")
public class Penguin {
    @Id
    private ObjectId _id;
    private int penguin_id;
    private String species;
    private String island;
    private double bill_length_mm;
    private double bill_depth_mm;
    private double flipper_length_mm;
    private double body_mass_g;
    private String sex;

    public Penguin() {
    }

    public Penguin(String species, String island, double bill_length_mm, double bill_depth_mm, double flipper_length_mm, double body_mass_g, String sex) {
        this.species = species;
        this.island = island;
        this.bill_length_mm = bill_length_mm;
        this.bill_depth_mm = bill_depth_mm;
        this.flipper_length_mm = flipper_length_mm;
        this.body_mass_g = body_mass_g;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "penguin_id=" + penguin_id +
                ", species='" + species + '\'' +
                ", island='" + island + '\'' +
                ", bill_length_mm=" + bill_length_mm +
                ", bill_depth_mm=" + bill_depth_mm +
                ", flipper_length_mm=" + flipper_length_mm +
                ", body_mass_g=" + body_mass_g +
                ", sex='" + sex + '\'' +
                '}';
    }
}
