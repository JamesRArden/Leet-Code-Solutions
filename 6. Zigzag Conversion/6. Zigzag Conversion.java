class Solution {
    public String convert(String s, int numRows) {
        

        if(numRows == 1){
            return s;
        }
        int  iterate = 2 * ( numRows - 1);
        int starter = 0;
        int len = s.length() - 1;
        StringBuilder ans = new StringBuilder();

         for(int b = 0; b <= len; b = b + iterate){
                ans.append((s.charAt(b)));
        }
       
   

        for(int i = (iterate - 2); i>0;i = i - 2){
            starter++;
            if(starter <= len){
                 ans.append((s.charAt(starter)));
            }
           
            int b = starter;
             while(b <= len){
                b = b + i;
                if(b <= len){
                     ans.append((s.charAt(b)));
                }
               
                b = b + (iterate - i);

                if(b <= len){
                     ans.append((s.charAt(b)));
                }
             }

        }


        starter++;

        for(int i = starter; i <= len; i = i + iterate){
                ans.append((s.charAt(i)));
        }

        return (ans.toString());
    }
}