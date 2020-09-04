package groupingFeatures;

import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"BreakFast", "Food"})
    public void myTestA(){
        System.out.println("I am eating butter");
    }

    @Test(groups = "BreakFast")
    public void myTestB(){
        System.out.println("I am eating bread");
    }

    @Test(groups = "Lunch")
    public void myTestC(){
        System.out.println("I am eating pizza");
    }

    @Test(groups = "Lunch")
    public void myTestD(){
        System.out.println("I am eating chicken");
    }

    @Test(groups = "Dinner")
    public void myTestF(){
        System.out.println("I am eating tea");
    }

    @Test(groups = "Dinner")
    public void myTestG(){
        System.out.println("I am eating rice cookies");
    }
}
