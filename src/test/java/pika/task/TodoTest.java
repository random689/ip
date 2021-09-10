package pika.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TodoTest {

    @Test
    public void test1() {
        assertEquals("[T][ ] Test Deadline", new Todo("Test Deadline").toString());
    }

    @Test
    public void test2() {
        assertEquals("T | 0 | Check Mate", new Todo("Check Mate").write());
    }

    @Test
    public void test3() {
        assertEquals("[T][X] Do 2103", new Todo("Do 2103").markAsDone());
    }
}
