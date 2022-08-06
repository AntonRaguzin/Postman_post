import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanTest {
    @Test
    void postmanTest(){
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                //.body(/* --> ваша проверка здесь <-- */)
        ;
    }
}