package collectionsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> arryList = new ArrayList();
        //Adding elements in arrayList
        for (int i = 0; i < 10; i++) {
            arryList.add(i);
        }

        //Displaying elements
        System.out.println("Added elements in arrayList");
        for (int i = 0; i < arryList.size(); i++) {
            System.out.print(arryList.get(i) + " ");
        }

        //Deleting elements
        for (int i = 0; i < arryList.size(); i++) {
            if (i % 2 == 0) {
                arryList.remove(i);
            }
        }

        //Displaying remaining elements
        System.out.println("\nArrayList elements after delection");
        Iterator<Integer> iterator = arryList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        //Updating elements
        for (int i = 0; i < arryList.size(); i++) {
            arryList.set(i, arryList.get(i) * arryList.get(i));
        }

        System.out.println("\nArrayList elements after updation");
        //Displaying elements after updating
        for (int i : arryList) {
            System.out.print(i + " ");
        }

        List<Integer> linkedList = new LinkedList();
        //Adding elements in LinkedList
        for (int i = 10; i < 20; i++) {
            linkedList.add(i);
        }

        //Displaying elements
        System.out.println("\n\n\nAdded elements in linkedList");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }

        //Deleting elements
        for (int i = 0; i < linkedList.size(); i++) {
            if (i % 2 == 0) {
                linkedList.remove(i);
            }
        }

        //Displaying remaining elements
        System.out.println("\nLinkedList elements after delection");
        Iterator<Integer> iterator1 = linkedList.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

        //Updating elements
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.set(i, linkedList.get(i) * linkedList.get(i));
        }

        System.out.println("\nLinkedList elements after updation");
        //Displaying elements after updating
        for (int i : linkedList) {
            System.out.print(i + " ");
        }

        Queue<Integer> queueLinkedList = new LinkedList();
        //Adding elements in LinkedList of queue
        for (int i = 20; i < 30; i++) {
            queueLinkedList.add(i);
        }

        //Displaying elements
        System.out.println("\n\n\nAdded elements in linkedList of queue");
        queueLinkedList.forEach((i) -> {
            System.out.print(i + " ");
        });

        //Deleting elements
        Iterator<Integer> iteratorToDelete = queueLinkedList.iterator();
        int index = 0;
        while (iteratorToDelete.hasNext()) {
            iteratorToDelete.next();
            if (index % 2 == 0) {
                iteratorToDelete.remove();
            }
            index++;
        }

        System.out.println("\nQueue LinkedList elements after delection");
        Iterator<Integer> iterator2 = queueLinkedList.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        queueLinkedList.toArray();

        //Updating elements
        LinkedList<Integer> listFromQueue = (LinkedList<Integer>) queueLinkedList;
        for (int i = 0; i < listFromQueue.size(); i++) {
            listFromQueue.set(i, listFromQueue.get(i) * 2);
        }

        //Displaying elements after updating
        System.out.println("\nQueue LinkedList elements after updation");
        for (int i : queueLinkedList) {
            System.out.print(i + " ");
        }

        Set<Integer> hashSet = new HashSet();
        for (int i = 30; i < 40; i++) {
            hashSet.add(i);
        }

        //Displaying elements
        System.out.println("\n\n\nAdded elements in hashset");
        hashSet.forEach((i) -> {
            System.out.print(i + " ");
        });

        //Deleting elements
        Iterator<Integer> iteratorToDelete1 = hashSet.iterator();
        int index1 = 0;
        while (iteratorToDelete1.hasNext()) {
            iteratorToDelete1.next();
            if (index1 % 2 == 0) {
                iteratorToDelete1.remove();
            }
            index1++;
        }

        System.out.println("\nHashSet elements after delection");
        Iterator<Integer> iterator3 = hashSet.iterator();
        while (iterator3.hasNext()) {
            System.out.print(iterator3.next() + " ");
        }

        //Updating elements
        Iterator<Integer> iteratorToUpdate = hashSet.iterator();
        Set<Integer> updatedSet = new HashSet<>();
        while (iteratorToUpdate.hasNext()) {
            int element = iteratorToUpdate.next();
            iteratorToUpdate.remove();
            updatedSet.add(element * element);
        }
        hashSet.addAll(updatedSet);

        //Displaying elements after updating
        System.out.println("\nHashSet elements after updation");
        for (int i : hashSet) {
            System.out.print(i + " ");
        }

        SortedMap<Integer, String> treeMap = new TreeMap<>();
        for (int i = 1; i <= 10; i++) {
            treeMap.put(i, "Value" + i);
        }

        System.out.println("\n\n\nAdded elements in treeMap");
        treeMap.forEach((i, j) -> {
            System.out.print(j + " ");
        });

        for (int i = 1; i <= treeMap.size(); i++) {
            if (i % 2 == 0) {
                treeMap.remove(i);
            }
        }

        System.out.println("\nTreeMap elements after delection");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            entry.setValue(entry.getValue() + " U");
        }

        System.out.println("\nTreeMap elements after updation");
        Iterator<String> iterator4 = treeMap.values().iterator();
        while (iterator4.hasNext()) {
            System.out.print(iterator4.next() + " , ");
        }

        Map<Integer, String> hashMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            hashMap.put(i, "String" + i);
        }

        System.out.println("\n\n\nAdded elements in hashMap");
        hashMap.forEach((i, j) -> {
            System.out.print(j + " ");
        });

        for (int i = 0; i < hashMap.size(); i++) {
            if (i % 2 == 0) {
                hashMap.remove(i);
            }
        }

        System.out.println("\nHashMap elements after delection");
        Iterator<String> iterator5 = hashMap.values().iterator();
        while (iterator5.hasNext()) {
            System.out.print(iterator5.next() + " ");
        }

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            entry.setValue(entry.getValue() + " U");
        }

        System.out.println("\nHashMap elements after updation");
        for (Map.Entry<Integer, String> value : hashMap.entrySet()) {
            System.out.print(value.getValue() + " , ");
        }

        Map<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 1; i <= 10; i++) {
            hashtable.put(i, i);
        }

        System.out.println("\n\n\nAdded elements in hashTable");
        hashtable.forEach((i, j) -> {
            System.out.print(j + " ");
        });

        for (int i = 1; i <= hashtable.size(); i++) {
            if (i % 2 == 0) {
                hashtable.remove(i);
            }
        }

        System.out.println("\nHashTable elements after delection");
        Iterator<Integer> iterator6 = hashtable.values().iterator();
        while (iterator6.hasNext()) {
            System.out.print(iterator6.next() + " ");
        }

        for (Map.Entry<Integer, Integer> entry : hashtable.entrySet()) {
            entry.setValue(entry.getValue() * entry.getValue());
        }

        System.out.println("\nHashtable elements after updation");
        for (Map.Entry<Integer, Integer> value : hashtable.entrySet()) {
            System.out.print(value.getValue() + " , ");
        }

        SortedSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            treeSet.add(i);
        }

        System.out.println("\n\n\nAdded elements in treeSet");
        treeSet.forEach((i) -> {
            System.out.print(i + " ");
        });

        for (int i = 0; i < treeSet.size(); i++) {
            if (i % 2 == 0) {
                treeSet.remove(i);
            }
        }

        System.out.println("\nTreeSet elements after delection");
        Iterator<Integer> iterator7 = treeSet.iterator();
        while (iterator7.hasNext()) {
            System.out.print(iterator7.next() + " ");
        }

        Iterator<Integer> iteratorToUpdate1 = treeSet.iterator();
        Set<Integer> updatedSet1 = new HashSet<>();
        while (iteratorToUpdate1.hasNext()) {
            int element = iteratorToUpdate1.next();
            iteratorToUpdate1.remove();
            updatedSet1.add(element * element);
        }
        treeSet.addAll(updatedSet1);

        //Displaying elements after updating
        System.out.println("\nTreeSet elements after updation");
        for (int i : treeSet) {
            System.out.print(i + " ");
        }

        List<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.add(i);
        }

        System.out.println("\n\n\nAdded elements in stack");
        stack.forEach((i) -> {
            System.out.print(i + " ");
        });

        for (int i = 0; i < stack.size(); i++) {
            if (i % 2 == 0) {
                stack.remove(i);
            }
        }

        System.out.println("\nStack elements after delection");
        Iterator<Integer> iterator8 = stack.iterator();
        while (iterator8.hasNext()) {
            System.out.print(iterator8.next() + " ");
        }

        for (int i = 0; i < stack.size(); i++) {
            stack.set(i, stack.get(i) * stack.get(i));
        }

        System.out.println("\nStack elements after updation");
        for (int i : treeSet) {
            System.out.print(i + " ");
        }

        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }

        System.out.println("\n\n\nAdded elements in vector");
        vector.forEach((i) -> {
            System.out.print(i + " ");
        });

        for (int i = 0; i < vector.size(); i++) {
            if (i % 2 == 0) {
                vector.remove(i);
            }
        }

        System.out.println("\nVector elements after delection");
        Iterator<Integer> iterator9 = vector.iterator();
        while (iterator9.hasNext()) {
            System.out.print(iterator9.next() + " ");
        }

        for (int i = 0; i < vector.size(); i++) {
            vector.set(i, vector.get(i) * vector.get(i));
        }

        System.out.println("\nVector elements after updation");
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.add(i);
        }

        System.out.println("\n\n\nAdded elements in priorityQueue");
        priorityQueue.forEach((i) -> {
            System.out.print(i + " ");
        });

        for (int i = 0; i < priorityQueue.size(); i++) {
            if (i % 2 == 0) {
                priorityQueue.remove(i);
            }
        }

        System.out.println("\nPriorityqueue elements after delection");
        Iterator<Integer> iterator10 = priorityQueue.iterator();
        while (iterator10.hasNext()) {
            System.out.print(iterator10.next() + " ");
        }

        PriorityQueue<Integer> updatedQueue = new PriorityQueue<>();
        Iterator<Integer> iteratorToUpdate2 = priorityQueue.iterator();
        while (iteratorToUpdate2.hasNext()) {
            int value = iteratorToUpdate2.next();
            updatedQueue.add(value * 2);  
        }
        priorityQueue.clear();
        priorityQueue.addAll(updatedQueue);

        System.out.println("\nPriorityQueue elements after updation");
        for (int i : priorityQueue) {
            System.out.print(i + " ");
        }
    }

}
