package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������
 * ������Ҳ��һ�Ը߼������ṩ�Ĺ����Ƕ�дjava
 * �е��κζ���
 * 
 * ���������:
 * java.io.ObjectOutputStream
 * �����Խ�������java����ת��Ϊһ���ֽ�Ȼ��
 * ͨ�������ӵ�������Щ�ֽ�д����
 * @author ta
 *
 */
public class OosDemo {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("����ʦ");
		p.setAge(18);
		p.setGender("Ů");
		String[] otherInfo = {"��һ����Ա","������дë����","�ѻ�","�ٽ������Ļ�����","�������ͬ����������ʦ"};
		p.setOtherInfo(otherInfo);
		System.out.println(p);
		
		FileOutputStream fos
			= new FileOutputStream("person.obj");
		
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		/*
		 * ͨ��������д��������������������
		 * ��������:
		 * 1:�������Ƚ������Ķ���ת��Ϊ��һ��
		 *   �ֽڣ������ֽڰ������������
		 *   ������Ϣ���������ö���Ľṹ��Ϣ
		 *   Ȼ�������ֽ�ͨ�������ӵ���д��
		 *   
		 *   ����������Ӧ������:�������л�
		 *   
		 *   
		 * 2:�����ļ���ʱ���ļ����������ֽ�д
		 *   �뵽���ļ���
		 *   
		 *   ������д����������ñ���Ĺ���
		 *   ��Ӧ������:���ݳ־û�
		 * 
		 * 
		 */
		oos.writeObject(p);
		System.out.println("д�����!");
		
		oos.close();
	}
}







