/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nguyenhuuhoang
 */
public class InfoHotel {
    private String HotelId;
    private String HotelName;
    private int HotelRoomAvailable;
    private String HotelAddress;
    private String HotelPhone;
    private double HotelRating;

    public InfoHotel(String HotelId, String HotelName, int HotelRoomAvailable, String HotelAddress, String HotelPhone, double HotelRating) {
        this.HotelId = HotelId;
        this.HotelName = HotelName;
        this.HotelRoomAvailable = HotelRoomAvailable;
        this.HotelAddress = HotelAddress;
        this.HotelPhone = HotelPhone;
        this.HotelRating = HotelRating;
    }

    public String getHotelId() {
        return HotelId;
    }

    public void setHotelId(String HotelId) {
        this.HotelId = HotelId;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String HotelName) {
        this.HotelName = HotelName;
    }

    public int getHotelRoomAvailable() {
        return HotelRoomAvailable;
    }

    public void setHotelRoomAvailable(int HotelRoomAvailable) {
        this.HotelRoomAvailable = HotelRoomAvailable;
    }

    public String getHotelAddress() {
        return HotelAddress;
    }

    public void setHotelAddress(String HotelAddress) {
        this.HotelAddress = HotelAddress;
    }

    public String getHotelPhone() {
        return HotelPhone;
    }

    public void setHotelPhone(String HotelPhone) {
        this.HotelPhone = HotelPhone;
    }

    public double getHotelRating() {
        return HotelRating;
    }

    public void setHotelRating(double HotelRating) {
        this.HotelRating = HotelRating;
        
        
    }
    
   public String toString() {
        return HotelId + "," + HotelName + "," + HotelRoomAvailable + "," + HotelAddress + "," + HotelPhone + "," + HotelRating;
    }
    
    
}
