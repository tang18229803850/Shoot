package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * ��������һ�Ը߼�������������߶�дЧ�ʡ�
 * ���������Ժ��������ǽ��������д����
 * ���д��������������ʱ���ᱻת��Ϊ���д
 * ������
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * @author ta
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("music.mp3");
		BufferedInputStream bis
			= new BufferedInputStream(fis);
		FileOutputStream fos
			= new FileOutputStream("music_cp.mp3");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);		
		int d = -1;
		long start = System.currentTimeMillis();
		while((d = bis.read())!=-1) {
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("������ϣ���ʱ:"+(end-start)+"ms");
		
		bis.close();
		bos.close();
	}
}







