package components.PageActions.OCAPIResponse;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import pojo.OCAPIResponse;
import pojo.SFCCCustomer;
import pojo.SFCCGuestAuth;
import pojo.SFCCRegisterCustomer;
import components.apiRequestBuilder.RequestAPIBodyBuilder;

import java.io.FileNotFoundException;

import static components.apiRequestBuilder.SFCCApi.*;

public class OCAPILogin {

    @Step("OCAPI Authentication")

    public static OCAPIResponse ocapiAuth() throws FileNotFoundException {

        SFCCGuestAuth requestSfccGuestAuth = RequestAPIBodyBuilder.requestSFCCGuestAuth();
        Headers headers = sfccGuestCustomer(requestSfccGuestAuth).getHeaders();
        String responseHeader = headers.get("Authorization").getValue();
        SFCCRegisterCustomer requestSFCCRegisterCustomer = RequestAPIBodyBuilder.requestSFCCRegisterCustomerBodyBuilder();
        Response response = sfccRegisterCustomer(requestSFCCRegisterCustomer,responseHeader);
        OCAPIResponse ocapiResponse= retreiveCustomer(response.as(SFCCCustomer.class).getCustomerId(), response.getHeader("Authorization")).as(OCAPIResponse.class);
        return ocapiResponse;
    }
}