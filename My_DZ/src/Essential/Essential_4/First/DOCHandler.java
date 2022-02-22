package Essential.Essential_4.First;

public class DOCHandler extends AbstractHandler{

    void open(){
        System.out.println("This method opens the DOC file");
    }

    void create(){
        System.out.println("This method creates the DOC file");
    }

    void change(){
        System.out.println("This method changes the DOC file");
    }

    void save(){
        System.out.println("This method saves the DOC file");
    }
}
