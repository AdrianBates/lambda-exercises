package com.firstutility.lambdaexercises.domain;

import static com.firstutility.lambdaexercises.domain.AlbumBuilder.anAlbum;
import static com.firstutility.lambdaexercises.domain.TrackBuilder.aTrack;
import static org.junit.Assert.*;

import org.junit.Test;

public class AlbumTest {

	@Test
	public void testLengthOfAlbum() {
		final Album album = anAlbum().tracks(aTrack().length(70)).build();
		
		assertEquals(70, album.getLength());
	}

	@Test
	public void testLengthOfAlbumWith2Albums() {
		final Album album = anAlbum().tracks(aTrack().length(70), aTrack().length(30)).build();
		
		assertEquals(100, album.getLength());
	}

}
