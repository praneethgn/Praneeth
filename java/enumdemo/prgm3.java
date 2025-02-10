import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class prgm3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
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

            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter a number \n");
                    val = s.nextInt();
                    arlist.add(val);
                    System.out.println("Successfully Added a new element\n");
                    break;
                case 2:
                    System.out.println("Sorting \n");
                    if (arlist.isEmpty())
                        System.out.println("arraylist is empty\n");
                    else {
                        Collections.sort(arlist);
                        System.out.println(arlist);
                        System.out.println("Successfully sorted\n");
                    }
                    break;
                case 3:
                    System.out.println("Enter a value to search\n");
                    sval = s.nextInt();
                    if (arlist.contains(sval)) {
                        System.out.println("Please enter a replacement value\n");
                        val = s.nextInt();
                        Collections.replaceAll(arlist, sval, val);
                    } else {
                        System.out.println("Please enter a valid number\n");
                    }
                    Collections.sort(arlist);
                    System.out.println("Successfully sorted\n");
                    break;
                case 4:
                    if (arlist.isEmpty()) {
                        System.out.println("No elements to remove\n");
                    } else {
                        System.out.println("Enter the element to remove\n");
                        val = s.nextInt();
                        if (arlist.contains(val)) {
                            arlist.remove((Integer) val);
                            System.out.println("Element Successfully removed\n");
                        } else {
                            System.out.println("No such Elements in arraylist\n");
                        }
                    }
                    break;
                case 5:
                    if (arlist.isEmpty()) {
                        System.out.println("No elements to display\n");
                    } else {
                        System.out.println(arlist);
                    }
                    break;
                case 6:
                    System.out.println("Please Enter the index position\n");
                    pos = s.nextInt();
                    if (pos < arlist.size()) {
                        System.out.println("Enter the value of the new element\n");
                        val = s.nextInt();
                        arlist.add(pos, val);
                        System.out.println("Element inserted successfully\n");
                    } else {
                        System.out.println("Position out of bounds\n");
                    }
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Error:-Invalid choice\n");
            }
        } while (true);

    }
}
