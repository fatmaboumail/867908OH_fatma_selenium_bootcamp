package test_search_bar;

import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import search_bar.SearchBar;

@Test
public class TestSearchBar extends BasePage {
    public void SearcgBar(){
        SearchBar searchBar = new SearchBar();
        Assert.assertTrue(isElementVisible(searchBar.driver.findElement
                (By.xpath("//input[@id=\"search\"]"))));
    }
}
