import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    private static ArrayList<Chapter> arr = new ArrayList();

    public static void main(String args[]) {

        arr.add(new Chapter("1","US History","None"));
        arr.add(new Chapter("2","Third Assignment","3"));
        arr.add(new Chapter("3","First Chapter","1"));
        arr.add(new Chapter("4","Second Assignment","1"));
        arr.add(new Chapter("5","First Assignment","6"));
        arr.add(new Chapter("6","Canadian History","None"));

         /*
        1 -> 3,4
        2 -> NULL
        3 -> 2
        4 -> NULL
        5 -> NULL
        6 -> 5

        1 Print
          3 Print
            2 Print
          4 Print
        6 Print
          5 Print
         */

        HashMap<String,ArrayList<Chapter>> hmap = new HashMap();

        for(Chapter c:arr) {
            ArrayList<Chapter> list;
            if(hmap.containsKey(c.getParentId())) {
                list = hmap.get(c.getParentId());
            } else {
                list = new ArrayList();
            }
            list.add(c);
            hmap.put(c.getParentId(),list);
        }

        ArrayList<Chapter> index = new ArrayList<>();
        index = hmap.get("None");

        int level = 0;

        for(Chapter c:index) {
            System.out.println(c.getName());
            level = 0;
            printDocument(hmap, c.getId(),level);
        }
    }

    private static void printDocument(HashMap<String, ArrayList<Chapter>> hmap, String n, int level) {
        System.out.print(" ");
        level = level+1;
        if(hmap.containsKey(n)) {
            ArrayList<Chapter> c = hmap.get(n);
            while(c.size()>0) {
                String id = c.get(0).getId();
                for(int i=0;i<level;i++) {
                    System.out.print("-");
                }
                System.out.println(c.get(0).getName());
                c.remove(0);
                printDocument(hmap, id, level);
            }
        }
    }
}
