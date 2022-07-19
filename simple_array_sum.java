Finding sum of integers present in the list in JAVA

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
    int sum = 0;
    for(int i = 0; i<ar.size() ; i++ )
    {
      sum = sum + ar.get(i);  
    }

    return sum;
    }

}
