import java.util.arrList;
import java.util.List;
import java.util.Scanner;

public class ListsLevel1 {

    public static List<Integer> newList(int[] arr) {
        List<Integer> list = new newList<>();
        for (int value : arr) {
            list.add(value);
        }
        return list;
    }

    
    public static void rowList(List<Integer> list) {
        for (int value : list) {
            System.out.println(value);
        }
    }

    public static void printList(List<Integer> list, int i) {
        if (list.size()>i) {
            System.out.println(list.get(i));
            printList(list, i + 1);
        }
    }
    public static void fromEndtoStart(List<Integer> list, int i) {
        if (i >= 0) {
            System.out.println(list.get(i));
            fromEndtoStart(list, i - 1);
        }
    }

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

 
    public static void evenNum(List<Integer> list) {
        for (int value : list) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
    }

    public static boolean isNumInList(List<Integer> list, int num, int i) {
        if (i == list.size()) {
            return false;
        }
        if (list.get(i) == num) {
            return true;
        }
        return isNumInList(list, num, index + 1);
    }

    public static List<Integer> removeFirstNum(List<Integer> list, int num) {
        List<Integer> newList = new arr<>(list);
        newList.remove(Integer.valueOf(num));
        return newList;
    }

    public static List<Integer> remove(List<Integer> list, int i) {
        if (i < 0 || i >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        List<Integer> newList = new arrList<>(list);
        newList.remove(i);
        return newList;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> list = newList(array);
        System.out.println("Original list:");
        printList(list);

        List<Integer> userList = buildListFromInput();
        
        printList(List);

      

    }
}
