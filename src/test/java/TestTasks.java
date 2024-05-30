import com.mycompany.registrationp2.Task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTasks {

    @Test
    void testCheckTaskDescription() {
        assertTrue(Task.checkTaskDescription("This is a valid task description"));
        assertFalse(Task.checkTaskDescription("This is an invalid task description because it exceeds the fifty character limit"));
    }

    @Test
    void testCreateTaskID() {
        String taskID = Task.createTaskID("TestTask", 1, "JohnDoe");
        assertEquals("TE:1:DOE", taskID);
    }

    @Test
    void testPrintTaskDetails() {
        Task task = new Task();
        String taskDetails = task.printTaskDetails("To do", "kretzmann", "william", 1, "Task description", 19, "TestTask");
        assertTrue(taskDetails.contains("Task description"));
        assertTrue(taskDetails.contains("william kretzmann"));
        assertTrue(taskDetails.contains("Task duration: 19"));
    }

    @Test
    void testReturnTotalHours() {
        int total = Task.returnTotalHours(10, 9);
        assertEquals(19, total);
    }
}
