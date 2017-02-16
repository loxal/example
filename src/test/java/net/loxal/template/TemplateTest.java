/*
 * Copyright 2017 Alexander Orlov <alexander.orlov@loxal.net>. All rights reserved.
 */

package net.loxal.template;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

import java.util.logging.Logger;

public class TemplateTest {
    private static final Logger LOG = Logger.getGlobal();

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

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @Test
    public void someTest() throws Exception {
        LOG.info("Some Text");
    }
}
