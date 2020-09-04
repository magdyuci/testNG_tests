package dataProvider;

import org.testng.annotations.Test;

public class DataProviderInSeparateClassExample {
    @Test(dataProvider = "NumbersInput", dataProviderClass = MyDataProvider.class)
    public void sumNumbers(int num1, int num2) {
        int sumTotal = num1 + num2;
        System.out.println("This is the sum: " + sumTotal);
    }
}
