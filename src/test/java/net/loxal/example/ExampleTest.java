/*
 * Copyright 2014 Alexander Orlov <alexander.orlov@loxal.net>. All rights reserved.
 */

package net.loxal.example;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Logger;

public class ExampleTest {
    public static final Logger LOG = Logger.getGlobal();
    private final Example example = new Example();

    @BeforeClass
    public static void beforeClass() {
        LOG.info("@BeforeClass");
    }

    @Before
    public void setUp() throws Exception {
        LOG.info("@Before");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void someTest() throws Exception {

    }
}
