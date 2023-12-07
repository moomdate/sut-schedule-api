package sut.schedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SayHello {

    @JsonProperty("hello")
    private String message;
}
