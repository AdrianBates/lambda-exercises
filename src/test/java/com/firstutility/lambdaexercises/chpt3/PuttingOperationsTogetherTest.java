package com.firstutility.lambdaexercises.chpt3;

import static com.firstutility.lambdaexercises.domain.AlbumBuilder.anAlbum;
import static com.firstutility.lambdaexercises.domain.ArtistBuilder.anArtist;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.firstutility.lambdaexercises.domain.Album;

public class PuttingOperationsTogetherTest {

	@Test
	public void testGetAlbumsNationalities() {
		final Album album = anAlbum().musicians(anArtist().isABand().origin("Liverpool")).build();

		final PuttingOperationsTogether puttingOperationsTogether = new PuttingOperationsTogether();

		final List<String> actual = puttingOperationsTogether.getAlbumsNationalities(album);

		assertEquals(asList("Liverpool"), actual);
	}

	@Test
	public void testGetAlbumsNationalitiesWith2Nationalities() {
		final Album album = anAlbum().musicians(anArtist().isABand().origin("Liverpool"),
				anArtist().isABand().origin("Brighton")).build();

		final PuttingOperationsTogether puttingOperationsTogether = new PuttingOperationsTogether();

		final List<String> actual = puttingOperationsTogether.getAlbumsNationalities(album);

		assertEquals(asList("Liverpool", "Brighton"), actual);
	}

	@Test
	public void testGetAlbumsNationalitiesWith2NationalitiesOneNoThe() {
		final Album album = anAlbum().musicians(anArtist().isABand().origin("Liverpool"),
				anArtist().isNotABand().origin("Brighton")).build();

		final PuttingOperationsTogether puttingOperationsTogether = new PuttingOperationsTogether();

		final List<String> actual = puttingOperationsTogether.getAlbumsNationalities(album);

		assertEquals(asList("Liverpool"), actual);
	}

}
