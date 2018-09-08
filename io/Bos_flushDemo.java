package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区问题
 * @author ta
 *
 */
public class Bos_flushDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("bos.txt");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		String line = "你是隔壁的泰山，抓住爱情的藤蔓。";
		byte[] data = line.getBytes("UTF-8");
		/*
		 * 缓冲流的write方法并不是立即将数据写出，
		 * 而是先将数据存入其内部的数组中，当数组
		 * 装满时才会做一次真是写操作。(转化为块
		 * 写操作的过程)
		 */
		bos.write(data);
		/*
		 * flush方法的意义是强制将缓冲流已经缓存的
		 * 数据一次性写出。这样做可以让写出的数据
		 * 有即时性，但是频繁调用会降低写效率。
		 * 在更关注写出的即时性时应当使用该方法。
		 */
//		bos.flush();
		System.out.println("写出完毕!");
		/*
		 * close方法中会调用一次flush方法
		 */
		bos.close();
	}
}







