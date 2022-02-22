package Essential_3.First;

public class Pupil {

    public Pupil(){
        System.out.println("This pupil`s results are");
        study();
        read();
        write();
        relax();
    }

    void study(){
        System.out.println("Is able to study");
    }

    void read(){
        System.out.println("Is able to read");
    }

    void write(){
        System.out.println("Is able to write");
    }

    void relax(){
        System.out.println("Is able to relax");
    }
}
