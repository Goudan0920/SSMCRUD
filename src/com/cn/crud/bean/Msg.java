package com.cn.crud.bean;

import java.util.HashMap;
import java.util.Map;

import com.github.pagehelper.PageInfo;

/*
 * ͨ�õķ��ص���
 */
public class Msg {
	//״̬��   ����100  �����ɹ�  -100����ʧ��
	private int code;
	//��ʾ��ϸ��Ϣ  ʧ��ԭ��
	private String msg;
	//�û�Ҫ���ظ������������
	private Map<String,Object> extend =new HashMap<String ,Object>();
	
	public static Msg success() {   //���سɹ�
		Msg result=new Msg();
		result.setCode(100);
		result.setMsg("�����ɹ�!");
		return result;
	}
	public static Msg fail() {   //���سɹ�
		Msg result=new Msg();
		result.setCode(-100);
		result.setMsg("����ʧ��!");
		return result;
	}
	
	public Msg add(String key,Object value) {
		this.getExtend().put(key, value);
		return this;
		
	}
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getExtend() {
		return extend;
	}
	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	
	
	
	
}