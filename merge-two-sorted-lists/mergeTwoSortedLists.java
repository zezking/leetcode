import java.util.Objects;
import java.util.function.Predicate;

public class Main {
        static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
                if (list1 == null) {
                        return list2;
                }
                if (list2 == null) {
                        return list1;
                }
                if (list1.val < list2.val) {
                        list1.next = mergeTwoLists(list1.next, list2);
                        return list1;
                } else {
                        list2.next = mergeTwoLists(list1, list2.next);
                        return list2;
                }
        }

        public static void main(String[] args) {
                ListNode list1 = ListNode.createList(1, 2, 4);
                ListNode list2 = ListNode.createList(1, 3, 4);
                System.out.print(mergeTwoLists(list1, list2).toString());
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
