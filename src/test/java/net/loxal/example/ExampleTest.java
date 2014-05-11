/*
 * Copyright 2014 Alexander Orlov <alexander.orlov@loxal.net>. All rights reserved.
 */

package net.loxal.example;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleTest {
    private static final Logger LOG = LoggerFactory.getLogger(ExampleTest.class);
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
