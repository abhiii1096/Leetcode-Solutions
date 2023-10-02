class Solution {
    public boolean winnerOfGame(String colors) {
    int a = 0;
    int b = 0;

    for (int i = 0; i < colors.length() - 2; i++) {
        if (colors.substring(i, i + 3).contains("AAA")) {
            a++;
        }
    }
    
 
    for (int i = 0; i < colors.length() - 2; i++) {
        if (colors.substring(i, i + 3).contains("BBB")) {
            b++;
        }
    }
    
    if(a>b)
    return true;
    else
    return false;
}


}