package com.rahul.command.print;

/**
 * 退化版本的命令模式
* @ClassName: PrintService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月7日
*
 */
public class PrintService implements Command {

	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public void execute() {
		System.out.println("打印文件服务内容："+content);
	}

}
