class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b) -> {
        if(a[0] == b[0]){
            return Integer.compare(a[1], b[1]);
        }
        else{
            return Integer.compare(b[0], a[0]);
        }
        });

        List<int[]> lst = new ArrayList<>();
        for(int[] arr : people){
            lst.add(arr[1], arr);
        }
        return lst.toArray(new int[people.length][]);
    }
}