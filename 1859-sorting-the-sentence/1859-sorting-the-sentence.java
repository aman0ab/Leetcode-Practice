class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] tempArr = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            int j = arr[i].charAt(arr[i].length() - 1) - '0';
            tempArr[j - 1] = arr[i].substring(0,arr[i].length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for(String s1 : tempArr){
            sb.append(s1).append(" ");
        }
        return sb.toString().trim();
    }
}