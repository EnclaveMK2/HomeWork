package Essential_3.First;

public class BadPupil extends Pupil{

    public BadPupil(){
        System.out.println("This pupil`s results are");
        study();
        read();
        write();
        relax();
    }

    void study(){
        System.out.println("Study is 3 out of 5");
    }

    void read(){
        System.out.println("Reading  is 3 out of 5");
    }

    void write(){
        System.out.println("Writing  is 3 out of 5");
    }

    void relax(){
        System.out.println("Relax is 5 out of 5");
    }
}
