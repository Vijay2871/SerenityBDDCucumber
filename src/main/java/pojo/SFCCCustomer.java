
package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter
@Setter
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SFCCCustomer {

    @JsonProperty("_v")
    private String v;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("_resource_state")
    private String resourceState;
    @JsonProperty("creation_date")
    private String creationDate;
    @JsonProperty("auth_type")
    private String auth_type;
    @JsonProperty("credentials")
    private Credentials credentials;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("customer_no")
    private String customerNo;;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone_mobile")
    private String phone_mobile;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("preferred_locale")
    private String preferred_locale;
    @JsonProperty("company_name")
    private String company_name;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_login_time")
    private String lastLoginTime;
    @JsonProperty("login")
    private String login;
    @JsonProperty("enabled")
    private String enabled;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("last_visit_time")
    private String lastVisitTime;
    @JsonProperty("previous_login_time")
    private String previousLoginTime;
    @JsonProperty("previous_visit_time")
    private String previousVisitTime;
    @JsonProperty("c_exportStatus")
    private String cExportStatus;
    @JsonProperty("c_lastAppLoginTime")
    private String cLastAppLoginTime;
    @JsonProperty("c_latestExportHash")
    private String cLatestExportHash;
    @JsonProperty("c_loyaltyId")
    private String cLoyaltyId;
    @JsonProperty("c_crmContactId")
    private String c_crmContactId;
    @JsonProperty("c_masterEmailOptIn")
    private Boolean c_masterEmailOptIn;
    @JsonProperty("c_preferredStoreCodes")
    private List<String> cPreferredStoreCodes;
    @JsonProperty("c_communicationPreferences")
    private List<String> c_communicationPreferences;

}
