public class trie {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node(); 

    //insert.//////////////////////
    public static void insert(String word){
        word=word.toLowerCase();
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(idx<0 || idx>25) continue; 
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }

    //search./////////////////////////
    public static boolean search(String key){
        key=key.toLowerCase();
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(idx<0 || idx>25) return false;
            if(curr.children[idx]==null){
                return false;
            }
            if(i==key.length()-1 && curr.children[idx].eow==false){
                return false;
            }
            curr=curr.children[idx];
       }
       return  true;
    }
    //word break problem.//////////////////////
    public static boolean wordBreak(String key){
        if(key.length()==0){ // base case.
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String firstPart=key.substring(0,i);
            String secondPart=key.substring(i);
            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }

        return false;
    }
    public static boolean startWith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    } 
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNode(root.children[i]);
            }
        }
        return count+1;
    }
    public static String ans="";
    public static void longestword(Node root,StringBuilder temp){
        if(root==null){
            return ;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }
                longestword(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);

            } 
        }
    }
    public static void main(String[] args){
        String words[]={"a","banana","app","appl","ap","apply","apple"};
       // System.out.println("Welcome to new data structure Hello Trie");
    //    String words[]={"i","like","sam","samsung","mobile","ice"};
    //    String key="ilikesamsung";
    //    for(int i=0;i<words.length;i++){
    //     insert(words[i]);
    //    }
    //    System.out.println(wordBreak(key));

//     String words[]={"apple","app","mango","man","woman"};
//    // String prefix="moon";
//     String prefix="app";

//     for(int i=0;i<words.length;i++){
//         insert(words[i]);
//     }
//     System.out.println(startWith(prefix));
    //    String str="ababa";
    //    for(int i=0;i<str.length();i++){
    //     String suffix=str.substring(i);
    //    insert(suffix);
    //    }

    //    System.out.println(countNode(root));
    for(int i=0;i<words.length;i++){
      insert(words[i]);  
    }
    longestword(root,new StringBuilder(""));
       System.out.println(ans);
    }
}