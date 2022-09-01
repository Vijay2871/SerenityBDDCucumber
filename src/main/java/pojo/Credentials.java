
package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Credentials {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("locked")
    private Boolean locked;
    @JsonProperty("login")
    private String login;

}