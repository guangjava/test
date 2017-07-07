package test.annotation;

import com.annotation.MyAnnotation;
import com.annotation.MyAnnotation.MyEnum;

@MyAnnotation(myMethod="", enumMethod = MyEnum.A)
public class TestMyAnnotation {
	
	@MyAnnotation(myMethod="", enumMethod = MyEnum.A)
	public TestMyAnnotation() {
	}
	
	@MyAnnotation(myMethod="", enumMethod = MyEnum.A)
	public void testMethod() {
		
	}

}
