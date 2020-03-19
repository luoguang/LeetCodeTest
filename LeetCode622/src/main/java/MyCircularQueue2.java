public class MyCircularQueue2 {
    private int[] elementData;

    private int count;

    private int length;

    /**
     * 队头出，队尾进
     * 队头位置，队尾位置 (frontIndex + count) % length
     */
    private int frontIndex;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue2(int k) {
        elementData = new int[k];
        length = k;
        frontIndex = 0;
        count = 0;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        elementData[(frontIndex + count) % length] = value;
        count++;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        elementData[frontIndex] = 0;
        frontIndex = (frontIndex + 1) % length;
        count--;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return elementData[frontIndex];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return elementData[(frontIndex + count - 1) % length];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return elementData == null || count == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return elementData != null && elementData.length == count;
    }
}
