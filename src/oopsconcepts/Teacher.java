package oopsconcepts;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Main{
	//Different types to create objects
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		@SuppressWarnings("deprecation")
		Teacher t = (Teacher)Class.forName("Teacher").newInstance();
		
		Constructor<Teacher>t1 = Teacher.class.getConstructor();
		Teacher t2 = t1.newInstance();
		
		//Teacher t3 = (Teacher)t2.clone();
		
		Integer.valueOf(10);
	}
}
public class Teacher {
	//Class c = Class.forName("Teacher");
	


}

