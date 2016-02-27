package com.firstutility.lambdaexercises.chpt3;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.firstutility.lambdaexercises.domain.Album;

public class LongestTracks {

	public List<String> longestTracks(Album album) {
		return album.getTracks()
				.filter(track -> track.getLength() > 60)
				.map(track -> track.getName())
				.collect(toList());
	}
}
