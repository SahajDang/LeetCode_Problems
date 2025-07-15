class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;  
        StringBuilder str = new StringBuilder(Integer.toBinaryString(n));
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0'){
                str.setCharAt(i, '1');
            }else{
                str.setCharAt(i, '0');
            }
        }
        int complement = Integer.parseInt(str.toString(), 2);
        return complement;
    }
}
