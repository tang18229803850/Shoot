package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ���
 * java�������ն�д��λ�ֽ�����һ�ֻ��ַ�ʽ
 * �ֽ������ַ���
 * �ֽ����Ķ�д��λ���ֽڣ����ַ����Ķ�д��λ
 * ���ַ�
 * �����ַ���ֻ�ʺ϶�д�ı�����!
 * 
 * java.io.Reader,java.io.Writer
 * ��������Ҳ�ǳ����࣬�������ַ���������
 * �ַ�������ĸ��࣬�涨�˶�д�ַ������
 * ������
 * 
 * 
 * ת����
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * ������һ�Գ��õ��ַ���ʵ���࣬������������
 * �ַ����ݶ�д������ʹ�á�����������������
 * �ǳ���Ҫ��һ�����ڡ��������Ǻ���ֱ�Ӷ���
 * ��������
 * @author ta
 *
 */
public class OswDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");	
		String line = "Ħ��Ħ�����ڹ⻬����·�����ϴ���ﻬ!";
		osw.write(line);		
		line = "�ҵĻ���Ь��ʱ��ʱ����ʱ��!";
		osw.write(line);
		System.out.println("д�����!");
		
		osw.close();
	}
}








