package queues;

class QueueArray {
    int front, rear, capacity;
    int[] arr;

    QueueArray(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    void enqueue(int x) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[++rear] = x;
        System.out.println(x + " enqueued");
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = arr[front++];
        System.out.println(val + " dequeued");
        return val;
    }

    int peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty() {
        return front > rear;
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Front element: " + q.peek());

        q.dequeue();
        q.dequeue();

        System.out.println("Is queue empty? " + q.isEmpty());
    }
}
