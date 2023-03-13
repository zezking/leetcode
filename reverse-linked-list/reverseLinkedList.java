
import java.util.Objects;
import java.util.function.Predicate;

public class Main {
        static ListNode reverseList(ListNode head) {

                ListNode curr = head;
                ListNode prev = null;
                while (curr != null) {
                        ListNode nexttemp = curr.next;
                        curr.next=prev;
                        prev=curr;
                        curr=nexttemp;
                }

                return prev;
        }

        public static void main(String[] args) {
                ListNode list1 = ListNode.createList(1, 2, 3, 4, 5);
                ListNode list2 = ListNode.createList(1, 2);
                ListNode list3 = ListNode.createList(0);
                System.out.println(reverseList(list1).toString());
                System.out.println(reverseList(list2).toString());
                System.out.println(reverseList(list3).toString());
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
