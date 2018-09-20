package com.arcu.ignite1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class LocationUnitTests {

    @Test
    public void locationPropertiesAreNullTest() {

        Location location = new Location();

        assertNull(location.snippet);
        assertNull(location.title);
        assertNull(location.latitude);
        assertNull(location.longitude);
    }

    @Test
    public void locationGetters() {

        Double expectedLatitude = 1.0;
        Double expectedLongitude = 2.0;
        String expectedTitle = "test Title";
        String expectedSnippet = "test Snippet";

        Location location = new Location(expectedLatitude, expectedLongitude, expectedTitle, expectedSnippet);

        assertEquals("Latitudes are not the same", expectedLatitude, location.getLatitude());
        assertEquals("Longitudes are not the same", expectedLongitude, location.getLongitude());
        assertEquals("Titles are not the same", expectedTitle, location.getTitle());
        assertEquals("Snippets are not the same", expectedSnippet, location.getSnippet());

        location = new Location();

        assertNotNull(location.getLatitude());
        assertNotNull(location.getLongitude());
        assertNotNull(location.getTitle());
        assertNotNull(location.getSnippet());
    }

    @Test
    public void locationSetters() {

        Location location = new Location();

        Double expectedLatitude = 1.0;
        Double expectedLongitude = 2.0;
        String expectedTitle = "test Title";
        String expectedSnippet = "test Snippet";

        location.setLatitude(expectedLatitude);
        location.setLongitude(expectedLongitude);
        location.setTitle(expectedTitle);
        location.setSnippet(expectedSnippet);

        assertEquals("Latitudes are not the same", expectedLatitude, location.latitude);
        assertEquals("Longitudes are not the same", expectedLongitude, location.longitude);
        assertEquals("Titles are not the same", expectedTitle, location.title);
        assertEquals("Snippets are not the same", expectedSnippet, location.snippet);
    }
}
