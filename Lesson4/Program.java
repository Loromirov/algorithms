/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>(4);
        
        String res = hashMap.put("+79005554433", "Andrey");
        res = hashMap.put("+79005554455", "Ivan");
        res = hashMap.put("+79005555544", "Sergey");
        res = hashMap.put("+79005551122", "Roman");
        res = hashMap.put("+79005554456", "Anna");
        res = hashMap.put("+79005555546", "Nemo");
        res = hashMap.put("+79005551126", "Fedor");

        res = hashMap.get("+79005555546");

        hashMap.remove("+79005551122");

        for (HashMap.Entity element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }
    }
    
}