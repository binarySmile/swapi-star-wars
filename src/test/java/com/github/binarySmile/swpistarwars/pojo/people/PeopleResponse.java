package com.github.binarySmile.swpistarwars.pojo.people;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class PeopleResponse {

    @JsonProperty("films")
    private List <String> films;

    @JsonProperty("homeworld")
    private String homeworld;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("skin_color")
    private String skinColor;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("created")
    private String created;

    @JsonProperty("mass")
    private String mass;

    @JsonProperty("vehicles")
    private List <String> vehicles;

    @JsonProperty("url")
    private String url;

    @JsonProperty("hair_color")
    private String hairColor;

    @JsonProperty("birth_year")
    private String birthYear;

    @JsonProperty("eye_color")
    private String eyeColor;

    @JsonProperty("species")
    private List <String> species;

    @JsonProperty("starships")
    private List <String> starships;

    @JsonProperty("name")
    private String name;

    @JsonProperty("height")
    private String height;

    public List <String> getFilms() {
        return films;
    }

    public void setFilms(List <String> films) {
        this.films = films;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
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

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public List <String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List <String> vehicles) {
        this.vehicles = vehicles;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public List <String> getSpecies() {
        return species;
    }

    public void setSpecies(List <String> species) {
        this.species = species;
    }

    public List <String> getStarships() {
        return starships;
    }

    public void setStarships(List <String> starships) {
        this.starships = starships;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return
                "PeopleResponse{" +
                        "films = '" + films + '\'' +
                        ",homeworld = '" + homeworld + '\'' +
                        ",gender = '" + gender + '\'' +
                        ",skin_color = '" + skinColor + '\'' +
                        ",edited = '" + edited + '\'' +
                        ",created = '" + created + '\'' +
                        ",mass = '" + mass + '\'' +
                        ",vehicles = '" + vehicles + '\'' +
                        ",url = '" + url + '\'' +
                        ",hair_color = '" + hairColor + '\'' +
                        ",birth_year = '" + birthYear + '\'' +
                        ",eye_color = '" + eyeColor + '\'' +
                        ",species = '" + species + '\'' +
                        ",starships = '" + starships + '\'' +
                        ",name = '" + name + '\'' +
                        ",height = '" + height + '\'' +
                        "}";
    }
}