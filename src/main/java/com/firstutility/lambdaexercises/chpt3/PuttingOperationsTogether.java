package com.firstutility.lambdaexercises.chpt3;

import java.util.List;
import java.util.stream.Collectors;

import com.firstutility.lambdaexercises.domain.Album;

public class PuttingOperationsTogether {

	public List<String> getAlbumsNationalities(Album album) {
		return album.getMusicians()
				.filter(artist -> artist.getName().startsWith("The"))
				.map(artist -> artist.getOrigin())
				.collect(Collectors.toList());
	}
}
