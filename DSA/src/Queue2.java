public class Queue2 {
    private Node front;
    private Node rear;

    public Queue2() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println(item + " enqueued to queue");
    }

    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int item = this.front.data;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }
        return item;
    }

    public int front() {
        if (this.front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return this.front.data;
    }

    public int rear() {
        if (this.rear == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return this.rear.data;
    }

    public boolean isEmpty() {
        return this.front == null;
    }
}
