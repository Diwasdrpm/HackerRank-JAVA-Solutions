class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here
    int al = 0;
    int bo = 0;
    List<Integer> answer = new ArrayList<>();
    for(int i = 0; i < 3; i++) {
        if (a.get(i) > b.get(i)) al++;
        if (a.get(i) < b.get(i)) bo++;
    }
    answer.add(0,al);
    answer.add(1,bo);
    return answer;
    }

}
