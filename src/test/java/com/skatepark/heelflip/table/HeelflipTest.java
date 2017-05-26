package com.skatepark.heelflip.table;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class HeelflipTest {

    private static final String SAMPLE_FILE_PATH = "sample.json";

    //http://jsonstudio.com/resources/
    private static final String STOCKS_FILE_PATH = "stocks.json";
    private static final String ZIPS_FILE_PATH = "zips.json";

    @Test
    public void testColumnNames() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(SAMPLE_FILE_PATH);

        Heelflip heelflip = new Heelflip("table");
        heelflip.load(stream);

        Assert.assertEquals(10, heelflip.size());

        Set<String> names = heelflip.columnNames();
        Assert.assertTrue(names.contains("a"));
        Assert.assertTrue(names.contains("b"));
        Assert.assertTrue(names.contains("c"));
        Assert.assertTrue(names.contains("d"));
        Assert.assertTrue(names.contains("e"));
        Assert.assertTrue(names.contains("f"));
        Assert.assertTrue(names.contains("g"));
        Assert.assertTrue(names.contains("h"));
        Assert.assertTrue(names.contains("i"));
        Assert.assertTrue(names.contains("j"));
        Assert.assertFalse(names.contains("l"));
    }

    @Test
    public void testMinAsInt() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(SAMPLE_FILE_PATH);

        Heelflip heelflip = new Heelflip("table");
        heelflip.load(stream);

        Assert.assertEquals(10, heelflip.size());

        Assert.assertEquals(0, heelflip.minAsInt("a"));
        Assert.assertEquals(1, heelflip.minAsInt("b"));
        Assert.assertEquals(2, heelflip.minAsInt("c"));
        Assert.assertEquals(3, heelflip.minAsInt("d"));
        Assert.assertEquals(4, heelflip.minAsInt("e"));
        Assert.assertEquals(5, heelflip.minAsInt("f"));
        Assert.assertEquals(6, heelflip.minAsInt("g"));
        Assert.assertEquals(7, heelflip.minAsInt("h"));
        Assert.assertEquals(8, heelflip.minAsInt("i"));
        Assert.assertEquals(9, heelflip.minAsInt("j"));
        Assert.assertEquals(-1, heelflip.minAsInt("l"));
    }

    @Test
    public void testMaxAsInt() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(SAMPLE_FILE_PATH);

        Heelflip heelflip = new Heelflip("table");
        heelflip.load(stream);

        Assert.assertEquals(10, heelflip.size());

        Assert.assertEquals(0, heelflip.maxAsInt("a"));
        Assert.assertEquals(1, heelflip.maxAsInt("b"));
        Assert.assertEquals(2, heelflip.maxAsInt("c"));
        Assert.assertEquals(3, heelflip.maxAsInt("d"));
        Assert.assertEquals(4, heelflip.maxAsInt("e"));
        Assert.assertEquals(5, heelflip.maxAsInt("f"));
        Assert.assertEquals(6, heelflip.maxAsInt("g"));
        Assert.assertEquals(7, heelflip.maxAsInt("h"));
        Assert.assertEquals(8, heelflip.maxAsInt("i"));
        Assert.assertEquals(9, heelflip.maxAsInt("j"));
        Assert.assertEquals(-1, heelflip.maxAsInt("l"));
    }

    @Test
    public void testSumAsInt() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(SAMPLE_FILE_PATH);

        Heelflip heelflip = new Heelflip("table");
        heelflip.load(stream);

        Assert.assertEquals(10, heelflip.size());

        Assert.assertEquals(0, heelflip.sumAsInt("a"));
        Assert.assertEquals(20, heelflip.sumAsInt("b"));
        Assert.assertEquals(40, heelflip.sumAsInt("c"));
        Assert.assertEquals(60, heelflip.sumAsInt("d"));
        Assert.assertEquals(80, heelflip.sumAsInt("e"));
        Assert.assertEquals(100, heelflip.sumAsInt("f"));
        Assert.assertEquals(120, heelflip.sumAsInt("g"));
        Assert.assertEquals(140, heelflip.sumAsInt("h"));
        Assert.assertEquals(160, heelflip.sumAsInt("i"));
        Assert.assertEquals(180, heelflip.sumAsInt("j"));
        Assert.assertEquals(-1, heelflip.sumAsInt("l"));
    }

    @Test
    public void testMinAsLong() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(SAMPLE_FILE_PATH);

        Heelflip heelflip = new Heelflip("table");
        heelflip.load(stream);

        Assert.assertEquals(10, heelflip.size());

        Assert.assertEquals(0, heelflip.minAsLong("a"));
        Assert.assertEquals(1, heelflip.minAsLong("b"));
        Assert.assertEquals(2, heelflip.minAsLong("c"));
        Assert.assertEquals(3, heelflip.minAsLong("d"));
        Assert.assertEquals(4, heelflip.minAsLong("e"));
        Assert.assertEquals(5, heelflip.minAsLong("f"));
        Assert.assertEquals(6, heelflip.minAsLong("g"));
        Assert.assertEquals(7, heelflip.minAsLong("h"));
        Assert.assertEquals(8, heelflip.minAsLong("i"));
        Assert.assertEquals(9, heelflip.minAsLong("j"));
        Assert.assertEquals(-1, heelflip.minAsLong("l"));
    }

    @Test
    public void testMaxAsLong() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(SAMPLE_FILE_PATH);

        Heelflip heelflip = new Heelflip("table");
        heelflip.load(stream);

        Assert.assertEquals(10, heelflip.size());

        Assert.assertEquals(0, heelflip.maxAsLong("a"));
        Assert.assertEquals(1, heelflip.maxAsLong("b"));
        Assert.assertEquals(2, heelflip.maxAsLong("c"));
        Assert.assertEquals(3, heelflip.maxAsLong("d"));
        Assert.assertEquals(4, heelflip.maxAsLong("e"));
        Assert.assertEquals(5, heelflip.maxAsLong("f"));
        Assert.assertEquals(6, heelflip.maxAsLong("g"));
        Assert.assertEquals(7, heelflip.maxAsLong("h"));
        Assert.assertEquals(8, heelflip.maxAsLong("i"));
        Assert.assertEquals(9, heelflip.maxAsLong("j"));
        Assert.assertEquals(-1, heelflip.maxAsLong("l"));
    }

    @Test
    public void testSumAsLong() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(SAMPLE_FILE_PATH);

        Heelflip heelflip = new Heelflip("table");
        heelflip.load(stream);

        Assert.assertEquals(10, heelflip.size());

        Assert.assertEquals(0, heelflip.sumAsLong("a"));
        Assert.assertEquals(20, heelflip.sumAsLong("b"));
        Assert.assertEquals(40, heelflip.sumAsLong("c"));
        Assert.assertEquals(60, heelflip.sumAsLong("d"));
        Assert.assertEquals(80, heelflip.sumAsLong("e"));
        Assert.assertEquals(100, heelflip.sumAsLong("f"));
        Assert.assertEquals(120, heelflip.sumAsLong("g"));
        Assert.assertEquals(140, heelflip.sumAsLong("h"));
        Assert.assertEquals(160, heelflip.sumAsLong("i"));
        Assert.assertEquals(180, heelflip.sumAsLong("j"));
        Assert.assertEquals(-1, heelflip.sumAsLong("l"));
    }

    @Test
    public void testMinAsDouble() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(SAMPLE_FILE_PATH);

        Heelflip heelflip = new Heelflip("table");
        heelflip.load(stream);

        Assert.assertEquals(10, heelflip.size());

        Assert.assertEquals(0, heelflip.minAsDouble("a"), 10E10);
        Assert.assertEquals(1, heelflip.minAsDouble("b"), 10E10);
        Assert.assertEquals(2, heelflip.minAsDouble("c"), 10E10);
        Assert.assertEquals(3, heelflip.minAsDouble("d"), 10E10);
        Assert.assertEquals(4, heelflip.minAsDouble("e"), 10E10);
        Assert.assertEquals(5, heelflip.minAsDouble("f"), 10E10);
        Assert.assertEquals(6, heelflip.minAsDouble("g"), 10E10);
        Assert.assertEquals(7, heelflip.minAsDouble("h"), 10E10);
        Assert.assertEquals(8, heelflip.minAsDouble("i"), 10E10);
        Assert.assertEquals(9, heelflip.minAsDouble("j"), 10E10);
        Assert.assertEquals(-1, heelflip.minAsDouble("l"), 10E10);
    }

    @Test
    public void testMaxAsDouble() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(SAMPLE_FILE_PATH);

        Heelflip heelflip = new Heelflip("table");
        heelflip.load(stream);

        Assert.assertEquals(10, heelflip.size());

        Assert.assertEquals(0, heelflip.maxAsDouble("a"), 10E10);
        Assert.assertEquals(1, heelflip.maxAsDouble("b"), 10E10);
        Assert.assertEquals(2, heelflip.maxAsDouble("c"), 10E10);
        Assert.assertEquals(3, heelflip.maxAsDouble("d"), 10E10);
        Assert.assertEquals(4, heelflip.maxAsDouble("e"), 10E10);
        Assert.assertEquals(5, heelflip.maxAsDouble("f"), 10E10);
        Assert.assertEquals(6, heelflip.maxAsDouble("g"), 10E10);
        Assert.assertEquals(7, heelflip.maxAsDouble("h"), 10E10);
        Assert.assertEquals(8, heelflip.maxAsDouble("i"), 10E10);
        Assert.assertEquals(9, heelflip.maxAsDouble("j"), 10E10);
        Assert.assertEquals(-1, heelflip.maxAsDouble("l"), 10E10);
    }

    @Test
    public void testSumAsDouble() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(SAMPLE_FILE_PATH);

        Heelflip heelflip = new Heelflip("table");
        heelflip.load(stream);

        Assert.assertEquals(10, heelflip.size());

        Assert.assertEquals(0, heelflip.sumAsDouble("a"), 10E10);
        Assert.assertEquals(20, heelflip.sumAsDouble("b"), 10E10);
        Assert.assertEquals(40, heelflip.sumAsDouble("c"), 10E10);
        Assert.assertEquals(60, heelflip.sumAsDouble("d"), 10E10);
        Assert.assertEquals(80, heelflip.sumAsDouble("e"), 10E10);
        Assert.assertEquals(100, heelflip.sumAsDouble("f"), 10E10);
        Assert.assertEquals(120, heelflip.sumAsDouble("g"), 10E10);
        Assert.assertEquals(140, heelflip.sumAsDouble("h"), 10E10);
        Assert.assertEquals(160, heelflip.sumAsDouble("i"), 10E10);
        Assert.assertEquals(180, heelflip.sumAsDouble("j"), 10E10);
        Assert.assertEquals(-1, heelflip.sumAsDouble("l"), 10E10);
    }

    @Test
    public void testLoadLargeFiles() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(STOCKS_FILE_PATH);

        Heelflip heelflip = new Heelflip("table");
        heelflip.load(stream);
        Assert.assertEquals(69, heelflip.size());

        stream = getClass().getClassLoader().getResourceAsStream(ZIPS_FILE_PATH);
        heelflip.load(stream);

        Assert.assertEquals(75, heelflip.size());
    }
}
