package dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionInformation {

    @JsonProperty("latitude")
    protected double latitude;

    @JsonProperty("longitude")
    protected double longitude;
}
