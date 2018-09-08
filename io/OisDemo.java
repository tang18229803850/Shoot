package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流
 * 可以进行对象的反序列化操作。
 * 
 * 使用对象流读取的字节必须是通过对象输出流
 * 序列化的一组字节才可以。
 * @author ta
 *
 */
public class OisDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis
			= new FileInputStream("person.obj");
		ObjectInputStream ois
			= new ObjectInputStream(fis);
		
		Person p = (Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
		
	}
}







