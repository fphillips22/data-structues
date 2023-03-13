import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;
public class TimeAnalysis {
    TimeAnalysis(){

    }

    public long insertHash(int seed){
        long startTime = System.nanoTime();
        Random random = new Random(seed);
        random.setSeed(seed);
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection") HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < seed; i++){
            hashSet.add(random.nextInt());
        }
        long end = System.nanoTime();
        return end - startTime;
    }

    public long insetTree(int seed){
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection") TreeSet<Integer> treeSet = new TreeSet<Integer>();
        long startTime = System.nanoTime();
        Random random = new Random(seed);
        random.setSeed(seed);
        for (int i = 0; i < seed; i++) {
            treeSet.add(random.nextInt());
        }
        long end = System.nanoTime();
        return end - startTime;
    }

    public long searchHash(int seed, HashSet<Integer>hashSet){
        long start = System.nanoTime();
        Random random = new Random(seed);
        random.setSeed(seed);
        for (int i = 0; i < seed; i++){
            if (hashSet.contains(random.nextInt())){
                break;
            }
        }
        long end = System.nanoTime();
        return end - start;

    }

    public long searchTree(int seed, TreeSet<Integer>integerTreeSet){
        long start = System.nanoTime();
        Random random = new Random(seed);
        random.setSeed(seed);
        for (int j = 0; j < seed; j++){
            if (integerTreeSet.contains(random.nextInt())){
                break;
            }
        }
        long end = System.nanoTime();
        return end - start;
    }
}
