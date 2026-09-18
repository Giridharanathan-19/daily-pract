class Sumandmultiply{
    public  int practice(int nums){
        int count=0;
        int sum=0;
        int digit;
        int mul=1;
        int original=nums;
        int temp=original;
        int greater=9;
        int small=0;
        while(nums>0){
            nums=nums/10;
            count++;
        }
        if(count>3){
            while(temp>0){
                digit=temp%10;
                temp=temp/10;
                if(digit<greater&&digit>small){
                    greater=digit;
                }
                else{
                    small=digit;
                }
            }
        }
        if(greater%2!=0&&small%2==0){
            digit=original%10;
            original=original/10;
            sum+=digit;
            return sum;
        }
        else{
            digit=original%10;
            original=original/10;
            mul*=digit;
            return mul;
        }


    }
}