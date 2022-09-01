package components.apiRequestBuilder;

import java.util.ArrayList;
import java.util.List;

//This class is used to blacklist(hide) the details below in the header.
//Add header info which you need blacklisted below
public class BlackListHeaders {

    public static List BlackListHeaderDetails(){

        List<String> headers=new ArrayList<>();

        headers.add("Accept");
        headers.add("Content-Type");
        headers.add("x-dw-client-id");
        headers.add("Authorization");

        return headers;
    };
}
