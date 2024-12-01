import java.util.arrList;
import java.util.List;
import java.util.Scanner;

public class ListsLevel1 {

    // פעולה שמקבלת מערך ומחזירה רשימה עם הערכים שלו
    public static List<Integer> newList(int[] arr) {
        List<Integer> list = new newList<>();
        for (int value : arr) {
            list.add(value);
        }
        return list;
    }

    // פעולה שמדפיסה רשימה נתונה בשורות נפרדות
    public static void rowList(List<Integer> list) {
        for (int value : list) {
            System.out.println(value);
        }
    }

    // פעולה רקורסיבית שמדפיסה רשימה
    public static void printList(List<Integer> list, int i) {
        if (list.size()>i) {
            System.out.println(list.get(i));
            printList(list, i + 1);
        }
    }

    // פעולה רקורסיבית שמדפיסה רשימה מהסוף להתחלה
    public static void fromEndtoStart(List<Integer> list, int i) {
        if (i >= 0) {
            System.out.println(list.get(i));
            fromEndtoStart(list, i - 1);
        }
    }

    // פעולה שקולטת מהמשתמש מספרים חיוביים עד קליטת 1-
    public static List<Integer> positiveNumList() {
        List<Integer> list = new arr<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive numbers (end with -1):");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            list.add(num);
        }
        return list;
    }

    // פעולה שמדפיסה רק את המספרים הזוגיים ברשימה נתונה
    public static void evenNum(List<Integer> list) {
        for (int value : list) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
    }

    // פעולה שבודקת אם מספר נתון מופיע ברשימה (רקורסית זנב)
    public static boolean containsNumber(List<Integer> list, int num, int index) {
        if (index == list.size()) {
            return false;
        }
        if (list.get(index) == num) {
            return true;
        }
        return containsNumber(list, num, index + 1);
    }

    // פעולה שמקבלת מספר ורשימה, מוחקת את החוליה הראשונה עם המספר
    public static List<Integer> removeFirstNum(List<Integer> list, int num) {
        List<Integer> newList = new arr<>(list);
        newList.remove(Integer.valueOf(num));
        return newList;
    }

    // פעולה שמקבלת רשימה ומספר x, מוחקת את החוליה במיקום x
    public static List<Integer> removeByIndex(List<Integer> list, int i) {
        if (i < 0 || i >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        List<Integer> newList = new ArrayList<>(list);
        newList.remove(index);
        return newList;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> list = arrayToList(array);
        System.out.println("Original list:");
        printList(list);

       
        printListRecursively(list, 0);

        
        printListReverseRecursively(list, list.size() - 1);

        List<Integer> userList = buildListFromInput();
        
        printList(userList);

      
        printEvenNumbers(list);

        int numberToCheck = 5;
        System.out.println(  containsNumber(list, numberToCheck, 0));

        System.out.println( numberToCheck + ":");
        printList(removeFirstOccurrence(list, numberToCheck));

        int indexToRemove = 2;
     
        printList(removeByIndex(list, indexToRemove));
    }
}
