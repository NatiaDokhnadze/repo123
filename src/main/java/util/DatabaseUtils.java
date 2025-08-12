package utils;

import util.OfferData;

import java.sql.*;

public class DatabaseUtils {

    public static OfferData getRandomOffer() {
        OfferData offer = null;
        try (Connection con = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=OurStore;encrypt=true;trustServerCertificate=true;",
                "yourUsername",
                "yourPassword");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "SELECT TOP 1 Id, OfferName, OfferPrice, OfferDiscount " +
                             "FROM [OurStore].[dbo].[TestDataExampleTable] ORDER BY NEWID()")) {

            if (rs.next()) {
                offer = new OfferData();
                offer.setId(rs.getInt("Id"));
                offer.setOfferName(rs.getString("OfferName"));
                offer.setOfferPrice(rs.getDouble("OfferPrice"));
                offer.setOfferDiscount(rs.getString("OfferDiscount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return offer;
    }
}
