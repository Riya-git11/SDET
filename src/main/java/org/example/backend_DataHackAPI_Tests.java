package org.example;

public class backend_DataHackAPI_Tests {
    package backend;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class DataHackAPITests {

        String baseApi = "https://api.analyticsvidhya.com";

        @Test
        public void testLoginAPI() {
            Response res = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body("{\"email\":\"test@example.com\",\"password\":\"Password123\"}")
                    .post(baseApi + "/auth/login");

            Assert.assertEquals(res.getStatusCode(), 200, "Login API failed");
            Assert.assertTrue(res.jsonPath().get("access_token") != null, "Token missing in response");
        }

        @Test
        public void testFetchActiveChallenges() {
            Response res = RestAssured.given()
                    .get(baseApi + "/datahack/challenges?status=active");

            Assert.assertEquals(res.getStatusCode(), 200, "Fetch challenges API failed");
            Assert.assertTrue(res.jsonPath().getList("$").size() >= 0, "Challenges not found");
        }

        @Test
        public void testChallengeDetails() {
            Response res = RestAssured.given()
                    .get(baseApi + "/datahack/challenges/loan-prediction");

            Assert.assertEquals(res.getStatusCode(), 200, "Challenge details API failed");
            Assert.assertTrue(res.jsonPath().get("title") != null, "Challenge title missing");
        }
    }

}
