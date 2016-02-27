package com.firstutility.lambdaexercises.domain;

import java.util.HashSet;
import java.util.Set;

public class ArtistBuilder {

	private String name = "name";
	private Set<Artist> members = new HashSet<>();
	private String origin = "origin";

	public static ArtistBuilder anArtist() {
		return new ArtistBuilder();
	}

	public ArtistBuilder name(String name) {
		this.name = name;
		return this;
	}

	public ArtistBuilder isABand() {
		this.name = "The Beatles";
		return this;
	}

	public ArtistBuilder isNotABand() {
		this.name = "Not a band";
		return this;
	}

	public ArtistBuilder members(Set<Artist> members) {
		this.members = members;
		return this;
	}

	public ArtistBuilder origin(String origin) {
		this.origin = origin;
		return this;
	}

	public Artist build() {
		return new Artist(name, members, origin);
	}
}
