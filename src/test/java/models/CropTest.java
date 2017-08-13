package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.*;

public class CropTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void NewCropObjectGetsCorrectlyCreated_true() throws Exception{
        Crop testCrop = setupNewCrop();
        assertEquals(true, testCrop instanceof Crop);
    }

    @Test
    public void testGetCropId_1234() {
        Crop testCrop = setupNewCrop();
        testCrop.setCropId(1234);
        assertTrue(testCrop.getCropId() == 1234);
    }

    @Test
    public void testSetCropId_1234() {
        Crop testCrop = setupNewCrop();
        testCrop.setCropId(1234);
        assertTrue(testCrop.getCropId() == 1234);
    }








    //helpers
    public Crop setupNewCrop() {
        return new Crop("Cucumber");
    }

}