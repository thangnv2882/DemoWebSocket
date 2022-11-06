package com.example.messagingwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class RoomController {

  @MessageMapping("/room-message")
  @SendTo("/topic/room")
  public Room room(RoomMessage message) throws Exception {
    Thread.sleep(1000); // simulated delay
    System.out.println("2 " + message.getRoomOld());
    System.out.println("3 " + message.getRoomNew());
    return new Room(HtmlUtils.htmlEscape(message.getRoomOld()), HtmlUtils.htmlEscape(message.getRoomNew()));
  }

}
