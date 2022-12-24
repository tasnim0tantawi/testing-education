import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Team team = new Team();
        Subject subject = new Subject();
        Hashtable<String, String[][]> studyTeams = team.getStudyTeams();
        Hashtable<String, Hashtable<String, String>> subjects = subject.getSubjects();


        System.out.println("Welcome to the Study Team System");
        System.out.println("Please choose one of the following options:");
        System.out.println("1- Create a new study team");
        System.out.println("2- Join an existing study team");
        System.out.println("3- View all study teams");
        System.out.println("4- Delete yourself from a study team");

        int option = input.nextInt();
        if (option ==1){
            System.out.println("Please enter the subject code:");
            String subjectCode = input.next();
            System.out.println("Please enter your name:");
            String name = input.next();
            System.out.println(team.createTeam(subjectCode, name));
        }
        else if (option==2) {
            System.out.println("Please enter the subject code:");
            String subjectCode = input.next();
            if (studyTeams.containsKey(subjectCode)){
                System.out.println("Here is list of teams you can join:");
                team.printTeams(subjectCode);

                System.out.println("Please enter the team number:");
                int teamNumber = input.nextInt();
                System.out.println("Please enter your name:");
                String name = input.next();
                System.out.println(team.joinTeam(subjectCode, name, teamNumber));
            }
        }
        else if (option==3){
            // display all study teams
            System.out.println("Here is a list of all study teams:");
            for (String subjectCode : studyTeams.keySet()) {
                System.out.println("Subject: " + subjects.get(subjectCode).get("Name"));
                team.printTeams(subjectCode);
            }
        }
        else if (option==4){
            // remove a member from a team
            System.out.println("Please enter the subject code:");
            String subjectCode = input.next();
            System.out.println("Please enter your team number:");
            int teamNumber = input.nextInt();
            System.out.println("Please enter your name:");
            String name = input.next();

            team.removeMember(subjectCode, name, teamNumber);
        }

        else{
            System.out.println("Invalid option");
        }

    }
}