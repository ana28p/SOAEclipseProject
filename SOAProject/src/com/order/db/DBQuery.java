package com.order.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBQuery {

	public static ResultSet selectAll(DBTable table) {
        String sql = "SELECT * FROM " + table.getName();
        
        try (Connection conn = DBCreator.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                System.out.println(rs.getFetchSize());
            }
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
		return null;
    }
	
    public static void updateFeedback(int personID, double rating) {
 
        int ratingID = 0;
        int count = 0;
        double rating_sum = 0;
        String sql = "SELECT feedback.id, count, rating_sum FROM feedback JOIN person ON person.rating_id = feedback.id WHERE person.id = ?";
        
        try (Connection conn = DBCreator.connect();
        	 PreparedStatement pstmt  = conn.prepareStatement(sql)){
            pstmt.setInt(1, personID);

            ResultSet rs = pstmt.executeQuery();
            ratingID = rs.getInt("id");
            count = rs.getInt("count");
            rating_sum = rs.getDouble("rating_sum");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        sql = "UPDATE feedback SET rating_sum = ? , "
                + "count = ? "
                + "WHERE id = ?";
        
        try (Connection conn = DBCreator.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            pstmt.setDouble(1, rating_sum + rating);
            pstmt.setInt(2, ++count);
            pstmt.setInt(3, ratingID);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

	public static double getRatingOf(int personID) {
        String sql = "SELECT count, rating_sum FROM feedback JOIN person ON person.rating_id = feedback.id WHERE person.id = ?";
        
        double rating = 0;
        try (Connection conn = DBCreator.connect();
        	 PreparedStatement pstmt  = conn.prepareStatement(sql)){
            pstmt.setInt(1, personID);

            ResultSet rs = pstmt.executeQuery();
            // should be just one..
            System.out.println(rs.getInt("count") +  "\t" + 
            		rs.getDouble("rating_sum"));
            rating = rs.getDouble("rating_sum") / rs.getInt("count");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rating;
    }
}
