class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : words) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<String>[] arr = new List[words.length + 1];
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (arr[entry.getValue()] == null) {
                arr[entry.getValue()] = new ArrayList<>();
            }
            arr[entry.getValue()].add(entry.getKey());
        }
        
        List<String> output = new ArrayList<>();
        for (int i = words.length; i >= 0 && k > 0; i--) {
            if (arr[i] == null) {
                continue;
            } else {
                Collections.sort(arr[i]);
                for (String j : arr[i]) {
                    output.add(j);
                    k--;
                    if (k == 0) {
                        break;
                    }
                }
            }
        }
        return output;
    }
}