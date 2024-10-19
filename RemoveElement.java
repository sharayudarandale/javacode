public class RemoveElement{
    public static void main(String[]args){
       int[] num={3,2,2,3};
       int val=3;
       System.out.println(removeElement(num,val));
    }
    static int removeElement(int num[],int val){
        int count=0;
        for(int i=0;i<num.length;i++){
            if (num[i]!=val){
                num[count]=num[i];
                count ++;
            }
      }
      return count;
    }
}