package Data_Structures.Linear.HashTable;

public class MainHashTable {
    public static void main(String[] args) {
        Employee mavis = new Employee("Mavis", "Amoah", 45);
        Employee irene = new Employee("Irene", "Baidoo", 30);
        Employee evelyn = new Employee("Evelyn", "Amankwah", 60);
        Employee joselyn = new Employee("Joselyn", "Simon", 45);

        SimpleHashTable hashtable = new SimpleHashTable();
        hashtable.put("Amoah", mavis);
        hashtable.put("Baidoo", irene);
        hashtable.put("Amankwah", evelyn);
        hashtable.put("Simon", joselyn);

        hashtable.printHashTable();
    }
}
