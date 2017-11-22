package Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SampleReflection {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException{
		
		System.out.println("Hello");
		
		Object obj = Class.forName("Reflections.CalcPgm").getConstructor().newInstance();
		
		Method[] method = obj.getClass().getDeclaredMethods();
		
		for (int i=0;i<method.length;i++){
            System.out.println(method[i]);   

		}
	}
}
