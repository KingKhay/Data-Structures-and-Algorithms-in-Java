package Data_Structures.Linear.HashTable;

public class SimpleHashTable {
    private StoredEmployee[] hashtable;

    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee) {
        int index = hashKey(key);
        if (isOccupied(index)) {
            int stopIndex = index;
            if (index == hashtable.length - 1) {
                index = 0;
            } else {
                index++;
            }
            while (index != stopIndex && isOccupied(index)) {
                index = (index + 1) % hashtable.length;
            }
        }
        if (isOccupied(index)) {
            System.out.println("Sorry this position is occupied " + index);
        } else {
            hashtable[index] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int index = findKey(key);
        if (index == -1) {
            System.out.println("No such Element");
            return null;
        } else {
            return hashtable[index].employee;
        }
    }

    public Employee remove(String key) {
        int index = findKey(key);
        Employee employee = hashtable[index].employee;
        hashtable[index] = null;
        return employee;
    }

    private boolean isOccupied(int index) {
        return hashtable[index] != null;
    }

    private int findKey(String key) {
        int index = hashKey(key);
        if (isOccupied(index) && hashtable[index].key.equals(key)) {
            return index;
        } else {
            int stopIndex = index;
            if (index == hashtable.length - 1) {
                index = 0;
            } else {
                index++;
            }
            while (isOccupied(index) && !hashtable[index].key.equals(key) && index != stopIndex) {
                index = (index + 1) % hashtable.length;
            }
            if (isOccupied(index) && hashtable[index].key.equals(key)) {
                return index;
            } else {
                return -1;
            }
        }
    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
            } else {
                System.out.println("Position " + i + " " + hashtable[i].employee);
            }

        }
    }
}
