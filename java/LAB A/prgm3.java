import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class prgm3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arlist = new ArrayList<Integer>();
        int ch, val, sval, pos;

        do {
            System.out.println("*********MENU**********");
            System.out.println("1. ADD");
            System.out.println("2. SORT");
            System.out.println("3. REPLACE");
            System.out.println("4. REMOVE");
            System.out.println("5. DISPLAY");
            System.out.println("6. ADD_IN-BETWEEN");
            System.out.println("7. EXIT");
            System.out.println("Enter your choice: ");

            ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter a number ");
                    val = in.nextInt();
                    arlist.add(val);
                    System.out.println("Successfully Added a new element");
                    break;
                case 2:
                    System.out.println("Sorting ");
                    if (arlist.isEmpty())
                        System.out.println("arraylist is empty");
                    else {
                        Collections.sort(arlist);
                        System.out.println(arlist);
                        System.out.println("Successfully sorted");
                    }
                    break;
                case 3:
                    System.out.println("Enter a value to search");
                    sval = in.nextInt();
                    if (arlist.contains(sval)) {
                        System.out.println("Please enter a replacement value");
                        val = in.nextInt();
                        Collections.replaceAll(arlist, sval, val);
                    } else {
                        System.out.println("Please enter a valid number");
                    }
                    Collections.sort(arlist);
                    System.out.println("Successfully sorted");
                    break;
                case 4:
                    if (arlist.isEmpty()) {
                        System.out.println("No elements to remove");
                    } else {
                        System.out.println("Enter the element to remove");
                        val = in.nextInt();
                        if (arlist.contains(val)) {
                            arlist.remove((Integer) val);
                            System.out.println("Element Successfully removed");
                        } else {
                            System.out.println("No such Elements in arraylist");
                        }
                    }
                    break;
                case 5:
                    if (arlist.isEmpty()) {
                        System.out.println("No elements to display");
                    } else {
                        System.out.println(arlist);
                    }
                    break;
                case 6:
                    System.out.println("Please Enter the index position");
                    pos = in.nextInt();
                    if (pos < arlist.size()) {
                        System.out.println("Enter the value of the new element");
                        val = in.nextInt();
                        arlist.add(pos, val);
                        System.out.println("Element inserted successfully");
                    } else {
                        System.out.println("Position out of bounds");
                    }
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);

    }
}
