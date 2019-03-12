package main;

public class Stack {
    private static class Node
    {
        private int data;
        private Node next;
        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
    private Node top = null;
    private int size = 0;
    public void push(int data)
    {
        Node newNode = new Node(data, this.top);
        this.top = newNode;
        this.size++;
    }
    public int pop()
    {
        int response = -1;
        if(this.top!=null)
        {
            response=this.top.getData();
            this.top=this.top.getNext();
            this.size--;
        }
        else
        {
            System.out.println("Stack is Empty");
        }
        return response;
    }

    public static void main(String[] args) {

    }



}
