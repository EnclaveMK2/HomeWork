package Essential.DZ_3.First;

public class GoodPupil extends Pupil{

    public GoodPupil(){
        System.out.println("This pupil`s results are");
        study();
        read();
        write();
        relax();
    }

    void study(){
        System.out.println("Study is 4 out of 5");
    }

    void read(){
        System.out.println("Reading  is 4 out of 5");
    }

    void write(){
        System.out.println("Writing  is 4 out of 5");
    }

    void relax(){
        System.out.println("Relax is 4 out of 5");
    }
}
