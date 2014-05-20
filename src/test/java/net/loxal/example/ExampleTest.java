/*
 * Copyright 2014 Alexander Orlov <alexander.orlov@loxal.net>. All rights reserved.
 */

package net.loxal.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleTest {
    private static final Logger LOG = LoggerFactory.getLogger(ExampleTest.class);
    private Example example;
    private Object o;

    @BeforeClass
    public static void beforeClass() {
        LOG.info("@BeforeClass");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        LOG.info("@AfterClass");
    }

    @Before
    public void setUp() throws Exception {
        LOG.info("@Before");
        example = new Example();
    }

    @After
    public void tearDown() throws Exception {
        LOG.info("@After");
    }

    @Test
    public void someTest() throws Exception {
        throw new NullPointerException("NPE");
    }
}
