import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;


public class TeamTest {
    public TeamTest() {
    }
    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
    }
    @After
    public void tearDown() {
    }
    // joinTeam test
    @Test
    // Testing join a team method with a valid subject code and team number
    public void testCase1JoinTeam() {
        String subjectCode = "ITCS347";
        String name = "martha55";
        int teamNumber = 5;
        Team instance = new Team();
        boolean expResult = true;
        boolean result = instance.joinTeam(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    @Test
    // Testing join team method with invalid subject code and valid team number
    public void testCase2JoinTeam() {
        String subjectCode = "CSCA08";
        String name = "John";
        int teamNumber = 1;
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.joinTeam(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    @Test
    // Testing join team method with valid subject code and invalid team number
    public void testCase3JoinTeam() {
        String subjectCode = "ITCS333";
        String name = "jenna55";
        int teamNumber = 51;
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.joinTeam(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }

    @Test
    // Testing join team method with invalid subject code and invalid team number
    public void testCase4JoinTeam() {
        String subjectCode = "CSC101";
        String name = "Ahmed";
        int teamNumber = 51;
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.joinTeam(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    @Test
    // Testing joining full team
    public void testCase5JoinTeam() {
        String subjectCode = "ITCS333";
        String name = "ahmed0mohsen";
        int teamNumber = 1;
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.joinTeam(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    // Testing join team with invalid negative team number
    @Test
    public void testCase6JoinTeam() {
        String subjectCode = "ITCS333";
        String name = "marya44";
        int teamNumber = -1;
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.joinTeam(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    // Valid subject code but lower case
    @Test
    public void testCase7JoinTeam() {
        String subjectCode = "itcs347";
        String name = "marya44";
        int teamNumber = 5;
        Team instance = new Team();
        boolean expResult = true;
        boolean result = instance.joinTeam(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    @Test
    // Testing creating a new team with a valid subject code
    public void testCase1CreateTeam() {
        String subjectCode = "ITCS347";
        String name = "tato123";
        Team instance = new Team();
        boolean expResult = true;
        boolean result = instance.createTeam(subjectCode, name);
        assertEquals(expResult, result);
    }
    @Test
    // Testing creating a new team with an invalid subject code
    public void testCase2CreateTeam() {
        String subjectCode = "CSCA08";
        String name = "John";
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.createTeam(subjectCode, name);
        assertEquals(expResult, result);
    }
    @Test
    // Creating a team while already being in a team
    public void testCase3CreateTeam() {
        String subjectCode = "ITCS444";
        String name = "eman0emad";
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.createTeam(subjectCode, name);
        assertEquals(expResult, result);
    }
    // Creating a team when max number of teams is reached
    @Test
    public void testCase4CreateTeam() {
        String subjectCode = "ITCS444";
        String name = "maria87";
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.createTeam(subjectCode, name);
        assertEquals(expResult, result);
    }
    @Test
    public void testCase5CreateTeam() {
        String subjectCode = "itcs114";
        String name = "ameera0hesham";
        Team instance = new Team();
        boolean expResult = true;
        boolean result = instance.createTeam(subjectCode, name);
        assertEquals(expResult, result);
    }
     // Testing remove team method with a valid subject code and team number
    @Test
    public void testCase1RemoveMember() {
        String subjectCode = "ITCS444";
        String name = "nadoosha4";
        int teamNumber = 1;
        Team instance = new Team();
        boolean expResult = true;
        boolean result = instance.removeMember(subjectCode, name, teamNumber);
        assertEquals(expResult, result);

    }
    // Testing remove team method with an invalid subject code
    @Test
    public void testCase2RemoveMember() {
        String subjectCode = "CSCA08";
        String name = "John";
        int teamNumber = 1;
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.removeMember(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    // Testing remove team method with invalid team number
    @Test
    public void testCase3RemoveMember() {
        String subjectCode = "ITCS333";
        String name = "John";
        int teamNumber = 12;
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.removeMember(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    // Removing a member from a team when not in a team
    @Test
    public void testCase4RemoveMember() {
        String subjectCode = "ITCS222";
        String name = "zahra45";
        int teamNumber = 1;
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.removeMember(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    // Removing a member from a team when it is in another team
    @Test
    public void testCase5RemoveMember() {
        String subjectCode = "ITCS444";
        String name = "tasnim44tantawi";
        int teamNumber = 2;
        Team instance = new Team();
        boolean expResult = true;
        boolean result = instance.removeMember(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    @Test
    // Testing remove team method with negative team number
    public void testCase6RemoveMember() {
        String subjectCode = "ITCS114";
        String name = "nadoosha4";
        int teamNumber = -1;
        Team instance = new Team();
        boolean expResult = false;
        boolean result = instance.removeMember(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    // Testing remove team method with a valid subject code in lower case
    @Test
    public void testCase7RemoveMember() {
        String subjectCode = "itcs333";
        String name = "saranaser8";
        int teamNumber = 1;
        Team instance = new Team();
        boolean expResult = true;
        boolean result = instance.removeMember(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }











}