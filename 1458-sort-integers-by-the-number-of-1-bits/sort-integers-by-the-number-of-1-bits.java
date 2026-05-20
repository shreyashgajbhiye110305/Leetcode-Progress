class Solution {
    public int[] sortByBits(int[] arr) {
        int len = arr.length;
        int[] newarr = new int[len];

        HashMap<Integer, ArrayList<Integer>> count = new HashMap<>();

        for(int i = 0; i < len; i++) {
            newarr[i] = Integer.toBinaryString(arr[i]).replace("0", "").length();

            count.putIfAbsent(newarr[i], new ArrayList<>());
            count.get(newarr[i]).add(arr[i]);
        }

        for(ArrayList<Integer> list : count.values()) {
            Collections.sort(list);
        }

        Arrays.sort(newarr);

        for(int i = 0; i < len; i++) {
            arr[i] = count.get(newarr[i]).remove(0);
        }

        return arr;
    }
}