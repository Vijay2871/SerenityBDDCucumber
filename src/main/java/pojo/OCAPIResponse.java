package pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)

public class OCAPIResponse {

    @JsonProperty("_v")
    private String v;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("_resource_state")
    private String resourceState;
    @JsonProperty("auth_type")
    private String authType;
    @JsonProperty("company_name")
    private String companyName;
    @JsonProperty("creation_date")
    private String creationDate;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("customer_no")
    private String customerNo;
    @JsonProperty("email")
    private String email;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("gender")
    private Integer gender;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("login")
    private String login;
    @JsonProperty("preferred_locale")
    private String preferredLocale;
    @JsonProperty("c_crmContactId")
    private String cCrmContactId;
    @JsonProperty("c_exportStatus")
    private String cExportStatus;
    @JsonProperty("c_latestExportHash")
    private String cLatestExportHash;
    @JsonProperty("c_loyaltyId")
    private String cLoyaltyId;
    @JsonProperty("c_masterEmailOptIn")
    private Boolean cMasterEmailOptIn;

}