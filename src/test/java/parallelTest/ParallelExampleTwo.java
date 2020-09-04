package parallelTest;

import org.testng.annotations.Test;

public class ParallelExampleTwo {

    @Test
    public void testCase5() throws InterruptedException {
        System.out.println("Running test five with thread id: " + Thread.currentThread().getId() );
    }

    @Test
    public void testCase6(){
        System.out.println("Running test six with thread id: " + Thread.currentThread().getId() );
    }

    @Test
    public void testCase7(){
        System.out.println("Running test seven with thread id: " + Thread.currentThread().getId() );
    }

    @Test
    public void testCase8(){
        System.out.println("Running test eight with thread id: " + Thread.currentThread().getId() );
    }
}
