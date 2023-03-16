import java.util.Objects;
import java.util.function.Predicate;

public class Main {
        static void printLinkedListInReverse(ImmutableListNode head) {
                // assume the linklist is immutable and we cannot assign node value

                // base case
                if (head == null) {
                        return;
                }

                printLinkedListInReverse(head.next);

                head.printValue();
        }

        public static void main(String[] args) {
                ImmutableListNode list1 = ImmutableListNode.createList(1, 2, 3, 4, 5);
                ImmutableListNode list2 = ImmutableListNode.createList(1, 2);
                // ImmutableListNode list3 = ImmutableListNode.createList(0);
                printLinkedListInReverse(list1);
                printLinkedListInReverse(list2);
                // printLinkedListInReverse(list3);
        };
}

public class ImmutableListNode {
        int val;
        ImmutableListNode next;

        ImmutableListNode(int x) {
                val = x;
        }

        public static ImmutableListNode createList(int... values) {
                ImmutableListNode head = new ImmutableListNode(values[0]);
                ImmutableListNode prev = head;
                for (int i = 1; i < values.length; i++) {
                        prev.next = new ImmutableListNode(values[i]);
                        prev = prev.next;
                }
                return head;
        }

        public ImmutableListNode filter(Predicate<ImmutableListNode> f) {

                ImmutableListNode node = this;
                while (node != null && !f.test(node)) {
                        node = node.next;
                }
                return node;
        }

        public void printValue() {

                System.out.print(val);
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
                ImmutableListNode listNode = (ImmutableListNode) o;
                return val == listNode.val &&
                                Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
                return Objects.hash(val, next);
        }
}
