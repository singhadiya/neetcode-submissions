class TimeMap {
    Map<String,List<Pair<Integer,String>>>map;

    public TimeMap() {
       map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key,k->new ArrayList<>()).add(new Pair<>(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        String ans = "";
        int start = 0;
        int end = map.computeIfAbsent(key,k->new ArrayList<>()).size()-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(map.get(key).get(mid).getKey()<=timestamp){
                ans = map.get(key).get(mid).getValue();
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
        
    }

    private static class Pair<K,V>{
        private K timestamp;
        private V value;

        Pair(K timestamp,V value){
            this.timestamp = timestamp;
            this.value = value;
        }

        public V getValue(){
            return this.value;
        }
        public K getKey(){
            return this.timestamp;
        }
    }
}
