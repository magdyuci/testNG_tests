package dataProvider;

import org.testng.annotations.DataProvider;

public class MyDataProvider {
    @DataProvider(name = "NumbersInput")
    public Object[][] getDataFromDataProvider() {
        return new Object[][]{
                {22, 23},
                {12, 13}
        };
    }
}
