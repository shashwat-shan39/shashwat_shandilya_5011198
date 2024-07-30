// Class representing a task
class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Task ID: " + taskId + ", Name: " + taskName + ", Status: " + status;
    }
}

// Class representing the singly linked list for managing tasks
class TaskList {
    private Task head;

    public TaskList() {
        this.head = null;
    }

    // Method to add a task at the end of the list
    public void addTask(int taskId, String taskName, String status) {
        Task newTask = new Task(taskId, taskName, status);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    // Method to search for a task by ID
    public Task searchTask(int taskId) {
        Task current = head;
        while (current != null) {
            if (current.taskId == taskId) {
                return current;
            }
            current = current.next;
        }
        return null; // Task not found
    }

    // Method to traverse and print all tasks
    public void traverseTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    // Method to delete a task by ID
    public boolean deleteTask(int taskId) {
        if (head == null) return false; // List is empty

        // If the head needs to be removed
        if (head.taskId == taskId) {
            head = head.next;
            return true;
        }

        Task current = head;
        while (current.next != null && current.next.taskId != taskId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            return true;
        }

        return false; // Task not found
    }
}

// Main class to test the Task Management System
public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        // Adding tasks
        taskList.addTask(1, "Complete project documentation", "Pending");
        taskList.addTask(2, "Review code", "In Progress");
        taskList.addTask(3, "Deploy to production", "Pending");

        // Traversing and displaying tasks
        System.out.println("All tasks:");
        taskList.traverseTasks();

        // Searching for a task
        System.out.println("\nSearching for Task ID 2:");
        Task foundTask = taskList.searchTask(2);
        if (foundTask != null) {
            System.out.println("Found: " + foundTask);
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        System.out.println("\nDeleting Task ID 1:");
        boolean isDeleted = taskList.deleteTask(1);
        if (isDeleted) {
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task not found.");
        }

        // Traversing and displaying tasks after deletion
        System.out.println("\nAll tasks after deletion:");
        taskList.traverseTasks();
    }
}
