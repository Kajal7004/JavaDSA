package Collection;
import java.util.*;
public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> list = new ArrayList<>();

        //add()
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("Printing List1:" +list1);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        System.out.println("Printing List2:" +list2);

        //.addAll
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        System.out.println("Added lists " +list);

        //.size()
        
        System.out.println("Size of list " +list.size());


        //.remove()
        list.remove(2);
        System.out.println("After remvoing items of list "+list);

        //removeAll
        list.removeAll(list2);
        System.out.println("After remvoing all items of list2 "+list);

        //clear
        // list.clear();
        // System.out.println("remove all the elements from the collection " +list1);

        // to traversing over list we'll using iterator
        Iterator<Integer> iterator =  list.iterator();
        while(iterator.hasNext()) {
            System.out.println("Elements: " +iterator.next());
        }

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(52);
        list3.add(53);
        list3.add(55);
        //.get();
        System.out.println(list3.get(0));

        list3.set(0,867);
        System.out.println(list3);

        Object[] arr = list3.toArray();
        for(Object val : arr ){
            System.out.println(val);
        }

        System.out.println(list3.contains(595));

        System.out.println("Current Elements in list: " +list);
        list.add(4);
        list.add(43);
        list.add(12);
        System.out.println("Before sorting: " +list);

        //sort an array
        Collections.sort(list);
        System.out.println("After sorting: " +list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("sorting Array on decending Order: " + list);
        

        //clone an array
        ArrayList<Integer> newList  = (ArrayList<Integer>) list.clone();
        System.out.println("New List: "+newList);

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.ensureCapacity(500);

        //isEmpty()
        System.out.println(newList.isEmpty());
        System.out.println(arrList.isEmpty());

        //indexOf()
        System.out.println(newList.indexOf(10));
        newList.add(10);
        newList.add(1);
        newList.add(10);
        newList.add(20);
        System.out.println(newList.lastIndexOf(10));

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(21);
        System.out.println(ll);

        //addFirst()
        ll.addFirst(10);
        System.out.println(ll);

        //addLast()
        ll.addLast(100);
        System.out.println(ll);

        //getFirst()
        System.out.println(ll.getFirst());
        //getLast()
        System.out.println(ll.getLast());
        ll.add(43);
        ll.add(21);

        //peek()
        System.out.println(ll.peek());

        //poll()
        System.out.println("Before: "+ll);
        System.out.println(ll.poll());
        System.out.println("After: "+ll);

        //offer()
        System.out.println("Offer: "+ll.offer(4));
        System.out.println(ll);


        //removeFirst()
        System.out.println(ll.removeFirst());
        //removeLast
        System.out.println(ll.removeLast());
        System.out.println(ll);


        //Stack-----------
        Stack<Integer> st = new Stack<>();
        //push()
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        System.out.println("Stack created: "+st);
        //pop()
        st.pop();
        System.out.println("Pop performed: "+st);
        //peek()
        System.out.println("Peek performed: "+st.peek());
        //search()
        System.out.println("Search performed: "+st.search(12));
        //empty
        System.out.println("Empty performed: "+st.empty());
    } 
}
