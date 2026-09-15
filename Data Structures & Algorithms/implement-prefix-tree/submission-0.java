class TrieNode{
    private TrieNode [] child = new TrieNode[26];
    private boolean endOfWord = false;
}
class PrefixTree {
    private TrieNode root;

    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            if(curr.child[c-'a']==null){
                curr.child[c-'a'] = new TrieNode();
            }
            curr = curr.child[c-'a'];
        }
        curr.endOfWord = true;

    }

    public boolean search(String word) {
       TrieNode curr = root;
       for(char c : word.toCharArray()){
            if(curr.child[c-'a']==null){
                return false;
            }
            curr = curr.child[c-'a'];
       }
       return curr.endOfWord;
    }

    public boolean startsWith(String prefix) {
        
        TrieNode curr = root;
        for(char c : prefix.toCharArray()){
            if(curr.child[c-'a']==null){
                return false;
            }
            curr = curr.child[c-'a'];
        }
        return true;
    }
}
