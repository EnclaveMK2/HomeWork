package Essential.DZ_13.First;

public class Worker implements Comparable {
    String surname;
    String initials;
    String profession;
    String startYear;

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "surname='" + surname + '\'' +
                ", initials='" + initials + '\'' +
                ", profession='" + profession + '\'' +
                ", startYear='" + startYear + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
