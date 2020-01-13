package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

public class JobTest {
    Job test_job;
    Job test_job2;

    @Before
    public void createJobObject(){
        test_job = new Job();
        test_job2 = new Job();
    }

    @Test
    public void testSettingJobId(){
        assertEquals(test_job, test_job2, 1);

    }

    private void assertEquals(Job test_job, Job test_job2, int i) {
    }

}
