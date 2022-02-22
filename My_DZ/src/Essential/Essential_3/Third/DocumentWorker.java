package Essential.Essential_3.Third;

import java.util.Scanner;

public class DocumentWorker {

    void openDocument() {
        System.out.println("Документ открыт");
    }

    void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }

    void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the type of your edition, Pro, Expert or leave blank if basic");
        String edition = input.next().toLowerCase();

        switch (edition) {
            case "pro":
                ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                break;
            case "expert":
                ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                break;
            default:
                DocumentWorker documentWorker = new DocumentWorker();
                break;
        }
    }
}
