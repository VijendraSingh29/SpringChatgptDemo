package com.chatGPT.chatGPTTest.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class RequestMessage implements Serializable {

    private String message ;
}
