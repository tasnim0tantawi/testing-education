import java.util.Hashtable;
import java.util.Scanner;

public class Team {
    private Hashtable<String, String[][] > studyTeams = new Hashtable<>();
    private Hashtable<String, Hashtable<String, String>> subjects = new Hashtable<>();
    private Subject sub = new Subject();
    public boolean full = false;

    public Team(){
        this.defineAll();
        this.subjects = sub.getSubjects();

    }
    public void defineAll(){
        // Define study teams
        this.studyTeams.put("ITCS347", new String[10][10]);
        this.studyTeams.get("ITCS347")[0] = new String[]{"aloy85", "ahmed0ali", "noor22osama", "ameera23ali"};
        this.studyTeams.get("ITCS347")[1] = new String[]{ "hussien0gamal"};
        this.studyTeams.get("ITCS347")[2] = new String[]{"Eman", "Ebrahim", "Eid", "Eithar", "Eve", "Emma", "Elene"};
        this.studyTeams.put("ITCS222", new String[10][10]);
        this.studyTeams.get("ITCS222")[0] = new String[]{"ahmed45", "ahmed0ali", "noor22osama", "ameera23ali"};
        this.studyTeams.get("ITCS222")[1] = new String[]{"zahra44", "zainab66", "zaina55", "zainab77", "zainab88", "zainab99", "zainab00"};
        this.studyTeams.put("ITCS444", new String[10][10]);
        this.studyTeams.get("ITCS444")[0] = new String[]{"nada34tarek", "nadoosha4"};
        this.studyTeams.get("ITCS444")[1] = new String[]{"nasser0ali", "yaseen66", "na55er", "na33eem"};
        this.studyTeams.get("ITCS444")[2] = new String[]{"emad0taha", "abozaid5", "orabi54", "abdeen77"};
        this.studyTeams.get("ITCS444")[3] = new String[]{"ahmed0ali", "naser456", "othman66"};
        this.studyTeams.get("ITCS444")[4] = new String[]{"najat4taher", "amal22", "sameer44", "mohamed22", "mohamed44", "mohamed66", "mohamed88"};
        this.studyTeams.get("ITCS444")[5] = new String[]{"eman0emad", "rahma9adel"};
        this.studyTeams.get("ITCS444")[6] = new String[]{"nada13ahmed", "doha22othman", "nadia0ali"};
        this.studyTeams.get("ITCS444")[7] = new String[]{"sohaila0ali", "amna0ahmed", "noura0ali"};
        this.studyTeams.get("ITCS444")[8] = new String[]{"nada65ahmed", "nadin33", "maram09"};
        this.studyTeams.get("ITCS444")[9] = new String[]{"tasnim44tantawi","osama0omar","mohammad33osama"};

        this.studyTeams.put("ITCS113", new String[10][10]);
        this.studyTeams.get("ITCS113")[0] = new String[]{"deena33", "dana66", "donia66"};
        this.studyTeams.get("ITCS113")[1] = new String[]{"rana45", "roaa55", "rania44"};
        this.studyTeams.put("ITCS114", new String[10][10]);
        this.studyTeams.get("ITCS114")[0] = new String[]{"sara22khalid", "samar87magdy", "sara22khalid", "samar87magdy",
                "mohannad0ahmed", "samar87magdy", "sara22khalid"};
        this.studyTeams.put("ITCS333", new String[10][10]);
        this.studyTeams.get("ITCS333")[0] = new String[]{"saranaser8", "ahmed76yousef", "kathreen77", "ahmed76yousef",
                "amal77", "anwar55", "asmaa6", "angela66", "morad66", "tamara55"};
        this.studyTeams.put("ITCS214", new String[10][10]);
        this.studyTeams.put("Math101", new String[10][10]);
        this.studyTeams.put("Math102", new String[10][10]);

    }

    public Hashtable<String, String[][]> getStudyTeams(){
        return this.studyTeams;
    }
    public boolean createTeam(String subjectCode, String name ){
        // Creating a team while being in an existing team
        if (!studyTeams.containsKey(subjectCode)){
            System.out.println("Subject code is not valid");
            return false;
        }
        for (int i = 0; i < studyTeams.get(subjectCode).length; i++){
            for (int j = 0; j < studyTeams.get(subjectCode)[i].length; j++){
                if (studyTeams.get(subjectCode)[i][j] != null){
                    if (studyTeams.get(subjectCode)[i][j].equals(name)){
                        System.out.println("You are already in a team");
                        return false;
                        }
                }
            }
        }

        String numTeams = this.subjects.get(subjectCode).get("NoTeams");
        // Create a new team
        if (Integer.parseInt(numTeams) < 10) {
            this.studyTeams.get(subjectCode)[Integer.parseInt(numTeams)] = new String[]{name};
            this.subjects.get(subjectCode).put("NoTeams", String.valueOf(Integer.parseInt(numTeams) + 1));
            System.out.println("Team created successfully");
            return true;
            }
        else{
            System.out.println("Sorry, you can't create more than 10 teams");
            return false;
                }

    }
    public boolean joinTeam(String subjectCode, String name, int teamNumber) {
        // Invalid subject code
        if (!this.studyTeams.containsKey(subjectCode)) {
            System.out.println("Invalid subject code");
            return false;
        }
        // Invalid team number
        else if (teamNumber - 1 >= this.studyTeams.get(subjectCode).length || teamNumber - 1 < 0) {
            System.out.println("Invalid team number");
            return false;
        }

        // Team is full
        int count = 0;
            for (int i = 0; i < studyTeams.get(subjectCode)[teamNumber-1].length; i++) {
                if (studyTeams.get(subjectCode)[teamNumber-1][i] != null) {
                    count++;
                }
            }
            if (count == studyTeams.get(subjectCode).length) {
                System.out.println("Team is full, it has " + count + " members");
                return false;
            }


        // If the user is already in the team
        for (int i = 0; i < studyTeams.get(subjectCode)[teamNumber-1].length; i++) {
            if (this.studyTeams.get(subjectCode)[teamNumber-1][i] != null) {
                if (this.studyTeams.get(subjectCode)[teamNumber-1][i].equals(name)) {
                    System.out.println("You are already in this team");
                }

            }
        }
        // Join a team
        for (int i = 0; i < studyTeams.get(subjectCode)[teamNumber-1].length; i++) {
            System.out.println(studyTeams.get(subjectCode)[teamNumber-1][i]);
            if (studyTeams.get(subjectCode)[teamNumber-1][i] == null) {
                studyTeams.get(subjectCode)[teamNumber-1][i] = name;
                System.out.println("You joined the team successfully");
                return true;
                }
        }
        return false;
    }
    public boolean removeMember(String subject, String name, int teamNumber) {
        if(!studyTeams.containsKey(subject)) {
            System.out.println("Invalid subject code");
            return false;
        }
        // Invalid team number
        else if (teamNumber -1 >= this.studyTeams.get(subject).length || teamNumber-1 < 0) {
            System.out.println("Invalid team number");
            return false;
        }

        // Remove a member from a team
        for (int i = 0; i < this.studyTeams.get(subject)[teamNumber-1].length; i++) {
            if (this.studyTeams.get(subject)[teamNumber - 1][i] != null) {
                if (this.studyTeams.get(subject)[teamNumber - 1][i].equals(name)) {
                    this.studyTeams.get(subject)[teamNumber - 1][i] = null;
                    System.out.println("You have successfully removed you, " + name + " from the team");
                    return true;
                }
            }
        }
        System.out.println("This member does not exist in this team");
        // Search for the member name in all teams of the subject
        for (int i = 0; i < this.studyTeams.get(subject).length; i++) {
            for (int j = 0; j < this.studyTeams.get(subject)[i].length; j++) {
                if (this.studyTeams.get(subject)[i][j] != null) {
                    if (this.studyTeams.get(subject)[i][j].equals(name)) {
                        System.out.println("Your name is in another team, the team number is " + (i + 1));
                        this.studyTeams.get(subject)[i][j] = null;
                        System.out.println("You have successfully removed you, " + name + " from the team");
                        return true;
                    }

                }
                    }
                }
        System.out.println("This member does not exist in all teams");
        return false;
    }

    public void printTeams(String subjectCode){
        for (int i = 0; i < studyTeams.get(subjectCode).length; i++) {
            System.out.println("Team " + (i + 1) + ":");
            for (int j = 0; j < studyTeams.get(subjectCode)[i].length; j++) {
                if (studyTeams.get(subjectCode)[i][j] != null) {
                    System.out.println(studyTeams.get(subjectCode)[i][j]);
                }
            }
        }
    }



}
