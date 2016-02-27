package com.firstutility.lambdaexercises.domain;

import java.util.ArrayList;
import java.util.List;

public class Album {

	private String name;
	private List<Track> tracks = new ArrayList<>();
	private List<Artist> musicians = new ArrayList<>();

	public Album(String name, List<Track> tracks, List<Artist> musicians) {
		super();
		this.name = name;
		this.tracks = tracks;
		this.musicians = musicians;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	public List<Artist> getMusicians() {
		return musicians;
	}

	public void setMusicians(List<Artist> musicians) {
		this.musicians = musicians;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((musicians == null) ? 0 : musicians.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tracks == null) ? 0 : tracks.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		if (musicians == null) {
			if (other.musicians != null)
				return false;
		} else if (!musicians.equals(other.musicians))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tracks == null) {
			if (other.tracks != null)
				return false;
		} else if (!tracks.equals(other.tracks))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Album [name=" + name + ", tracks=" + tracks + ", musicians=" + musicians + "]";
	}

}
