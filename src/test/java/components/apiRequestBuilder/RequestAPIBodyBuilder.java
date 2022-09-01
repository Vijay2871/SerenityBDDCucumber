package components.apiRequestBuilder;

import components.utils.DataGenerator.FakeData;
import pojo.Customer;
import pojo.SFCCGuestAuth;
import pojo.SFCCRegisterCustomer;

public class RequestAPIBodyBuilder {
    private static String email = FakeData.generateWarehouseEmail(FakeData.generateFirstName(), FakeData.generateLastName());
    private static String fname = FakeData.generateFirstName();
    private static String lname = FakeData.generateLastName();

    public static SFCCGuestAuth requestSFCCGuestAuth() {
        return SFCCGuestAuth.builder().type("guest").build();
    }

    public static SFCCRegisterCustomer requestSFCCRegisterCustomerBodyBuilder() {
        Customer customer = Customer.builder().email(email).login(email).firstName(fname).lastName(lname).build();
        return SFCCRegisterCustomer.builder().customer(customer).password(FakeData.generateUniquePassword()).build();
    }
}
