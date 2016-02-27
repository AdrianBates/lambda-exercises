package com.firstutility.lambdaexercises.chpt3;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Collectors;

import com.firstutility.lambdaexercises.domain.Album;

public class NationalitiesOnAlbum {

	public List<String> getAlbumsNationalities(Album album) {
		return album.getMusicians()
				.filter(artist -> artist.getName().startsWith("The"))
				.map(artist -> artist.getOrigin())
				.collect(toList());
	}
}
