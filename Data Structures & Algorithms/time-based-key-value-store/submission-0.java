class TimeMap {
   private Map<String,Map<Integer,String>> m;

    public TimeMap() {
        System.out.println("TimeMap called");
        m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        System.out.println(key+" "+value+ " "+timestamp);
        if(m.get(key)!=null){
            m.get(key).put(timestamp,value);
        }else{
            Map<Integer,String> temp = new HashMap<>();
            temp.put(timestamp,value);
            m.put(key,temp);
        }
        
    }
    
    public String get(String key, int timestamp) {
         System.out.println(key+" "+timestamp);
         System.out.println( " Map : "+m);
        if(m.get(key)!=null){
            if(m.get(key).get(timestamp)==null){
                for(int i=timestamp-1; i>=1; i--){
                    if(m.get(key).get(i)!=null){
                        return m.get(key).get(i);
                    }
                }
            }else{
                return m.get(key).get(timestamp);
            }
        }
        return "";
        
    }
}
