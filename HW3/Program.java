public class Program {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(0);    
        linkedList.add(1);    
        linkedList.add(2);    
        linkedList.add(3);          
        linkedList.add(4);    
        linkedList.add(5);  

        System.out.println(linkedList);
        linkedList.revert();
        System.out.println();
        System.out.println(linkedList);



    }
}
