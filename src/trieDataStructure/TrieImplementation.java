package trieDataStructure;

import javax.swing.plaf.nimbus.NimbusStyle;

class Node{
    Node[] children = new Node[26];
    boolean end = false;

    Node(){
        for(int i=0;i<26;i++){
            children[i] = null;
        }
        end  =false;
    }
}

public class TrieImplementation {
    public static void main(String[] args) {
//        String[] word = {"three", "a","there","their","thee"};
        String[] word = {"i", "like","samsung","mobile","ice"};
        for(String s:word){
            insertInTrie(s);
        }
        String key = "i";
        String key1 = "like";
        System.out.println(key+" :"+search(key));
        System.out.println(key1+" :"+search(key1));
        System.out.println(search("samsung"));
        String Word = "ilikesamsung";
        System.out.println(Word+" :"+wordBreak(Word));

    }

    private static boolean wordBreak(String word) {
        if(word.isEmpty()) return true;

        for(int i=1;i<=word.length();i++){
            if(search(word.substring(0,i))){
                if(wordBreak(word.substring(i))){
                    return true;
                }
            }
        }
        return false;
    }

    public static Node root = new Node();

    public static void insertInTrie(String s) {
        Node cur = root;
        for(int level = 0;level <s.length();level++){
            int idx = s.charAt(level)-'a';
            if(cur.children[idx]==null){
                cur.children[idx] = new Node();
            }
            cur = cur.children[idx];
        }
        cur.end = true;
    }
    public static boolean search(String key){
        Node cur = root;
        for(int level =0;level<key.length();level++){
            int idx = key.charAt(level)-'a';
            if(cur.children[idx]==null){
                return false;
            }
            cur = cur.children[idx];
        }
        return cur.end == true;
    }
}
