/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.*;
import java.io.*;

/**
 *
 * @author nguyenhuuhoang
 */
public class ManagerHotel {
    private List<InfoHotel> hotels;
    private String filename;
    
    
   public ManagerHotel(String filename) {
        this.filename = filename;
        hotels = new ArrayList<>();
        loadHotels();
    }
     public void loadHotels() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                InfoHotel hotel = new InfoHotel(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4], Double.parseDouble(data[5]));
                hotels.add(hotel);
            }
        } catch (IOException e) {
            System.out.println("Error loading hotels: " + e.getMessage());
        }
     }
        
         public void saveHotels() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (InfoHotel hotel : hotels) {
                writer.write(hotel.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving hotels: " + e.getMessage());
        }
    }
         
      public void addHotel(InfoHotel hotel) {
        hotels.add(hotel);
        saveHotels();
    }
      
     public InfoHotel findHotelById(String hotelId) {
        for (InfoHotel hotel : hotels) {
            if (hotel.getHotelId().equals(hotelId)) {
                return hotel;
            }
        }
        return null;
    }
    
     public void displayHotels() {
        hotels.sort(Comparator.comparing(InfoHotel::getHotelName)); // Sắp xếp theo tên khách sạn
        for (InfoHotel hotel : hotels) {
            System.out.println(hotel);
        }
    }
}
