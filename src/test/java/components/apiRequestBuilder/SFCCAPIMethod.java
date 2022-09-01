package components.apiRequestBuilder;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

import java.io.FileNotFoundException;

import static components.apiRequestBuilder.HeaderBuilder.*;

public class SFCCAPIMethod {
    public static Response postMethodSFCCToken(String path, Object body, String clientId) throws FileNotFoundException {
        return SerenityRest
                .given(headerRequestSFCCGetCustomer(clientId))
                .body(body)
                .when()
                .post(path)
                .then()
                .spec(getResponseSpec())
                .extract().response();
    }

    public static Response postMethodSFCCRegisterCustomer(String path, Object body, String clientId, String authToken) throws FileNotFoundException {
        return SerenityRest
                .given(headerRequestSFCCRegisterCustomer(clientId,authToken,"Registercustomer"))
                .body(body)
                .when()
                .post(path)
                .then()
                .spec(getResponseSpec())
                .extract().response();
    }

    public static Response getSFCCRegisterCustomer(String path,String clientId,String authToken) throws FileNotFoundException {
        return SerenityRest
                .given(headerRequestSFCCRegisterCustomer(clientId,authToken,"RetreiveCustomer"))
                .when()
                .get(path)
                .then()
                .spec(getResponseSpec())
                .extract().response();
    }
}
