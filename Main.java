package tehran;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while(true){
			try{
				System.out.println("ba ki kar dari?");
				Scanner sc = new Scanner(System.in);
				Class JVM_OBJECT = Class.forName(sc.nextLine());
				System.out.println("harfet chiye?");
				Method method = JVM_OBJECT.getDeclaredMethod(sc.nextLine());
				method.setAccessible(true);
				method.invoke(JVM_OBJECT);
				
			}catch(Exception e){
				System.out.println("nistand");				
			}
		}

	}

}
