class Main {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        int n=a.length;

        int total = 1;
        for(int i=0;i<n;i++){
            total=total*a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print((total/a[i])+",");
        }

    }
}


//In each iteration the index of that iteartion will  not multiply and rest of them multiply