package testNGCases;

import org.testng.annotations.DataProvider;
public class DataproviderClass {
        @DataProvider(name="SearchProvider")
        public static Object[][] getDataFromDataprovider(){
            return new Object[][]{
                { "Samuel", "Spring Framework" },
                { "Manuella", "ReactJS" },
                { "Derek", "Selenium" }
            };  
}}