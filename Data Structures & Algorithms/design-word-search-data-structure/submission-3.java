// class TrieNode{
//     private HashMap<Character,TrieNode>child = new HashMap<>();
//     private boolean endOfWord = false;
// }

// class WordDictionary {
//     private TrieNode root;

//     public WordDictionary() {
//         root = new TrieNode();
//     }

//     public void addWord(String word) {
//         System.out.println("adding word :"+word+" , of length "+word.length());
//         TrieNode curr = root;
//         for(char c : word.toCharArray()){
//             if(curr.child.get(c)==null){
//                 curr.child.put(c,new TrieNode());
//             }
//             curr = curr.child.get(c);
//         }
//         curr.endOfWord = true;
//     }

//         public boolean search(String word) {
//         System.out.println("search word :"+word+" , of length "+word.length());
//         TrieNode curr = root;
//         for(int i=0; i<word.length();i++){
//             char c = word.charAt(i);
//             if(c == '.'){
//                 if(curr.child.size()==0){
//                     return false;
//                 }
//                 return dotHandler(curr.child,word.substring(i+1,word.length()));
//             }else{
//                 if(curr.child.get(c) == null){
//                      return false;
//                 }
//             }
//             curr = curr.child.get(c);
//         }
//         return curr.endOfWord;
//     }
//     public boolean dotHandler(HashMap<Character,TrieNode>child,String word){
//         if(word.length()==0){
//             return true;
//         }
//             for (Map.Entry<Character,TrieNode> set :
//             child.entrySet()) {
//                 TrieNode curr = set.getValue();
//                 for(int i=0; i<word.length();i++){
//                 char c = word.charAt(i);
//                 if(c == '.'){
//                    if(curr.child.size()==0){
//                     return false;
//                     }
//                     return dotHandler(curr.child,word.substring(i+1,word.length()));
//                 }else{
//                     if(curr.child.get(c) == null){
//                         return false;
//                        }
//                     }
//                     curr = curr.child.get(c);
//                 }
//                 if(curr.endOfWord == true){
//                     return true;
//                 }
//             }
//             return false;
//         }
//     }
public class WordDictionary {

    private List<String> store;

    public WordDictionary() {
        store = new ArrayList<>();
    }

    public void addWord(String word) {
        store.add(word);
    }

    public boolean search(String word) {
        for (String w : store) {
            if (w.length() != word.length()) continue;
            int i = 0;
            while (i < w.length()) {
                if (w.charAt(i) == word.charAt(i) || 
                    word.charAt(i) == '.') {
                    i++;
                } else {
                    break;
                }
            }
            if (i == w.length()) {
                return true;
            }
        }
        return false;
    }
}