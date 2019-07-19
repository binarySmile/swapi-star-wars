package com.github.binarySmile.swpistarwars;

import com.github.binarySmile.swpistarwars.pojo.PlanetsResponse;
import com.github.binarySmile.swpistarwars.pojo.SearchResponse;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TestPlanets {

    private static String param = "murky";
    private static String param1 = "swamp, jungles";
    private static List <String> param3;//check residents = 0;
    private final String base_URL = "https://swapi.co/api/planets/";

    @Test
    public void testPlanets() {
        SearchResponse searchResponse = given()
                .get(base_URL)
                .body()
                .as(SearchResponse.class);

        searchResponse = (SearchResponse) getObjectWithCollection(searchResponse.getPlanets());
        System.out.println(searchResponse);
    }

    public Object getObjectWithCollection(List <PlanetsResponse> list) {
        for (PlanetsResponse planet : list) {
            if (planet.getClimate().equals(param)
                    && planet.getTerrain().equals(param1)) {
                return planet;
            }
        }
        return null;
    }
}
