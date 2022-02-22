package Essential.Essential_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose type of file XML, DOC or TXT");
        String typeOfFIle = input.next().toLowerCase();

        switch (typeOfFIle){
            case "xml":
                XMLHandler xmlHandler = new XMLHandler();
                xmlHandler.save();
                xmlHandler.change();
                xmlHandler.open();
                xmlHandler.create();
                break;
            case "txt":
                TXTHandler txtHandler = new TXTHandler();
                txtHandler.save();
                txtHandler.change();
                txtHandler.open();
                txtHandler.create();
                break;
            case "doc":
                DOCHandler docHandler = new DOCHandler();
                docHandler.save();
                docHandler.change();
                docHandler.open();
                docHandler.create();
                break;
            default:
                System.out.println("Entered type of file is incorrect");
        }
    }
}
