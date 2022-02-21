package Essential_3.First;

public class ClassRoom {

    ClassRoom(Pupil pupil) {
        System.out.println("There are one pupil in the classroom");
     }

    ClassRoom(Pupil pupil, Pupil secondPupil) {
        System.out.println("There are two pupils in the classroom");
    }

    ClassRoom(Pupil pupil, Pupil secondPupil, Pupil thirdPupil) {
        System.out.println("There are three pupils in the classroom");
    }

    ClassRoom(Pupil pupil, Pupil secondPupil, Pupil thirdPupil, Pupil fourthPupil) {
        System.out.println("There are four pupils in the classroom");
     }

    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        BadPupil badPupil = new BadPupil();
        ExcellentPupil excellentPupil = new ExcellentPupil();
        GoodPupil goodPupil = new GoodPupil();
        ClassRoom classRoom = new ClassRoom(pupil, excellentPupil, badPupil, goodPupil);
    }
}
