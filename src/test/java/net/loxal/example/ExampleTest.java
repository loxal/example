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

    /**
     * This method won't be executed if the unit test will be (externally) terminated (e.g. from within the IDE).
     * You have to act **really** fast in this case.
     *
     * Is executed right after this unit test class has been initialized.
     */
    @BeforeClass
    public static void beforeClass() throws Exception {
        LOG.info("@BeforeClass"); // will be always executed, even if a test fails throwing any Exception
    }

    /**
     * This method won't be executed if the unit test will be (externally) terminated (e.g. from within the IDE).
     *
     * Is executed after all @Test annotated uni test within this test class have been executed.
     */
    @AfterClass
    public static void afterClass() throws Exception {
        LOG.info("@AfterClass"); // will be always executed, even if a test fails throwing any Exception
    }

    /**
     * This method won't be executed if the unit test will be (externally) terminated (e.g. from within the IDE).
     * You have to act *really* fast in this case.
     *
     * Is executed just before every @Test annotated unit test method.
     */
    @Before
    public void setUp() throws Exception {
        LOG.info("@Before"); // will be always executed, even if a test fails throwing any Exception
    }

    /**
     * This method won't be executed if the unit test will be (externally) terminated (e.g. from within the IDE).
     *
     * Is executed right after every @Test annotated unit test method.
     */
    @After
    public void tearDown() throws Exception {
        LOG.info("@After"); // will be always executed, even if a test fails throwing any Exception
    }

    @Test
    public void someTest() throws Exception {
        Thread.sleep(10000); // interrupts current "main" Thread in the "main" thread group
        throw new Error("VM Error");
    }
}
