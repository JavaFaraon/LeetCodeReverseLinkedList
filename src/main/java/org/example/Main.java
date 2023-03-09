package org.example;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        Solution solution = new Solution();
        Solution2 solution2 = new Solution2();
        ListNode list1 = new ListNode(1);
        //ListNode list2 = new ListNode(1);

        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);


        list1.printList();

        ListNode reverseList = solution2.reverseList(list1);
        System.out.println("Result: ");
        reverseList.printList();
    }
}