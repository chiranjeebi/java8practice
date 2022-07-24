package interfaceenhancement.ex.recursion;

public class findBiggestNo {

public static int getMax(int a[],int total){
    int temp;
    for (int i=0;i<total;i++){
        for(int j=i+1;j<total;j++){
            if(a[i]>a[j]){
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;

        }
    }
     }
    return a[total-1];
    }

    public static void main(String[] args) {
        int a[]={1,2,5,6,3,2};
        int b[]={44,108,99,77};
        System.out.println("Largest no: "+getMax(a,6));
        System.out.println("Largest no: "+getMax(b,4));
    }

}
