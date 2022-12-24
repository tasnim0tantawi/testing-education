import java.util.Hashtable;

public class Subject {
    private Hashtable<String, Hashtable<String, String>> subjects = new Hashtable<>();
    public Subject(){
        this.defineAll();

    }
    public void defineAll(){
        this.subjects.put("Math101", new Hashtable<>());
        this.subjects.get("Math101").put("Name", "Calculus 1");
        this.subjects.get("Math101").put("Teacher", "Miss. Noor");

        this.subjects.get("Math101").put("Level", "1");
        this.subjects.get("Math101").put("College", "Science");
        // Calculus 2
        this.subjects.put("Math102", new Hashtable<>());
        this.subjects.get("Math102").put("Name", "Calculus 2");
        this.subjects.get("Math102").put("Teacher", "Miss. Ameera");
        this.subjects.get("Math102").put("Level", "1");
        this.subjects.get("Math102").put("College", "Science");
        // Web Development
        this.subjects.put("ITCS333", new Hashtable<>());
        this.subjects.get("ITCS333").put("Name", "Web Development");
        this.subjects.get("ITCS333").put("Teacher", "T. Omar");
        this.subjects.get("ITCS333").put("Level", "3");
        this.subjects.get("ITCS333").put("College", "IT");
        this.subjects.get("ITCS333").put("NoTeams", "2");
        // Java Programming 1
        this.subjects.put("ITCS113", new Hashtable<>());
        this.subjects.get("ITCS113").put("Name", "Java Programming 1");
        this.subjects.get("ITCS113").put("Teacher", "T. Ahmed");
        this.subjects.get("ITCS113").put("Level", "1");
        this.subjects.get("ITCS113").put("College", "IT");
        this.subjects.get("ITCS113").put("NoTeams", "2");

        // Java Programming 2
        this.subjects.put("ITCS114", new Hashtable<>());
        this.subjects.get("ITCS114").put("Name", "Java Programming 2");
        this.subjects.get("ITCS114").put("Teacher", "T. Ali");
        this.subjects.get("ITCS114").put("Level", "1");
        this.subjects.get("ITCS114").put("College", "IT");
        this.subjects.get("ITCS114").put("NoTeams", "2");

        // Analysis and Design of Algorithms
        this.subjects.put("ITCS347", new Hashtable<>());
        this.subjects.get("ITCS347").put("Name", "Analysis and Design of Algorithms");
        this.subjects.get("ITCS347").put("Teacher", "T. Tasnim");
        this.subjects.get("ITCS347").put("Level", "3");
        this.subjects.get("ITCS347").put("College", "IT");
        this.subjects.get("ITCS347").put("NoTeams", "3");
        // Data Structures
        this.subjects.put("ITCS214", new Hashtable<>());
        this.subjects.get("ITCS214").put("Name", "Data Structures");
        this.subjects.get("ITCS214").put("Teacher", "T. Noor");
        this.subjects.get("ITCS214").put("Level", "2");
        this.subjects.get("ITCS214").put("College", "IT");
        this.subjects.get("ITCS214").put("NoTeams", "2");
        // Computer Architecture
        this.subjects.put("ITCS222", new Hashtable<>());
        this.subjects.get("ITCS222").put("Name", "Computer Architecture");
        this.subjects.get("ITCS222").put("Teacher", "T. Noor");
        this.subjects.get("ITCS222").put("Level", "2");
        this.subjects.get("ITCS222").put("College", "IT");
        this.subjects.get("ITCS222").put("NoTeams", "2");
        // Mobile Application Development
        this.subjects.put("ITCS444", new Hashtable<>());
        this.subjects.get("ITCS444").put("Name", "Mobile Application Development");
        this.subjects.get("ITCS444").put("Teacher", "T. Mohammad");
        this.subjects.get("ITCS444").put("Level", "4");
        this.subjects.get("ITCS444").put("College", "IT");
        this.subjects.get("ITCS444").put("NoTeams", "10");


    }
    public Hashtable<String, Hashtable<String, String>> getSubjects() {
        return this.subjects;
    }

}
