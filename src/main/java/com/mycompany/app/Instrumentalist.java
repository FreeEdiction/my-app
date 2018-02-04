package com.mycompany.app;

public class Instrumentalist {
	
	public Instrumentalist() {}

	public void perform() {
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}

	private String song;

	public void setSong(String song) {
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	public String screamSong() {
		return song;
	}

	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
