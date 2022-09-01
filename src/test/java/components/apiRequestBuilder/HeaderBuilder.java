package components.apiRequestBuilder;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.LogConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import net.serenitybdd.rest.SerenityRest;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class HeaderBuilder {
    public static RequestSpecification headerRequestSFCCGetCustomer(String clientId) throws FileNotFoundException {
        PrintStream fileOutPutStream = new PrintStream("src//test//Logs//SFCCGetCustomer.log");
        return new RequestSpecBuilder()
                .addFilter(new RequestLoggingFilter(fileOutPutStream))
                .addFilter(new ResponseLoggingFilter(fileOutPutStream))
                .setBaseUri("https://thewarehouse-beta.office-supplies.co.nz")
                .setUrlEncodingEnabled(true)
                .addHeader("x-dw-client-id",clientId).setConfig(SerenityRest.config().logConfig(LogConfig.logConfig().blacklistHeaders(BlackListHeaders.BlackListHeaderDetails())))
                .addHeader("Accept","*/*").setConfig(SerenityRest.config().logConfig(LogConfig.logConfig().blacklistHeaders(BlackListHeaders.BlackListHeaderDetails())))
                .addHeader("Content-Type","application/json").setConfig(SerenityRest.config().logConfig(LogConfig.logConfig().blacklistHeaders(BlackListHeaders.BlackListHeaderDetails())))
                .log(LogDetail.ALL)
                .build();
    }
    public static RequestSpecification headerRequestSFCCRegisterCustomer(String clientId,String authToken,String log) throws FileNotFoundException {
        PrintStream fileOutPutStream = new PrintStream("src//test//Logs//"+log+".log");
        return new RequestSpecBuilder()
                .addFilter(new RequestLoggingFilter(fileOutPutStream))
                .addFilter(new ResponseLoggingFilter(fileOutPutStream))
                .setBaseUri("https://thewarehouse-beta.office-supplies.co.nz")
                .setUrlEncodingEnabled(true)
                .addHeader("x-dw-client-id",clientId).setConfig(SerenityRest.config().logConfig(LogConfig.logConfig().blacklistHeaders(BlackListHeaders.BlackListHeaderDetails())))
                .addHeader("Authorization",authToken)
                .addHeader("Accept","*/*").setConfig(SerenityRest.config().logConfig(LogConfig.logConfig().blacklistHeaders(BlackListHeaders.BlackListHeaderDetails())))
                .addHeader("Content-Type","application/json").setConfig(SerenityRest.config().logConfig(LogConfig.logConfig().blacklistHeaders(BlackListHeaders.BlackListHeaderDetails())))
                .log(LogDetail.ALL)
                .build();
    }


    public static ResponseSpecification getResponseSpec(){
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL).build();
    }
}
