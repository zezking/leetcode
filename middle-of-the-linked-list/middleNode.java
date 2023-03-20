
import java.util.Objects;
import java.util.function.Predicate;

public class Main {
        static ListNode middleNode(ListNode head) {
                int nodeListLength = 0;
                ListNode curr = head;
                ListNode result = head;
                while (curr != null) {
                        curr = curr.next;
                        nodeListLength++;

                }

                for (int i = 0; i < nodeListLength / 2; i++) {
                        result = result.next;
                }
                return result;

        }

        // Solution 2 put every node into an array and the middle index will be the
        // middle node
        static ListNode middleNode2(ListNode head) {

                ListNode[] array = new ListNode[100];

                int t = 0;

                while (head != null) {
                        array[t++] = head;
                        head = head.next;
                }

                return array[t / 2];

        }

        public static void main(String[] args) {
                ListNode list1 = ListNode.createList(1, 2, 3, 4, 5);
                ListNode list2 = ListNode.createList(1, 2, 3, 4, 5, 6);
                System.out.println(middleNode(list1).toString());
                System.out.println(middleNode(list2).toString());
                System.out.println(middleNode2(list1).toString());
                System.out.println(middleNode2(list2).toString());

        };
}

public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
                val = x;
        }

        public static ListNode createList(int... values) {
                ListNode head = new ListNode(values[0]);
                ListNode prev = head;
                for (int i = 1; i < values.length; i++) {
                        prev.next = new ListNode(values[i]);
                        prev = prev.next;
                }
                return head;
        }

        public ListNode filter(Predicate<ListNode> f) {

                ListNode node = this;
                while (node != null && !f.test(node)) {
                        node = node.next;
                }
                return node;
        }

        @Override
        public String toString() {

                return val + "->" + next;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o)
                        return true;
                if (o == null || getClass() != o.getClass())
                        return false;
                ListNode listNode = (ListNode) o;
                return val == listNode.val &&
                                Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
                return Objects.hash(val, next);
        }
}
