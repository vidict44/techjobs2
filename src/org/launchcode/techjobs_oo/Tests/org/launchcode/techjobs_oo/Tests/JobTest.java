package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job;
    Job test_job2;
    Job test_job3;
    Job testIdentical1;
    Job testIdentical2;

    @Before
    public void createJobObject(){
        test_job = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testIdentical1 = new Job("Analyst", new Employer("Microsoft"), new Location("Webster Groves"), new PositionType("Data"), new CoreCompetency("Detail-Oriented"));
        testIdentical2 = new Job("Analyst", new Employer("Microsoft"), new Location("Webster Groves"), new PositionType("Data"), new CoreCompetency("Detail-Oriented"));

    }


    @Test
    public void testSettingJobId(){
        assertEquals(test_job, test_job2, 1);

    }
    private void assertEquals(Job test_job, Job test_job2, int i) {
    }

    @Test
    public void testJobConstructorSetAllFields(){
        assertTrue(test_job.getId()<test_job3.getId());
        assertTrue("Product tester".equals(test_job3.getName()));
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getLocation() instanceof Location);
        assertTrue(test_job3.getCoreCompetency() instanceof  CoreCompetency);
        assertTrue(test_job3.getPositionType() instanceof  PositionType);
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(testIdentical1.getId() == testIdentical2.getId());
    }

    @Test
    public void testJobsForToString(){
        String testString = "\n" + "ID: " + testIdentical1.getId() + "\n" + "Name: " + testIdentical1.getName() + "\n" + "Employer: " + testIdentical1.getEmployer() + "\n" + "Location: " + testIdentical1.getLocation() + "\n" + "Position Type: " + testIdentical1.getPositionType() + "\n" + "Core Competency: " + testIdentical1.getCoreCompetency() + "\n";
        assertTrue(testString.equals(testIdentical1.toString()));

        String testStringBlank = "\n" + "ID: " + test_job.getId() + "\n" + "Name: Data not available" + "\n" + "Employer: Data not available" + "\n" + "Location: Data not available"+ "\n" + "Position Type: Data not available" + "\n" + "Core Competency: Data not available" + "\n";
        assertTrue(testStringBlank.equals(testStringBlank.toString()));
    }
}
