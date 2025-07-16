package lec17;
import java.util.List;
import java.util.ArrayList;
public class permutations {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
        int a[] = {1, 2, 3};
        permu(new ArrayList<>(), a, list);
        System.out.println(list); 
    }

    public static void permu(List<Integer> ans, int a[], List<List<Integer>> list) {
        if (ans.size() == a.length) {
            list.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (ans.contains(a[i]) == false) {
                ans.add(a[i]);
                permu(ans, a, list);
                ans.remove(ans.size()-1);
                }
           }
	}
}
