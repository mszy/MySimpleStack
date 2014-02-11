package dcll.mszy.mysimplestack;

import java.util.EmptyStackException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class MySimpleStackTest  extends TestCase {
	private MySimpleStack stack;
   
    public MySimpleStackTest( String testName ) {
        super( testName );
        stack = new MySimpleStack();
    }

    public static Test suite()
    {
        return new TestSuite( MySimpleStackTest.class );
    }

    
    public void testMySimpleStack() {
    	assertEquals(stack.getSize(), 0);
    	testEmpty();
    	stack.push(new Item());
    	assertEquals(stack.getSize(), 1);
    	
    	testSame();
    	
    	stack.pop();
    	
    	try {
    		stack.pop();
    		fail("BOUHHHHH");
    	}
    	catch(EmptyStackException e) {
    		
    	}
    	try {
    		stack.peek();
    		fail("BOUHHHHH");
    	}
    	catch(EmptyStackException e) {
    		
    	}
    	try {
    		stack.peek();
    		fail("BOUHHHHH");
    	}
    	catch(EmptyStackException e) {
    		
    	}
    	testEmpty();
    }
    
  
    public void testEmpty() {
    	assertTrue(stack.isEmpty());
    }
    public void testSame() {
    	Item i = new Item();
    	stack.push(i);

    	assertSame(i, stack.peek());
    	Item i2 = stack.peek();
    	assertSame(i, i2);
    	assertSame(i, stack.pop());
    	assertNotSame(i, stack.pop());
    }
}
