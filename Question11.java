    static boolean isAnagram(String a, String b) { 
    if(a.length()!=b.length()){
        return false;
    }
    String a1 = a.toLowerCase();
    String a2 = b.toLowerCase();

    char[] arr1 = a1.toCharArray();
    char[] arr2  = a2.toCharArray();
   java.util.Arrays.sort(arr1);
    java.util.Arrays.sort(arr2);
    for(int i=0;i<arr1.length;i++){
        if(arr1[i]!=arr2[i]){
            return false;
        }
    }
    return true;
}    
