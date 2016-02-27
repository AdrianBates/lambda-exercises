package com.firstutility.lambdaexercises.domain;

public class TrackBuilder {
	private String name;
	private int length;
	
	public static TrackBuilder aTrack() {
		return new TrackBuilder();
	}

	public TrackBuilder name(String name) {
		this.name = name;
		return this;
	}

	public TrackBuilder length(int length) {
		this.length = length;
		return this;
	}

	public Track build() {
		return new Track(name, length);
	}
}
