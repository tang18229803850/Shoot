																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ�����ɸ����ļ�����
 * @author ta
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ʹ���ļ���������ȡԭ�ļ�
		 * ʹ���ļ�����������ļ�д����
		 * 
		 * ���ÿ��д����˳���ԭ�ļ�������
		 * ��ȡ����д�븴���ļ���ɸ��Ʋ�����
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
		System.out.println("�������!");
		src.close();
		desc.close();
	}
}




