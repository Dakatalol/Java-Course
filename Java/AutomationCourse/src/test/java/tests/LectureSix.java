package tests;

import mm.Product;
import mm.TVSeries;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.Arrays;

public class LectureSix {

    private ArrayList<Product> productList = new ArrayList<>();

    @BeforeTest
    public void setUp() {
        productList.add(
                new TVSeries("The flash", 9.5,
                        new ArrayList<>(Arrays.asList("Comedy", "Adventure")),
                        new ArrayList<>(Arrays.asList("Season 1", "Season 2", "Season 3", "Season 4", "Season 5", "Season 6")),
                        20, 2,
                        new ArrayList<>(Arrays.asList(5.5, 6.5, 4.4, 5.6, 7.5, 9.9))));
        productList.add(
                new TVSeries("Arrow", 4.5,
                        new ArrayList<>(Arrays.asList("Comedy", "Adventure")),
                        new ArrayList<>(Arrays.asList("Season 1", "Season 2", "Season 3", "Season 4", "Season 5", "Season 6")),
                        20, 2,
                        new ArrayList<>(Arrays.asList(5.5, 6.5, 4.4, 5.6, 7.5, 9.9))));
        productList.add(
                new TVSeries("Family guy", 10,
                        new ArrayList<>(Arrays.asList("Comedy")),
                        new ArrayList<>(Arrays.asList("Season 1", "Season 2", "Season 3", "Season 4", "Season 5", "Season 6","Season 7", "Season 8", "Season 3", "Season 4", "Season 5", "Season 6")),
                        20, 2,
                        new ArrayList<>(Arrays.asList(5.5, 6.5, 4.4, 5.6, 7.5, 9.9))));
    }
}
