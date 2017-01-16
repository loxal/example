/*
 * Copyright 2017 Alexander Orlov <alexander.orlov@loxal.net>. All rights reserved.
 */

package net.loxal.template;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Logger;

public class TemplateTest {
    public static final Logger LOG = Logger.getGlobal();
    private final Template template = new Template();

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
