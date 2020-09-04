package annotations;

import base.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AfterClassAnnotation extends TestBase {
    @Test
    public void testDoThisA(){
        System.out.println("Test do this");
    }
    @Test
    public void testMethod_B_DoThis(){
        System.out.println("B: Este metodo se ejecuta luego del A (testMethod_A_DoThis)");
    }
    @Test
    public void testMethod_C_DoThis(){
        System.out.println("C: Este metodo se ejecuta luego del B (testMethod_B_DoThis) por que se ejecutan alfabeticamente");
    }
    @Test
    public void testMethod_A_DoThis(){
        System.out.println("A: Este metodo se ejecuta antes que el B (testMethod_B_DoThis)");
    }
    @AfterMethod
    public void afterMethodDoThis(){
        System.out.println("Los @AfterMethod se ejecutan después de cada @Test si hay 5 @Test se ejecuta 5 veces despues de cada uno");
    }

    @AfterClass
    public void afterClassDoThis(){
        System.out.println("AfterClass run after all methods just one time");
    }
}
