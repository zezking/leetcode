// Time o(n)
// Space o(n)

class ListNode {
    val: number
    next: ListNode | null
    constructor(val = 0, next = null) {
        this.val = val;
        this.next = next;
    }
}

function mergeTwoLists(list1, list2) {
    const dummyNode = new ListNode()
    let node: ListNode = dummyNode

    while (list1 && list2) {
        if (list1.val < list2.val) {
            node.next = list1
            list1 = list1.next
        } else {
            node.next = list2
            list2 = list2.next
        }
        node = node.next as ListNode
    }
    if (list1) {
        node.next = list1
    } else {
        node.next = list2
    }
    return dummyNode.next
}