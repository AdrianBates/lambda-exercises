package com.firstutility.lambdaexercises.chpt3;

import static com.firstutility.lambdaexercises.domain.AlbumBuilder.anAlbum;
import static com.firstutility.lambdaexercises.domain.TrackBuilder.aTrack;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.firstutility.lambdaexercises.domain.Album;

public class LongestTracksTest {
	
	private LongestTracks longestTracks = new LongestTracks();

	@Test
	public void testLongestTracks() {
		final Album album = anAlbum().tracks(aTrack().name("track1").length(70)).build();

		assertEquals(asList("track1"), longestTracks.longestTracks(album));
	}

	@Test
	public void testLongestTracks2Tracks() {
		final Album album = anAlbum().tracks(aTrack().name("track1").length(70), aTrack().name("track2").length(70)).build();

		assertEquals(asList("track1", "track2"), longestTracks.longestTracks(album));
	}

	@Test
	public void testLongestTracks2Tracks1TooShort() {
		final Album album = anAlbum().tracks(aTrack().name("track1").length(70), aTrack().name("track2").length(50)).build();

		assertEquals(asList("track1"), longestTracks.longestTracks(album));
	}

}
