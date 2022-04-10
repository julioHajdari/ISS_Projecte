package dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatelitInformation {

    @JsonProperty("timestamp")
    protected long timestamp;

    @JsonProperty("message")
    protected String message;

    @JsonProperty("iss_position")
    protected PositionInformation position;



}
