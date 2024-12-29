import java.util.ArrayList;
import java.util.List;
public class School {
    private List<Person> members;
    public School() {
        this.members = new ArrayList<>();
    }
    public void addMember(Person person) {
        members.add(person);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("\nSchool Members:");
        for (Person member : members) {
            sb.append(member.toString()).append("\n\n");
        }
        return sb.toString();
    }
}

