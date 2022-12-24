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
    // Testing join an empty team method with a valid subject code and team number
    public void testCase1JoinTeam() {
        String subjectCode = "ITCS333";
        String name = "Maria";
        int teamNumber = 1;
        Team instance = new Team();
        instance.joinTeam(subjectCode, name, teamNumber);
        String[][] expResult = {{"Maria", "0"}};
        String[][] result = instance.getStudyTeams().get(subjectCode);
        assertArrayEquals(expResult, result);
    }
    @Test
    // Testing join team method with invalid subject code and valid team number
    public void testCase2JoinTeam() {
        String subjectCode = "CSCA08";
        String name = "John";
        int teamNumber = 1;
        Team instance = new Team();
        instance.joinTeam(subjectCode, name, teamNumber);
        boolean expResult = false;
        boolean result = instance.joinTeam(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    @Test
    // Testing join team method with valid subject code and invalid team number
    public void testCase3JoinTeam() {
        String subjectCode = "ITCS333";
        String name = "John";
        int teamNumber = 51;
        Team instance = new Team();
        instance.joinTeam(subjectCode, name, teamNumber);
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
        instance.joinTeam(subjectCode, name, teamNumber);
        boolean expResult = false;
        boolean result = instance.joinTeam(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    @Test
    // Testing join team method with valid subject code and team number and a full team
    public void testCase5JoinTeam() {
        String subjectCode = "ITCS333";
        String name = "ahmed0mohsen";
        int teamNumber = 1;
        Team instance = new Team();
        instance.joinTeam(subjectCode, name, teamNumber);
        boolean expResult = false;
        boolean result = instance.joinTeam(subjectCode, name, teamNumber);
        assertEquals(expResult, result);
    }
    @Test
    // Testing creating a new team with a valid subject code
    public void testCase1CreateTeam() {
        String subjectCode = "ITCS333";
        String name = "Maria";
        Team instance = new Team();
        instance.createTeam(subjectCode, name);
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
        instance.createTeam(subjectCode, name);
        boolean expResult = false;
        boolean result = instance.createTeam(subjectCode, name);
        assertEquals(expResult, result);
    }
    @Test
    // Creating a team while already being in a team
    public void testCase3CreateTeam() {
        String subjectCode = "ITCS333";
        String name = "John";
        Team instance = new Team();
        instance.createTeam(subjectCode, name);
        boolean expResult = false;
        boolean result = instance.createTeam(subjectCode, name);
        assertEquals(expResult, result);
    }
    // Creating a team when max number of teams is reached
    @Test
    public void testCase4CreateTeam() {
        String subjectCode = "ITCS444";
        String name = "Maria";
        Team instance = new Team();
        instance.createTeam(subjectCode, name);
        boolean expResult = false;
        boolean result = instance.createTeam(subjectCode, name);
        assertEquals(expResult, result);
    }









}