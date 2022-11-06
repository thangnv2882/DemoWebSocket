package com.example.messagingwebsocket;

public class RoomMessage {

  private String roomOld;
  private String roomNew;

  private String userId;

  public RoomMessage() {
  }

  public RoomMessage(String roomOld, String roomNew, String userId) {
    this.roomOld = roomOld;
    this.roomNew = roomNew;
    this.userId = userId;
  }

  public String getRoomOld() {
    return roomOld;
  }

  public void setRoomOld(String roomOld) {
    this.roomOld = roomOld;
  }

  public String getRoomNew() {
    return roomNew;
  }

  public void setRoomNew(String roomNew) {
    this.roomNew = roomNew;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
}
