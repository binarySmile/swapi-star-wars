package com.github.binarySmile.swpistarwars.pojo.films;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class FilmsResponse {

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("director")
    private String director;

    @JsonProperty("created")
    private String created;

    @JsonProperty("vehicles")
    private List <String> vehicles;

    @JsonProperty("opening_crawl")
    private String openingCrawl;

    @JsonProperty("title")
    private String title;

    @JsonProperty("url")
    private String url;

    @JsonProperty("characters")
    private List <String> characters;

    @JsonProperty("episode_id")
    private int episodeId;

    @JsonProperty("planets")
    private List <String> planets;

    @JsonProperty("release_date")
    private String releaseDate;

    @JsonProperty("starships")
    private List <String> starships;

    @JsonProperty("species")
    private List <String> species;

    @JsonProperty("producer")
    private String producer;

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public List <String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List <String> vehicles) {
        this.vehicles = vehicles;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public void setOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List <String> getCharacters() {
        return characters;
    }

    public void setCharacters(List <String> characters) {
        this.characters = characters;
    }

    public int getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(int episodeId) {
        this.episodeId = episodeId;
    }

    public List <String> getPlanets() {
        return planets;
    }

    public void setPlanets(List <String> planets) {
        this.planets = planets;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List <String> getStarships() {
        return starships;
    }

    public void setStarships(List <String> starships) {
        this.starships = starships;
    }

    public List <String> getSpecies() {
        return species;
    }

    public void setSpecies(List <String> species) {
        this.species = species;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return
                "PeopleResponse{" +
                        "edited = '" + edited + '\'' +
                        ",director = '" + director + '\'' +
                        ",created = '" + created + '\'' +
                        ",vehicles = '" + vehicles + '\'' +
                        ",opening_crawl = '" + openingCrawl + '\'' +
                        ",title = '" + title + '\'' +
                        ",url = '" + url + '\'' +
                        ",characters = '" + characters + '\'' +
                        ",episode_id = '" + episodeId + '\'' +
                        ",planets = '" + planets + '\'' +
                        ",release_date = '" + releaseDate + '\'' +
                        ",starships = '" + starships + '\'' +
                        ",species = '" + species + '\'' +
                        ",producer = '" + producer + '\'' +
                        "}";
    }
}