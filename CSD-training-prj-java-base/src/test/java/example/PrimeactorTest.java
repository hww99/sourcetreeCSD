package example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lx on 2016/10/28.
 */
public class PrimeactorTest {

    @Before
    public void before(){
        System.out.println("Before");
    }
    @Test
    public void test(){
        assertEquals(Arrays.asList(),Primeactor.breakdown(1));
        assertEquals(Arrays.asList(2),Primeactor.breakdown(2));
        assertEquals(Arrays.asList(3),Primeactor.breakdown(3));
        assertEquals(Arrays.asList(2,2),Primeactor.breakdown(4));
        assertEquals(Arrays.asList(5),Primeactor.breakdown(5));
        assertEquals(Arrays.asList(2,3),Primeactor.breakdown(6));
        assertEquals(Arrays.asList(7),Primeactor.breakdown(7));
        assertEquals(Arrays.asList(2,2,2),Primeactor.breakdown(8));
        assertEquals(Arrays.asList(3,3),Primeactor.breakdown(9));
        assertEquals(Arrays.asList(2,2,2,5,17),Primeactor.breakdown(2*2*2*5*17));
        System.out.println("Test1");

    }

    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @After
    public void after(){
        System.out.println("After");
    }

}