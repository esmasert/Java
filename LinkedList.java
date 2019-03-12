class LinkedList
{
    Node head; // head of list

    class Node  //linkedlist node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


    public void shift() {

        Node front=head;

        if (front == null)
            return;

        Node oddList, even, odd;

        even = odd = front;

        oddList = front.next;

        while (even.next != null) { //arranging the LinkedList as variable's odd or even positions

            odd.next = even.next;
            odd = even.next;
            even.next = odd.next;

            if(odd.next != null) {
                even = odd.next;
                odd.next = null;
            }

            else {
                odd.next = null;
                break;
            }
        }

        if(oddList != null) {
            even.next = oddList;
        }

    }



    public void push(int new_data)  //inserting a new Node at front of the list
    {

        Node new_node = new Node(new_data); //allocating new Node

        new_node.next = head;  //making next of new Node as head

        head = new_node; //moving the head to point to new Node
    }

    void printList()  //printing list
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String args[])
    {
        LinkedList list = new LinkedList(); //creating list

        list.push(7);
        list.push(5);
        list.push(28);
        list.push(2);
        list.push(8);
        list.push(3);
        list.push(29);
        list.push(17);
        list.push(4);

        System.out.println("Linked List before shifting ");
        list.printList();


        list.shift();

        System.out.println("Linked List shifting ");
        list.printList();
    }


}