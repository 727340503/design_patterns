package com.rahul.command.cookingqueueserialiszble;

public class HotCook implements CookApi,Runnable{
	
	private String name;
	
	public HotCook(String name) {
		this.name = name;
	}

	@Override
	public void cook(String name,int tableNum) {
		System.out.println(this.name+"��ʦ��������"+tableNum+"����"+name);
	}

	@Override
	public void run() {
		while (true) {
			Command cmd = CommandQueue.getOneCommand();
			if(cmd != null) {
				cmd.setCookApi(this);
				cmd.execute();
			}
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
