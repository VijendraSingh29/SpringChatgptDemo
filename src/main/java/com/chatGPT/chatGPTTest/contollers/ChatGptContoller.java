package com.chatGPT.chatGPTTest.contollers;

import com.chatGPT.chatGPTTest.services.ChatGptService;
import com.chatGPT.chatGPTTest.models.RequestMessage;
import com.chatGPT.chatGPTTest.models.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DemoChatGpt")
public class ChatGptContoller {
    @Autowired
    ChatGptService gptService ;
    @PostMapping("/askQuery")
    ResponseObject send(@RequestBody RequestMessage message)
    {
       return  gptService.execute(message) ;

    }
}
