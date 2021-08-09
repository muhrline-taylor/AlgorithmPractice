import java.io.*;

public class SinglyLinkedList {

    // CONSTRUCTOR =============== //

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;


    // METHODS ================= //

    public void addToBack(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void addToFront(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void prependVal(int newValue, int valueToFind){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        if(head.data == valueToFind){
            this.addToFront(newValue);
        }
        Node runner = head;
        Node runner2 = runner.next;
        while(runner2.data != valueToFind && runner2 != null){
            runner = runner.next;
            runner2 = runner2.next;
        }
        if(runner2 == null){
            System.out.println("Value was not found in the list!");
            return;
        }
        if(runner2.data == valueToFind){
            Node newNode = new Node(newValue);
            runner.next = newNode;
            newNode.next = runner2;
            System.out.println("Successfully prepended value!");
        }
    }

    public void appendVal(int newValue, int valueToFind){
        if(this.isEmpty() == true){
            return;
        }
        if(head.data == valueToFind){
            if(head.next != null){
                Node newNode = new Node(newValue);
                Node placeholder = head.next;
                head.next = newNode;
                newNode.next = placeholder;
            } else {
                this.addToBack(newValue);
            }
        }
        Node runner = head;
        while(runner != null){
            if(runner.data == valueToFind){
                if(runner.next == null){
                    this.addToBack(newValue);
                    return;
                }
                Node runner2 = runner.next;
                Node newNode = new Node(newValue);
                runner.next = newNode;
                newNode.next = runner2;
                return;
            } else {
                runner = runner.next;
            }
        }
    }

    public void removeFront(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        } else if(head.next == null){
            head = null;
            tail = null;
            return;
        } else {
            head = head.next;
        }
    }

    public void removeBack(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        } else if(head.next == null){
            head = null;
            tail = null;
        } else {
            Node runner = head;
            Node runner2 = head.next;
            while(runner2.next != null){
                runner2 = runner2.next;
                runner = runner.next;
            }
            runner.next = null;
            tail = runner;
        }
    }

    public boolean contains(int value){
        if(head == null){
            System.out.println("List is empty!");
            return false;
        }
        Node runner = head;
        while(runner != null){
            if(runner.data == value){
                System.out.println(value + " is present in list");
                return true;
            }
            runner = runner.next;
        }
        System.out.println(value + " is not present in list");
        return false;
    }

    public boolean isEmpty(){
        if(head == null){
            System.out.println("List is empty!");
            return true;
        } else {
            return false;
        }
    }

    public void getFront(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        System.out.println(head.data);
    }

    public void getBack(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        Node runner = head;
        while(runner.next != null){
            runner = runner.next;
        }
        System.out.println(runner.data);
    }

    public int getLength(){
        if(head == null){
            System.out.println("Length of list is 0");
            return 0;
        }
        Node runner = head;
        int counter = 0;
        while(runner != null){
            counter ++;
            runner = runner.next;
        }
        System.out.println("Length of list is " + counter);
        return counter;
    }

    public void getAvg(){
        if(head == null){
            System.out.println("Cannot get the average of an empty list!");
            return;
        }
        Node runner = head;
        int sum = 0;
        int counter = 0;
        while(runner != null){
            sum += runner.data;
            counter ++;
            runner = runner.next;
        }
        System.out.println("Sum: " + sum);
        int length = this.getLength();
        float avg = (float) sum / (float) length;
        System.out.println("Sum(" + sum + ") / Length(" + length + ") = Average(" + avg +")");
    }

    public void displayValues(){
        Node runner = head;

        if(runner == null){
            System.out.println("List is empty!");
            return;
        }
        System.out.println("List values: ");
        while(runner != null){
            System.out.println(runner.data);
            runner = runner.next;
        }
    }




    public static void main(String[] args){

        SinglyLinkedList sll = new SinglyLinkedList();

//        sll.addToFront(10);
//        sll.addToBack(20);
//        sll.addToBack(30);
//        sll.removeFront();
//
//        sll.removeBack();
//
//        sll.displayValues();



//        sll.contains(50);
//        sll.contains(51);
//

//
//        sll.getFront();
//        sll.getBack();
//
//        sll.getLength();
//
//        sll.getAvg();

        sll.addToBack(40);
        sll.addToBack(52);
        sll.addToBack(60);
        sll.displayValues();

        sll.prependVal(50, 52);
        sll.appendVal(65, 60);

        sll.displayValues();

    }

}



