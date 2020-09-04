package dataProvider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class MyDataProviderWithParameter {
    @DataProvider(name = "NumbersInput")
    public Object[][] getDataFromDataProvider(Method m) {
        if(m.getName().equalsIgnoreCase("sumNumbersMethodOne")) {
            return new Object[][]{
                    {22, 23},
                    {12, 13}
            };
        }else{
            return new Object[][]{
                    {10, 20},
                    {40, 50}
            };
        }
    }
}
