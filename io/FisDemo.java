package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ʹ���ļ���������ȡ�ļ�����
 * @author ta
 *
 */
public class FisDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("fos.txt");
		
		byte[] data = new byte[200];
		int len = fis.read(data);
		System.out.println("ʵ�ʶ�ȡ��:"+len+"���ֽ�");
		
		String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		
		fis.close();
	}
}







