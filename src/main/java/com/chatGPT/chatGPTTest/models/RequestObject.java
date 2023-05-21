package com.chatGPT.chatGPTTest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestObject implements Serializable {
    private String model;
    private String prompt;
    private Double temperature;
    @JsonProperty("max_tokens")
    private Integer max_tokens;
    @JsonProperty("top_p")
    private Double top_p;
}
