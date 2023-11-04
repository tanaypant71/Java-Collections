//class LinkedList {
//    Node head;
//    public void push(int new_data) {
//        Node new_node = new Node(new_data);
//        new_node.next = head;
//        head = new_node;
//    }
//
//    public void insertAfter(Node prev_node, int new_data)
//    {
//        /* 1. Check if the given Node is null */
//        if (prev_node == null) {
//            System.out.println(
//                    "The given previous node cannot be null");
//            return;
//        }
//	/* 2. Allocate the Node &
//	3. Put in the data*/
//        Node new_node = new Node(new_data);
//        /* 4. Make next of new Node as next of prev_node */
//        new_node.next = prev_node.next;
//        /* 5. make next of prev_node as new_node */
//        prev_node.next = new_node;
//    }
//}
//class Node {
//    int data;
//    Node next;
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//
//public class ex {
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//
//        list.push(5);
//        list.push(7);
//        list.push(2);
//
//        System.out.println("Linked List after pushing elements:");
//        Node current = list.head;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//
//            Node prevNode = list.head.next;
//            list.insertAfter(prevNode,6);
//
//            Node prevNod = list.head.next;
//            list.insertAfter(prevNod,4);
//        }
//    }
//}


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    

    public boolean hasCycle() {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false; // No cycle detected
    }
}

public class ex {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(3);
        list.push(7);
        list.push(1);

        // Create a cycle for demonstration
        list.head.next.next.next = list.head;

        boolean hasCycle = list.hasCycle();
        System.out.println("Linked List has a cycle: " + hasCycle);
    }
}
