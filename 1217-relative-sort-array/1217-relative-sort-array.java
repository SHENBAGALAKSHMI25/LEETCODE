class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int u : arr1) {
            if (map.containsKey(u)) {
                map.put(u, map.get(u) + 1);
            } else {
                map.put(u, 1);
            }
        }
        
        for (int i : arr2) {
            if (map.containsKey(i)) {
                int u = map.get(i);
                for (int j = 0; j < u; j++) {
                    arr.add(i);
                }
                map.remove(i);
            } else {
                arr.add(i);
            }
        }

        // ✅ minimal addition: add remaining elements (sorted)
        ArrayList<Integer> rem = new ArrayList<>(map.keySet());
        Collections.sort(rem);
        for (int x : rem) {
            int cnt = map.get(x);
            for (int j = 0; j < cnt; j++) {
                arr.add(x);
            }
        }

        int a = 0;
        for (int i = 0; i < arr.size(); i++) {
            arr1[a++] = arr.get(i);
        }
        return arr1;
    }
}
