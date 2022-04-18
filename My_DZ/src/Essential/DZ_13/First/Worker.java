package Essential.DZ_13.First;

public class Worker implements Comparable<Worker> {
    String surname;
    String initials;
    String profession;
    int startYear;

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
    public int compareTo(Worker o) {
//        if (this.startYear == o.startYear) {
//            return 0;
//        } else if (this.startYear > o.startYear) {
//            return 1;
//        } else {
//            return -1;
//        }

//        return this.startYear - o.startYear;

//        return this.profession.compareTo(o.profession);

        int result = this.surname.compareTo(o.surname);
        if (result == 0) {
            result = this.startYear - o.startYear;
        }
        return result;
    }
}
