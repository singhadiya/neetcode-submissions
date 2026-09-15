class Twitter {
    private Map<Integer,List<Integer>>followers;
    private List<List<Integer>>newsFeed;


    public Twitter() {
        followers = new HashMap<>();
        newsFeed = new ArrayList<>();    
    }
    
    public void postTweet(int userId, int tweetId) {
        List<Integer>post = Arrays.asList(userId,tweetId);
        // System.out.println("post : "+ userId +" "+ tweetId);  
        newsFeed.add(0,post);
        System.out.println("newsFeed : "+newsFeed);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        // System.out.println("getNewsFeed of user : "+userId);
        int counter=0;
        int i = 0;
        List<Integer>ans = new ArrayList<>();
        int size = newsFeed.size();
        List<Integer>user = new ArrayList<>();
        while(counter < 10 && i < size){
            // System.out.println("counter : "+counter);
            // System.out.println("i : "+i);
            // System.out.println("size : "+size);
            user = newsFeed.get(i);
            // System.out.println("NewsFeed at index :"+i+" is "+user);
            if(user.get(0) == userId){
                ans.add(user.get(1));
                counter++;
            }else{
                // System.out.println("inside else");
                if(followers.get(userId)!= null){
                    // System.out.println("follower is not null");
                    List<Integer>temp = followers.get(userId);
                    int s = temp.size();
                    // System.out.println("size : "+s);
                    for(int j=0; j<s; j++){
                        // System.out.println("temp.get(i) "+temp.get(j));
                        // System.out.println("user.get(0) "+user.get(0));
                        if(temp.get(j)==user.get(0)){
                            // System.out.println("1ans : "+ans);
                            ans.add(user.get(1));
                            //  System.out.println("2ans : "+ans);
                            counter++;
                        }
                    }
            }   }
            i++;
            // System.out.println("2counter : "+counter);
            // System.out.println("2i : "+i);
            // System.out.println("2size : "+size);
            System.out.println("user : "+user);
            System.out.println("ans : "+ans);
        } 
        System.out.println("final ans : "+ans);
        return ans; 
    }
    
    public void follow(int followerId, int followeeId) {
        // System.out.println("1.followers : "+followers); 
        // System.out.println("follower : "+followerId+", followee : "+followeeId);
        if(followers.get(followerId) == null){
            List<Integer>follower = new LinkedList<>();
            follower.add(followeeId);
            followers.put(followerId,follower);
        }else{
            List<Integer>temp = followers.get(followerId);
            int size = temp.size();
            boolean status = true;
            for(int i=0;i<size;i++){
                  if(temp.get(i)==followeeId){
                    status = false;
                    break;
                  }
            }
            if(status){
            temp.add(followeeId);
            followers.put(followerId,temp);
            }
        } 
        System.out.println("2.followers : "+followers); 
    }
    
    public void unfollow(int followerId, int followeeId) {
        // System.out.println("1.unfollowers : "+ followers);
        System.out.println("unfollower : "+followerId+", followee : "+followeeId);
        if(followers.get(followerId) != null){
            List<Integer>temp = followers.get(followerId);
            
            int size = temp.size();
            for(int i=0;i<size;i++){
                if(temp.get(i)==followeeId){
                    temp.remove(i);
                }
            }
            if(temp.size()==0){
                followers.remove(followerId);
            }else{
                followers.put(followerId,temp);
            }
        }
        System.out.println("2.unfollowers : "+ followers);
    }
}
