package components.apiRequestBuilder;

import io.restassured.response.Response;
import pojo.SFCCGuestAuth;
import pojo.SFCCRegisterCustomer;

import java.io.FileNotFoundException;

public class SFCCApi {
    public static Response sfccGuestCustomer(SFCCGuestAuth body) throws FileNotFoundException {
        return SFCCAPIMethod.postMethodSFCCToken("/s/twl/dw/shop/v20_10/customers/auth",body,"aae196fe-7029-4203-8534-a30466b6bee4");
    }
    public static Response sfccRegisterCustomer(SFCCRegisterCustomer body, String authToken) throws FileNotFoundException {
        return SFCCAPIMethod.postMethodSFCCRegisterCustomer("/s/twl/dw/shop/v20_10/customers",body,"aae196fe-7029-4203-8534-a30466b6bee4",authToken);
    }

    public static Response retreiveCustomer(String id,String authToken) throws FileNotFoundException {
        return SFCCAPIMethod.getSFCCRegisterCustomer("/s/twl/dw/shop/v20_10/customers/"+id+"","aae196fe-7029-4203-8534-a30466b6bee4",authToken);
    }
}
