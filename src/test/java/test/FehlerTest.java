package test;

import static org.junit.Assert.*;

import org.junit.Test;

import maven.Hello;

public class FehlerTest {

	@Test
	public void test() {
		//fail();
		Hello hello = new Hello();
		assert(hello.isAlive());
	}

}
