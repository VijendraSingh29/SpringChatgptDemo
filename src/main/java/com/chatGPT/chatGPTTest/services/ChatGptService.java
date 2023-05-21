package com.chatGPT.chatGPTTest.services;

import com.chatGPT.chatGPTTest.configuration.ChatGptConfig;
import com.chatGPT.chatGPTTest.models.RequestMessage;
import com.chatGPT.chatGPTTest.models.RequestObject;
import com.chatGPT.chatGPTTest.models.ResponseObject;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatGptService {


    private RestTemplate restTemplate;
    public ChatGptService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public ResponseObject execute(RequestMessage message) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType(ChatGptConfig.MEDIA_TYPE));
        headers.add(ChatGptConfig.AUTHORIZATION, ChatGptConfig.BEARER+ ChatGptConfig.API_KEY);

        RequestObject requestObject = new RequestObject(ChatGptConfig.MODEL,message.getMessage(), ChatGptConfig.TEMPERATURE, ChatGptConfig.MAX_TOKEN, ChatGptConfig.TOP_P) ;
        HttpEntity entity = new HttpEntity(requestObject, headers);
        ResponseEntity<ResponseObject> data = restTemplate.exchange(ChatGptConfig.URL, HttpMethod.POST, entity, ResponseObject.class);
        return data.getBody();
    }
}
