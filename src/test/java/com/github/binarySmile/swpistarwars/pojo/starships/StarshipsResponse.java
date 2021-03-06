package com.github.binarySmile.swpistarwars.pojo.starships;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class StarshipsResponse {

    @JsonProperty("max_atmosphering_speed")
    private String maxAtmospheringSpeed;

    @JsonProperty("cargo_capacity")
    private String cargoCapacity;

    @JsonProperty("films")
    private List <String> films;

    @JsonProperty("passengers")
    private String passengers;

    @JsonProperty("pilots")
    private List <Object> pilots;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("consumables")
    private String consumables;

    @JsonProperty("MGLT")
    private String mGLT;

    @JsonProperty("created")
    private String created;

    @JsonProperty("length")
    private String length;

    @JsonProperty("starship_class")
    private String starshipClass;

    @JsonProperty("url")
    private String url;

    @JsonProperty("manufacturer")
    private String manufacturer;

    @JsonProperty("crew")
    private String crew;

    @JsonProperty("hyperdrive_rating")
    private String hyperdriveRating;

    @JsonProperty("cost_in_credits")
    private String costInCredits;

    @JsonProperty("name")
    private String name;

    @JsonProperty("model")
    private String model;

    public String getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    }

    public String getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public List <String> getFilms() {
        return films;
    }

    public void setFilms(List <String> films) {
        this.films = films;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public List <Object> getPilots() {
        return pilots;
    }

    public void setPilots(List <Object> pilots) {
        this.pilots = pilots;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public String getMGLT() {
        return mGLT;
    }

    public void setMGLT(String mGLT) {
        this.mGLT = mGLT;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getStarshipClass() {
        return starshipClass;
    }

    public void setStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getHyperdriveRating() {
        return hyperdriveRating;
    }

    public void setHyperdriveRating(String hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
    }

    public String getCostInCredits() {
        return costInCredits;
    }

    public void setCostInCredits(String costInCredits) {
        this.costInCredits = costInCredits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "PeopleResponse{" +
                        "max_atmosphering_speed = '" + maxAtmospheringSpeed + '\'' +
                        ",cargo_capacity = '" + cargoCapacity + '\'' +
                        ",films = '" + films + '\'' +
                        ",passengers = '" + passengers + '\'' +
                        ",pilots = '" + pilots + '\'' +
                        ",edited = '" + edited + '\'' +
                        ",consumables = '" + consumables + '\'' +
                        ",mGLT = '" + mGLT + '\'' +
                        ",created = '" + created + '\'' +
                        ",length = '" + length + '\'' +
                        ",starship_class = '" + starshipClass + '\'' +
                        ",url = '" + url + '\'' +
                        ",manufacturer = '" + manufacturer + '\'' +
                        ",crew = '" + crew + '\'' +
                        ",hyperdrive_rating = '" + hyperdriveRating + '\'' +
                        ",cost_in_credits = '" + costInCredits + '\'' +
                        ",name = '" + name + '\'' +
                        ",model = '" + model + '\'' +
                        "}";
    }
}