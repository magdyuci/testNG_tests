package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(dataProvider = "NumbersInput")
    public void sumNumbers(int num1, int num2, int num3, String nombre) {
        int sumTotal = num1 + num2 + num3;
        System.out.println("This is the sum: " + sumTotal + nombre);
    }
//the parallel attribute allows execute all test to the same time and how result all the test will execute in less time
    @DataProvider(name = "NumbersInput", parallel = true)
    public Object[][] getDataFromDataProvider() {
        return new Object[][]{
                {22, 23, 6, "magdalys"},
                {12, 13, 8, "marcel"},
                {12, 13, 8, "bb"},
                {12, 13, 8, "tt"},
                {12, 13, 8, "mrrrarcel"},
                {12, 13, 8, "rree"}
        };
    }
}
