public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = this.rear = -1;
    }

    public void enqueue(int item) {
        if (this.isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (this.isEmpty()) {
                this.front = this.rear = 0;
            } else {
                this.rear = (this.rear + 1) % this.capacity;
            }
            this.arr[this.rear] = item;
            System.out.println(item + " enqueued to queue");
        }
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int item = this.arr[this.front];
            if (this.front == this.rear) {
                this.front = this.rear = -1;
            } else {
                this.front = (this.front + 1) % this.capacity;
            }
            return item;
        }
    }

    public int front() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return this.arr[this.front];
        }
    }

    public int rear() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return this.arr[this.rear];
        }
    }

    public boolean isEmpty() {
        return this.front == -1;
    }

    public boolean isFull() {
        return (this.rear + 1) % this.capacity == this.front;
    }
}
