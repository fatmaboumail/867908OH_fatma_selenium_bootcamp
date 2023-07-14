package test_database;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Database;

import java.sql.SQLException;

public class TestDataBase extends BasePage {
    @Test
    public void testDatabase() {

        Database db = new Database(DATA_PATH, DATA_PATH, DATA_PATH, DATA_PATH);

        String query = "SELECT * FROM ESPN_DATABASE.PLAYER";
        String result = null;
        try {
            result = (String) db.executeQueryReadOne(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(result);
    }}

