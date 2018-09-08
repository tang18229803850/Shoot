																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成复制文件操作
 * @author ta
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 使用文件输入流读取原文件
		 * 使用文件输出流向复制文件写数据
		 * 
		 * 利用块读写操作顺序从原文件将数据
		 * 读取出来写入复制文件完成复制操作。
		 */
		FileInputStream src
			= new FileInputStream("music.mp3");
		FileOutputStream desc
			= new FileOutputStream("music_cp.mp3");		
		int len = -1;
		byte[] data = new byte[1024*10];		
		while((len = src.read(data))!=-1) {
			desc.write(data,0,len);
		}
		System.out.println("复制完毕!");
		src.close();
		desc.close();
	}
}




