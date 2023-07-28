class Solution1 {
    public String reverseWords(String s) {
        int i;
        String fin = s.trim();
        String temp ;
        String[] arr = null;
        arr = fin.split("\s+");
        int n = arr.length;
        int f;
        StringBuffer sb = new StringBuffer();

        for(i=0;i<n/2;i++){
            temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }

        for(i = 0; i < n; i++) {
         sb.append(arr[i]);
         if(i != n-1){
            sb.append(" ");
         }
        }

        String str = sb.toString();

        return str;
    }
}