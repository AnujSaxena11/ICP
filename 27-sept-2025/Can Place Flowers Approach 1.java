class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean ans = false;
        int c = 0;
        int c1 = 0;
        for(int i : flowerbed){
            if(i == 0){
                c++;
            }
            else{
                c1++;
                if(c-2 > 0 && c1 != 1){
                    n -= (c-1)/2;
                }
                else if(c1 == 1){
                    if(c<2){
                        n-=(c-1)/2;
                    }
                    else{
                        n-= (c+1)/2;
                    }
                }
                c=0;
            }
        }
        if(c1 == 0){
            n -= (c+1)/2;
        }
        else{
            n-=c/2;
        }
        return n<=0;
    }
}