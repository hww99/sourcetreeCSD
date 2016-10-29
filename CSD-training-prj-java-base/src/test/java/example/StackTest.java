package example;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;
import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by lx on 2016/10/28.
 */

public class StackTest {
    Stack stack;
    @Before
    public void setup(){

        //Given
        stack =new Stack();
    }

    @Test
    public void GIVEN_a_stack_with_1_WHEN_pop_THEN_get_1(){

        //When
        stack.push(1);

        //Then
        Object result=stack.pop();
        assertEquals(1,result);
    }

    @Test
    public void GIVEN_a_stack_with_1_and_2_WHEN_pop_THEN_get_2(){


        //When
        stack.push(1);
        stack.push(2);

        //Then
        Object result=stack.pop();
        assertEquals(2,result);


    }

    @Test
    public void GIVEN_an_new_stack_SHOULD_be_empty(){
        //When
        boolean empty=stack.empty();

        //Then
        assertTrue(empty);
    }

    @Test
    public void 给定一个非空栈当用empty方法时应该为非空(){

        //Given
        stack.push(2);

        //When
        boolean empty=stack.empty();

        //Then
        assertFalse(empty);

    }


}
