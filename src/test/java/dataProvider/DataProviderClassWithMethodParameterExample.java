package dataProvider;

import org.testng.annotations.Test;

public class DataProviderClassWithMethodParameterExample {
    @Test(dataProvider = "NumbersInput", dataProviderClass = MyDataProviderWithParameter.class)
    public void sumNumbersMethodOne(int num1, int num2) {
        int sumTotal = num1 + num2;
        System.out.println("This is the sum: " + sumTotal);
    }

    @Test(dataProvider = "NumbersInput", dataProviderClass = MyDataProviderWithParameter.class)
    public void sumNumbersMethodTwo(int num1, int num2) {
        int sumTotal = num1 + num2;
        System.out.println("This is the sum: " + sumTotal);
    }
}
