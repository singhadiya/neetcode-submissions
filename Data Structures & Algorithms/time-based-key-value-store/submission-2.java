class TimeMap {
    private Map<String,String>timemap;
    public TimeMap() {
        timemap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
         timemap.put(key+","+timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        while(timestamp>0){
            if(timemap.containsKey(key+","+timestamp)){
                return timemap.get(key+","+timestamp);
            }
            timestamp--;
        }
        return "";
    }
}
