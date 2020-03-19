import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
    @Test
    public void testMyCircularQueue() {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3

        boolean b1 = circularQueue.enQueue(1);  // 返回 true
        Assert.assertTrue(b1);

        boolean b2 = circularQueue.enQueue(2);  // 返回 true
        Assert.assertTrue(b2);

        boolean b3 = circularQueue.enQueue(3);  // 返回 true
        Assert.assertTrue(b3);

        boolean b4 = circularQueue.enQueue(4);  // 返回 false，队列已满
        Assert.assertFalse(b4);

        int i1 = circularQueue.Rear();  // 返回 3
        Assert.assertEquals(i1, 3);

        boolean b5 = circularQueue.isFull();  // 返回 true
        Assert.assertTrue(b5);

        boolean b6 = circularQueue.deQueue();  // 返回 true
        Assert.assertTrue(b6);

        boolean b7 = circularQueue.enQueue(4);  // 返回 true
        Assert.assertTrue(b7);

        int i2 = circularQueue.Rear();  // 返回 4
        Assert.assertEquals(i2, 4);
    }

    @Test
    public void testMyCircularQueue2() {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3

        boolean b1 = circularQueue.enQueue(1);  // 返回 true
        Assert.assertTrue(b1);

        boolean b2 = circularQueue.enQueue(2);  // 返回 true
        Assert.assertTrue(b2);

        boolean b3 = circularQueue.enQueue(3);  // 返回 true
        Assert.assertTrue(b3);

        boolean b4 = circularQueue.enQueue(4);  // 返回 false，队列已满
        Assert.assertFalse(b4);

        int i1 = circularQueue.Rear();  // 返回 3
        Assert.assertEquals(i1, 3);

        boolean b5 = circularQueue.isFull();  // 返回 true
        Assert.assertTrue(b5);

        boolean b6 = circularQueue.deQueue();  // 返回 true
        Assert.assertTrue(b6);

        boolean b7 = circularQueue.enQueue(4);  // 返回 true
        Assert.assertTrue(b7);

        int i2 = circularQueue.Rear();  // 返回 4
        Assert.assertEquals(i2, 4);
    }

    @Test
    public void testMyCircularQueue3() {
        MyCircularQueue2 circularQueue = new MyCircularQueue2(3); // 设置长度为 3

        boolean b1 = circularQueue.enQueue(2);  // 返回 true
        Assert.assertTrue(b1);

        int i1 = circularQueue.Rear();  // 返回 true
        Assert.assertEquals(i1, 2);

        int i2 = circularQueue.Front();  // 返回 true
        Assert.assertEquals(i2, 2);

        boolean b2 = circularQueue.deQueue();  // 返回 false，队列已满
        Assert.assertTrue(b2);

        int i3 = circularQueue.Front();  // 返回 3
        Assert.assertEquals(i3, -1);

        boolean b20 = circularQueue.deQueue();  // 返回 false，队列已满
        Assert.assertFalse(b20);

        int i30 = circularQueue.Front();  // 返回 3
        Assert.assertEquals(i30, -1);

        boolean b4 = circularQueue.enQueue(4);  // 返回 true
        Assert.assertTrue(b4);

        boolean b5 = circularQueue.enQueue(2);  // 返回 true
        Assert.assertTrue(b5);

        boolean b6 = circularQueue.enQueue(2);  // 返回 true
        Assert.assertTrue(b6);

        boolean b7 = circularQueue.enQueue(3);  // 返回 4
        Assert.assertFalse(b7);
    }

    @Test
    public void testMyCircularQueue4() {
        MyCircularQueue2 circularQueue = new MyCircularQueue2(3); // 设置长度为 3

        boolean b1 = circularQueue.enQueue(1);  // 返回 true
        Assert.assertTrue(b1);

        boolean b2 = circularQueue.enQueue(2);  // 返回 true
        Assert.assertTrue(b2);

        boolean b3 = circularQueue.enQueue(3);  // 返回 true
        Assert.assertTrue(b3);

        boolean b4 = circularQueue.enQueue(4);  // 返回 true
        Assert.assertFalse(b4);

        int i1 = circularQueue.Rear();
        Assert.assertEquals(i1, 3);

        boolean b5 = circularQueue.isFull();
        Assert.assertTrue(b5);

        boolean b6 = circularQueue.deQueue();
        Assert.assertTrue(b6);

        boolean b7 = circularQueue.enQueue(4);
        Assert.assertTrue(b7);

        int i2 = circularQueue.Rear();
        Assert.assertEquals(i2, 4);
    }
}
