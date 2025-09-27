import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Iterator;

class Lab2 {
  public void linkedList() {
    LinkedList<String> progLanguages = new LinkedList<>();
    progLanguages.add("Java");
    progLanguages.add("Python");
    progLanguages.add("JavaScript");
    progLanguages.add("C++");
    progLanguages.remove("C++");
    progLanguages.add(2, "HTML");

    Iterator<String> iterator = progLanguages.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public void queue() {
    Queue<String> q = new LinkedList<>();
    q.add("Alice");
    q.add("Bob");
    q.add("Charlie");
    q.add("Diana");
    q.add("Ethan");

    System.out.println("Elements of queue: " + q);

    String removedElement = q.poll();
    System.out.println("Removed element: " + removedElement);

    System.out.println("Head of queue: " + q.peek());

    for (String element : q) {
      System.out.println(element);
    }
  }

  public void stack() {
    Stack<String> bookStack = new Stack<>();
    bookStack.push("Clean Code");
    bookStack.push("Design Patterns");
    bookStack.push("Pragmatic Programmer");

    System.out.println("Popped book: " + bookStack.pop());
    System.out.println("Top book: " + bookStack.peek());

    bookStack.push("Web DB Technologies");
    System.out.println("Top book after push: " + bookStack.peek());
    System.out.println("Position of 'Design Patterns': " + bookStack.search("Design Patterns"));
    System.out.println("Is stack empty? " + bookStack.empty());
    System.out.println("Books on the stack: " + bookStack);
  }
}
