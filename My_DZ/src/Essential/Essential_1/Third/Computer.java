package Essential_1.Third;

import javax.management.ObjectName;

public class Computer {
    static Computer[] computers = new Computer[5];

    public static void main(String[] args) {
//       i have no idea how to add already created objects to an array
        Computer computer = new Computer();
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();
        Computer computer4 = new Computer();
        Computer computer5 = new Computer();
        System.out.println();

//      workaround
        for (int i = 0; i < computers.length; i++)
            computers[i] = new Computer();
    }
}
