package com.example.messagingwebsocket;

public class Room {

  private String contentOld;
  private String contentNew;


  public Room() {
  }

  public Room(String contentOld, String contentNew) {
    this.contentOld = contentOld;
    this.contentNew = contentNew;
  }

  public String getContentOld() {
    return contentOld;
  }

  public void setContentOld(String contentOld) {
    this.contentOld = contentOld;
  }

  public String getContentNew() {
    return contentNew;
  }

  public void setContentNew(String contentNew) {
    this.contentNew = contentNew;
  }
}

