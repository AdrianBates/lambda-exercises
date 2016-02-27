package com.firstutility.lambdaexercises.domain;

import java.util.ArrayList;
import java.util.List;

public class AlbumBuilder {

	private String name = "Revolver";
	private List<Track> tracks = new ArrayList<>();
	private List<Artist> musicians = new ArrayList<>();;

	public static AlbumBuilder anAlbum() {
		return new AlbumBuilder();
	}

	public AlbumBuilder name(String name) {
		this.name = name;
		return this;
	}

	public AlbumBuilder tracks(TrackBuilder... tracks) {
		for (TrackBuilder builder: tracks) {
			this.tracks.add(builder.build());
		}
		return this;
	}

	public AlbumBuilder musicians(ArtistBuilder... musicians) {
		for (ArtistBuilder builder: musicians) {
			this.musicians.add(builder.build());
		}
		return this;
	}

	public Album build() {
		return new Album(name, tracks, musicians);
	}
}
