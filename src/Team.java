import java.util.Hashtable;
import java.util.Scanner;

public class Team {
    private Hashtable<String, String[][] > studyTeams = new Hashtable<>();
    private Hashtable<String, Hashtable<String, String>> subjects = new Hashtable<>();
    private Subject sub = new Subject();
    private boolean full = true;

    public Team(){
        this.defineAll();
        this.subjects = sub.getSubjects();

    }
    public void defineAll(){
        // Define study teams
        this.studyTeams.put("ITCS347", new String[50][20]);
        this.studyTeams.get("ITCS347")[0] = new String[]{"aloy85", "ahmed0ali", "noor22osama", "ameera23ali", "Tasnim", "Omar", "Mohammad"};
        this.studyTeams.get("ITCS347")[1] = new String[]{"Haleem", "Hassan", "Hussain", "Hussam", "hussien0gamal", "Husam", "Hussein"};
        this.studyTeams.get("ITCS347")[2] = new String[]{"Eman", "Ebrahim", "Eid", "Eithar", "Eve", "Emma", "Elene"};
        this.studyTeams.put("ITCS222", new String[50][20]);
        this.studyTeams.get("ITCS222")[0] = new String[]{"Ameer", "Anna", "Amer", "Ameera", "Ahmad", "Omar", "Mohammad"};
        this.studyTeams.get("ITCS222")[1] = new String[]{"Zahra", "Zain", "Zainab", "Zara", "Zakeya", "Zaineb", "Zaina"};
        this.studyTeams.put("ITCS444", new String[50][20]);
        this.studyTeams.get("ITCS444")[0] = new String[]{"Nada", "Nadia", "Nadine", "Nadim", "Noha", "Nadim", "Nadine"};
        this.studyTeams.put("ITCS113", new String[50][20]);
        this.studyTeams.get("ITCS113")[0] = new String[]{"Dina", "Dana", "Dania", "Doaa", "Dagher", "Daleela"};
        this.studyTeams.get("ITCS113")[1] = new String[]{"Rana", "Rania", "Roaa"};
        this.studyTeams.put("ITCS114", new String[50][20]);
        this.studyTeams.get("ITCS114")[0] = new String[]{"Sara", "Samar", "Sahar", "Soha"};
        this.studyTeams.put("ITCS333", new String[50][20]);
        this.studyTeams.get("ITCS333")[0] = new String[]{"Sara", "Ahmed", "Joana"};
        this.studyTeams.put("ITCS214", new String[50][20]);
        this.studyTeams.put("Math101", new String[50][20]);
        this.studyTeams.put("Math102", new String[50][20]);

    }

    public Hashtable<String, String[][]> getStudyTeams(){
        return this.studyTeams;
    }
    public boolean createTeam(String subjectCode, String name ){
        // Create a new team
        if (this.studyTeams.containsKey(subjectCode)){
            for (int i = 0; i < studyTeams.get(subjectCode).length; i++) {
                if (studyTeams.get(subjectCode)[i] == null) {
                    studyTeams.get(subjectCode)[i] = new String[]{name};
                    return true;
                } else {
                    System.out.println("Invalid subject code");
                    return false;
                }
            }
        }
        return false;

    }
    public boolean joinTeam(String subjectCode, String name, int teamNumber) {
        // Invalid subject code
        if (!this.studyTeams.containsKey(subjectCode)) {
            System.out.println("Invalid subject code");
            return false;
        }
        // Invalid team number
        if (teamNumber > this.studyTeams.get(subjectCode).length) {
            System.out.println("Invalid team number");
            return false;
        }
        // If the user is already in the team
        for (int i = 0; i < studyTeams.get(subjectCode)[teamNumber - 1].length; i++) {
            if (this.studyTeams.get(subjectCode)[teamNumber - 1][i] != null) {
                if (this.studyTeams.get(subjectCode)[teamNumber - 1][i].equals(name)) {
                    System.out.println("You are already in this team");
                    return false;
                }
            }
        }
        // Add a member to a team

        for (int k = 0; k < this.studyTeams.get(subjectCode)[teamNumber - 1].length; k++) {
            if (this.studyTeams.get(subjectCode)[teamNumber - 1][k] == null) {
                this.full = false;
                this.studyTeams.get(subjectCode)[teamNumber - 1][k] = name;
                System.out.println("You have successfully joined the team");
                System.out.println("Here is the list of members in your team:");
                for (int i = 0; i < studyTeams.get(subjectCode)[teamNumber - 1].length; i++) {
                    if (this.studyTeams.get(subjectCode)[teamNumber - 1][i] != null) {
                        System.out.println(studyTeams.get(subjectCode)[teamNumber - 1][i]);
                    }
                }
                return true;
            }
        }
        if (this.full) {
            System.out.println("This team is full");
            return false;
        }
        return false;
    }
    public boolean removeMember(String subject, String name, int teamNumber) {
        // Remove a member from a team
        for (int i = 0; i < this.studyTeams.get(subject)[teamNumber - 1].length; i++) {
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
                        System.out.println("Do you want to remove yourself from this team? (Y/N)");
                        Scanner scanner = new Scanner(System.in);
                        String answer = scanner.nextLine();
                        if (answer.equals("Y")) {
                            this.studyTeams.get(subject)[i][j] = null;
                            System.out.println("You have successfully removed you, " + name + " from the team");
                            return true;
                        }
                        else if (answer.equals("N")) {
                            System.out.println("You have not removed yourself from the team");
                            return false;
                        }
                        else {
                            System.out.println("Invalid input");
                            return false;
                        }
                    }
                }
            }
        }

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
