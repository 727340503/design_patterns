package com.rahul.examplel.newpapertui;
/**
 * Ŀ�����Ҳ���Ǳ���
* @ClassName: NewsPaper
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��5��
*
 */
public class NewsPaper extends Subject {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		this.notifi(this.getContent());
	}

}
