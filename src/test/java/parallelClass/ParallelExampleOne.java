package parallelClass;

import org.testng.annotations.Test;

public class ParallelExampleOne {

    @Test
    public void testCase1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Running test one with thread id: " + Thread.currentThread().getId() );
    }

    @Test
    public void testCase2(){
        System.out.println("Running test two with thread id: " + Thread.currentThread().getId() );
    }

    @Test
    public void testCase3(){
        System.out.println("Running test three with thread id: " + Thread.currentThread().getId() );
    }

    @Test
    public void testCase4(){
        System.out.println("Running test four with thread id: " + Thread.currentThread().getId() );
    }
}
