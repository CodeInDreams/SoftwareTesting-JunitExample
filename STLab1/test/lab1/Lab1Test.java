package lab1;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Lab1Test {

	private int input1;
	private int input2;
	private int input3;
	private String expected;
	private Lab1 test;
	
	public Lab1Test(int input1,int input2,int input3, String expected){
		this.input1 = input1;
		this.input2 = input2;
		this.input3 = input3;
		this.expected = expected;
	}
	
	@Before
	public void setUp(){
		test = new Lab1();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{2, 3, 4, "一般三角形"},
			{4, 7, 9, "一般三角形"},
			{5, 5, 5, "等边三角形"},
			{1, 1, 1, "等边三角形"},
			{6, 7, 7, "等腰三角形"},
			{4, 7, 4, "等腰三角形"},
			{2, 2, 3, "等腰三角形"},
			{1, 6, 4, "输入的边不能构成三角形"},
			{0, -1, 3, "输入的边不能构成三角形"},
		});
	}
	
	@Test
	public void testCheck() {
		assertEquals(this.expected, test.check(input1, input2, input3));
	}
}
