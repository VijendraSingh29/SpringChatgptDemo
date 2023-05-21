package com.chatGPT.chatGPTTest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ResponseObject {
private String id ;
private String prompt ;
    private Date creation;
    private String model;
    @JsonProperty("choices")
    private List<Choices> choicesList;

}
