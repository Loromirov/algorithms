public class LinkedList {
    Node head;
    Node tail;

    public class Node{
        int value;
        Node next;
        Node previous;
    }
    // Добавление новой ноды в конец двусвязного списка
    public void add(int value){
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;

        }
        else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    // Разворот двусвязного списка
    public void revert(){
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if(next == null){
                head = currentNode;
            }
            currentNode = next;

        }
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null) {
            stringBuilder.append(node.value);
            stringBuilder.append("\n");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}