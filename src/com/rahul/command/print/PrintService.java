package com.rahul.command.print;

/**
 * �˻��汾������ģʽ
* @ClassName: PrintService
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��7��
*
 */
public class PrintService implements Command {

	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public void execute() {
		System.out.println("��ӡ�ļ��������ݣ�"+content);
	}

}
