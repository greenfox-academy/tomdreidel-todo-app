package todoapp;

public class Main {

  public static void main(String[] args) {

    Todo todo = new Todo();

    if (args.length == 0) {
      todo.listTodo();
    } else if (args.length > 0) {
      if (args[0].equals("-l")) {
        todo.listTodo();
      } else if (args[0].equals("-a")) {
        todo.addTodo(args[1]);
        todo.listTodo();
      } else if (args[0].equals("-c")) {
        todo.toggleCompletion(args[1]);
        todo.listTodo();
      } else if (args[0].equals("-r")) {
        todo.removeTodo(args[1]);
        todo.listTodo();
      } else if (args[0].equals("-h") || args[0].equals("help") || args[0].equals("?")) {
        System.out.println(todo.usage());
      } else if (args[0].equals("-larch")) {
        todo.montyTodo();
      }
      todo.save();
    }
  }
}