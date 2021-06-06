import java.util.*;

class Result {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */


    public static int luckBalance(int k, List<List<Integer>> contests) {
        // Write your code here
        int sum = 0;

        List<Integer> importantContests = new ArrayList<>();
        List<Integer> unimportantContests = new ArrayList<>();

        contests.forEach(contest ->{
            if(contest.get(1) == 1) {
                importantContests.add(contest.get(0));
            } else {
                unimportantContests.add(contest.get(0));
            }
        });

        Collections.sort(importantContests, Collections.reverseOrder());


        for (int i = 0; i < importantContests.size(); i++) {
            if(i < k) {
                sum += importantContests.get(i);
            } else {
                sum -= importantContests.get(i);
            }
        }
        for (int i = 0; i < unimportantContests.size(); i++) {
            sum += unimportantContests.get(i);
        }

        return sum;
    }
}


public class Playground {

    public static void main(String[] args) {
        System.out.print(Result.luckBalance(3,
                Arrays.asList(Arrays.asList(5, 1),
                        Arrays.asList(2, 1),
                        Arrays.asList(1, 1),
                        Arrays.asList(8, 1),
                        Arrays.asList(10, 0),
                        Arrays.asList(5, 0))));
    }
}