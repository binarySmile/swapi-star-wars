package com.github.binarySmile.swpistarwars;

import com.github.binarySmile.swpistarwars.pojo.planets.PlanetsResponse;
import com.github.binarySmile.swpistarwars.pojo.planets.PlanetsSearchResponse;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TestPlanets {

    private static String param = "murky";
    private static String param1 = "swamp, jungles";
    private final String base_URL = "https://swapi.co/api/planets/";

    @Test
    public void testPlanets() {
        PlanetsSearchResponse searchResponse = given()
                .get(base_URL)
                .body()
                .as(PlanetsSearchResponse.class);

        searchResponse = (PlanetsSearchResponse) getObjectFromCollection(searchResponse.getPlanets());
        System.out.println(searchResponse);
    }


    public PlanetsSearchResponse getObjectFromCollection(List <PlanetsResponse> list) {
        for (PlanetsResponse planet : list) {
            if (planet.getClimate().equals(param)
                    && planet.getTerrain().equals(param1)
                    && planet.getResidents().isEmpty()) {
                return planet;
            }
        }
        return null;
    }
}
