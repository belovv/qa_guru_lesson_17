
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestTest {

    public final String URL = "http://demowebshop.tricentis.com/addproducttocart/catalog/13/1/1";

    @Test
    public void addBooksToCart() {
       CartResponse response = given()
                .when()
                .post(URL)
                .then()
                .assertThat()
                .statusCode(200)
                .contentType(JSON)
                .extract()
                .as(CartResponse.class);
       assertTrue(response.getSuccess());
    }


}
