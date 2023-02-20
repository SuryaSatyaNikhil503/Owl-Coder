package LinkedlistExps;

public class CallingMeth
{
    public static void main(String[] args)
    {
        LinkedList obj = new LinkedList();
        //Inserting Nodes to Linked List
        obj.insertAtFirst(1);
        obj.insertAtFirst(2);
        obj.insertAtFirst(3);
        obj.insertAtFirst(4);
        obj.insertAtFirst(5);
        //Inserting Node at last of LinkedList
        obj.insertAtLast(6);
        //Inserting at a particular position in Linked List
        obj.insertAtPosition(100 , 3);
        //obj.display();
        //Deleting First Element from List
        System.out.println(obj.deleteFirst());
        //Deleting Last Element from List
        System.out.println(obj.deleteLast());
        //Deleting at a particular Postion
        System.out.println(obj.deleteAtPosition(2));
        //Finding an Element
        obj.find(4);
        //Displaying Elements in Linked List
        obj.display();
        System.out.println();
        //Size of Linked List
        System.out.println("Size of Linked List :"+obj.size);
    }
}
