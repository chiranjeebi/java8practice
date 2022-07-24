package interfaceenhancement.javabasic;

public class PrintDuplicateElement {
    public static void main(String[] args) {
        int [] a={1,2,3,3,4,5};
        int duplicate;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    duplicate=a[i];
                    System.out.println(duplicate);
                }
            }

        }


    }
}
