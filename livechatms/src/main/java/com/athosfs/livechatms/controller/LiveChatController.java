package com.athosfs.livechatms.controller;

import com.athosfs.livechatms.domain.ChatInput;
import com.athosfs.livechatms.domain.ChatOutput;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class LiveChatController {
  @MessageMapping("/new-message")
  @SendTo("/topics/livechat")
  public ChatOutput newMessage(ChatInput chatInput) {
    return new ChatOutput(HtmlUtils.htmlEscape(chatInput.user() + ": " + chatInput.message()));
  }
}
