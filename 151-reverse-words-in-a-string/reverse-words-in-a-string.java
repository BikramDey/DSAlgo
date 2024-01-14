class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String a[]=s.split(" ");
        int i,n=a.length;
        String f="";
        
        for(i=n-1;i>=0;i--){
            if(a[i].length()==0)
                continue;
            f=f+a[i]+" ";
        }
        f=f.trim();
        return f;
    }
}