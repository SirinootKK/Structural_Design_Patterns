package edu.parinya.softarchdesign.structural;
import java.util.HashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members = new HashSet<HealthcareServiceable>();
    public void addMember(HealthcareServiceable newMember) {
        members.add(newMember);
    }

    public void removeMember(HealthcareServiceable selectedMember) {
        members.remove(selectedMember);
    }

    public void service() {
        for (HealthcareServiceable member : members) {
            member.service();
        }
    }

    public double getPrice() {
        return members.stream().mapToDouble(member -> member.getPrice()).sum();
    }
}
