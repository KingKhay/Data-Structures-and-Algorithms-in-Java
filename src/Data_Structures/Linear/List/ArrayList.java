package Data_Structures.Linear.List;

import java.util.List;

public class ArrayList {
    /*
    * An ArrayList is good for random access if you have the index
    * It is good for iterating over items in a list
    *
    * Bad for inserting into specific positions in the list other than the end
    * Bad for deletions and removals since elements have to be shifted to fill the gaps
    *
    * Methods
    * add, addAll, clear, get, isEmpty, set, seze, remove, contains, indexOf
    * */

    public static void main(String[] args) {
        List<String> names = new java.util.ArrayList<>();

        //The add method//
        names.add("King");
        names.add("Khay");
        names.add("Rollie");
        names.add("Raven");
        names.forEach(System.out::println);
        System.out.println();
        //add method with a specific index//
        //replacing the element at index 2 with "John"...This pushes Rollie and Raven to the next indexes//
        names.add(2,"john");
        names.forEach(System.out::println);
        System.out.println();

        //get = this returns the element at the specified index//
        //This returns "Khay"//
        System.out.println(names.get(1));
        System.out.println();

        //IsEmpty = returns true if the list is empty//
        //This returns false since there are elements in the list//
        System.out.println(names.isEmpty());
        System.out.println();

        //set = replaces the element at the specified index//
        //This replaces Rollie with Kojo//
        names.set(3,"Kojo");
        names.forEach(System.out::println);
        System.out.println();

        //remove = removes the element at the specified index//
        //This removes kojo from the list//
        names.remove(3);

        //This remove method also removes an element using the object itself//
        //This removes Raven from the list//
        names.remove("Raven");
        names.forEach(System.out::println);
        System.out.println();

        //contains = returns true if the list contains the element specified//
        //This returns false since Raven was deleted in the above methods//
        System.out.println(names.contains("Raven"));
        System.out.println();

        //indexOf = returns the index of the specified element//
        //This returns 1 since Khay is at index position 1//
        System.out.println(names.indexOf("Khay"));
        System.out.println();

        //clear method = removes all the elements in the list//
        names.clear();



    }
}
