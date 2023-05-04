/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class Rooms {
    private long roomNum;
    private short roomCap;
    private short status;

    public long getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(long roomNum) {
        this.roomNum = roomNum;
    }

    public short getRoomCap() {
        return roomCap;
    }

    public void setRoomCap(short roomCap) {
        this.roomCap = roomCap;
    }

    public short isStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }
    
}
