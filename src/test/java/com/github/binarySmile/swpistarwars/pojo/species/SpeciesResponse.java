package com.github.binarySmile.swpistarwars.pojo.species;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class SpeciesResponse {

    @JsonProperty("films")
    private List <String> films;

    @JsonProperty("skin_colors")
    private String skinColors;

    @JsonProperty("homeworld")
    private String homeworld;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("created")
    private String created;

    @JsonProperty("eye_colors")
    private String eyeColors;

    @JsonProperty("language")
    private String language;

    @JsonProperty("classification")
    private String classification;

    @JsonProperty("people")
    private List <String> people;

    @JsonProperty("url")
    private String url;

    @JsonProperty("hair_colors")
    private String hairColors;

    @JsonProperty("average_height")
    private String averageHeight;

    @JsonProperty("name")
    private String name;

    @JsonProperty("designation")
    private String designation;

    @JsonProperty("average_lifespan")
    private String averageLifespan;

    public List <String> getFilms() {
        return films;
    }

    public void setFilms(List <String> films) {
        this.films = films;
    }

    public String getSkinColors() {
        return skinColors;
    }

    public void setSkinColors(String skinColors) {
        this.skinColors = skinColors;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEyeColors() {
        return eyeColors;
    }

    public void setEyeColors(String eyeColors) {
        this.eyeColors = eyeColors;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public List <String> getPeople() {
        return people;
    }

    public void setPeople(List <String> people) {
        this.people = people;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHairColors() {
        return hairColors;
    }

    public void setHairColors(String hairColors) {
        this.hairColors = hairColors;
    }

    public String getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(String averageHeight) {
        this.averageHeight = averageHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(String averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    @Override
    public String toString() {
        return
                "PeopleResponse{" +
                        "films = '" + films + '\'' +
                        ",skin_colors = '" + skinColors + '\'' +
                        ",homeworld = '" + homeworld + '\'' +
                        ",edited = '" + edited + '\'' +
                        ",created = '" + created + '\'' +
                        ",eye_colors = '" + eyeColors + '\'' +
                        ",language = '" + language + '\'' +
                        ",classification = '" + classification + '\'' +
                        ",people = '" + people + '\'' +
                        ",url = '" + url + '\'' +
                        ",hair_colors = '" + hairColors + '\'' +
                        ",average_height = '" + averageHeight + '\'' +
                        ",name = '" + name + '\'' +
                        ",designation = '" + designation + '\'' +
                        ",average_lifespan = '" + averageLifespan + '\'' +
                        "}";
    }
}