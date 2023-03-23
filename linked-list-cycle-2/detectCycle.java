
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;

public class Main {
        static ListNode detectCycle(ListNode head) {
                // if the node return to the same index. There is a cycle
                Set<ListNode> nodes = new HashSet<ListNode>();
                int pos = 0;
                while (head != null) {
                        if (nodes.contains(head)) {
                                return head;
                        }
                        nodes.add(head);
                        head = head.next;
                }
                return null;
        }

        public static void main(String[] args) {
                ListNode list1 = ListNode.createList(1, 2, 3, 4, 5);
                ListNode list2 = ListNode.createList(1, 2);
                ListNode list3 = ListNode.createList(0);
                System.out.println(detectCycle(list1).toString());
                System.out.println(detectCycle(list2).toString());
                System.out.println(detectCycle(list3).toString());
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
