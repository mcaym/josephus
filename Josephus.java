import java.util.ArrayList;
import java.util.LinkedList;

public class Josephus {

    public ArrayList<Integer> solve(int m, int n) {
        LinkedList<Integer> friends = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1; i<=n; i++)
            friends.add(i);

        int index = 0;
        while(friends.size() > 1){
            int i = 0;
            while(i <= m-1){
                if(index == friends.size())
                    index = 0;
                i++;
                index++;
            }
            int frnd;
            if(index == 0) {
                frnd = friends.size() - 1;
            }
            else
                frnd = index-1;
            friends.remove(frnd);
            result.add(frnd);
            index--;
        }
        result.add(friends.get(0));
        return result;
    }
}