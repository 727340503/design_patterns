package com.rahul.mediator.demo1;

public class MotherBoard implements Mediator {

	private CDDriver cdDriver;

	private CPU cpu;

	private SoundCard soundCard;

	private VideoCard videoCard;

	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}

	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}

	@Override
	public void changed(Colleague colleague) {
		if(colleague instanceof CDDriver) {
			this.openCDDriver((CDDriver) colleague);
		}else if(colleague instanceof CPU) {
			this.openCPU((CPU) colleague);
		}
	}
	
	private void openCDDriver(CDDriver cdDriver) {
		this.cpu.executeData(cdDriver.getData());
	}
	
	private void openCPU(CPU cpu) {
		this.soundCard.soundData(cpu.getSoundData());
		this.videoCard.videoData(cpu.getVideoData());
	}

}
