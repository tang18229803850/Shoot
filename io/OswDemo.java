package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * java将流按照读写单位又进行了一种划分方式
 * 字节流与字符流
 * 字节流的读写单位是字节，而字符流的读写单位
 * 是字符
 * 所以字符流只适合读写文本数据!
 * 
 * java.io.Reader,java.io.Writer
 * 这两个类也是抽象类，是所有字符输入流与
 * 字符输出流的父类，规定了读写字符的相关
 * 方法。
 * 
 * 
 * 转换流
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * 他们是一对常用的字符流实现类，经常在我们做
 * 字符数据读写操作中使用。并且在流链接中是
 * 非常重要的一个环节。但是我们很少直接对它
 * 做操作。
 * @author ta
 *
 */
public class OswDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");	
		String line = "摩擦摩擦，在光滑的马路牙子上打出溜滑!";
		osw.write(line);		
		line = "我的滑板鞋，时尚时尚最时尚!";
		osw.write(line);
		System.out.println("写出完毕!");
		
		osw.close();
	}
}








