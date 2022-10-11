package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        //create two Job objects using the empty constructor
        //Use assertNotEquals to verify that the IDs of the two objects are distinct
        //Fix Job() constructor code
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(),job2.getId());



    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Bob", new Employer("World Wide Tech"), new Location("Saint Louis"),new PositionType("Data Analyst")
        , new CoreCompetency("Coding"));
        assertTrue(job1.getName() instanceof String);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Bob",job1.getName());
        assertEquals("World Wide Tech", job1.getEmployer().getValue());
        assertEquals("Saint Louis", job1.getLocation().getValue());
        assertEquals("Data Analyst", job1.getPositionType().getValue());
        assertEquals("Coding", job1.getCoreCompetency().getValue());



        //use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class
        //and value of each field. Your test should have 5 assert statements of each type

    }
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Bob", new Employer("World Wide Tech"), new Location("Saint Louis"),new PositionType("Data Analyst")
                , new CoreCompetency("Coding"));
        Job job2 = new Job("Bob", new Employer("World Wide Tech"), new Location("Saint Louis"),new PositionType("Data Analyst")
                , new CoreCompetency("Coding"));
        assertFalse(job1.equals(job2));


    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job1 = new Job("Bob", new Employer("World Wide Tech"), new Location("Saint Louis"),new PositionType("Data Analyst")
                , new CoreCompetency("Coding"));
        assertEquals('\n', job1.toString().charAt(0));
        assertEquals('\n', job1.toString().charAt(job1.toString().length()-1));


    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job1 = new Job("Bob", new Employer("World Wide Tech"), new Location("Saint Louis"),new PositionType("Data Analyst")
                , new CoreCompetency("Coding"));
      //  assertTrue(job1.toString().contains("ID: 1"));
        assertTrue(job1.toString().contains("Name: Bob"));
        assertTrue(job1.toString().contains("Employer: World Wide Tech"));
        assertTrue(job1.toString().contains("Location: Saint Louis"));
        assertTrue(job1.toString().contains("Position Type: Data Analyst"));
        assertTrue(job1.toString().contains("Core Competency: Coding"));

    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job1 = new Job("", new Employer(""), new Location(""), new PositionType("")
                , new CoreCompetency(""));
        String expected = "\nID: 1\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n";
        assertEquals(expected,job1.toString());
        Job job2 = new Job(null, null, null ,null
                ,null);
        String expected2 = "\nID: 2\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n";
        assertEquals(expected2,job2.toString());

    }

}