package LinkedlistExps;

public class LinkedList
{
    private Node head;
    private Node tail;
    public int size;
    LinkedList()
    {
        this.size = 0;
    }

    void insertAtFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size+=1;
    }

    void insertAtLast(int val)
    {
        if(tail == null)
        {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    void insertAtPosition(int val , int pos)
    {
        if(pos == 0)
        {
            insertAtFirst(val);
            return;
        }
        if(pos == size)
        {
            insertAtLast(val);
            return;
        }
        Node temp = head;
        for(int i=1 ; i<pos ; i++)
        {
            temp = temp.next;
        }

        Node node = new Node(val , temp.next);
        temp.next = node;
        size += 1;
    }

    Node get(int index)
    {
        Node node = head;
        for(int i=0 ; i<index ; i++)
        {
            node = node.next;
        }
        return node;
    }

    int deleteFirst()
    {
        if(head == null)
        {
            tail = null;
        }
        int value = head.val;
        head = head.next;
        size -= 1;
        return value;
    }

    int deleteLast() {
        if (size <= 1)
        {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.val;
        tail = secondLast;
        tail.next = null;
        size -= 1;
        return value;
    }

    int deleteAtPosition(int index)
    {
        if(index == 0)
        {
            return deleteFirst();
        }
        if(index == size - 1)
        {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int value = prev.next.val;
        prev.next = prev.next.next;
        size -= 1;
        return value;
    }

    Node find(int value)
    {
        Node node = head;
        while(node != null)
        {
            if(node.val == value)
            {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    private class Node
    {
        private int val;
        private Node next;
        Node(int val)
        {
            this.val = val;
        }
        Node(int val , Node next)
        {
            this.val = val;
            this.next = next;
        }
    }
}
