public class Main{
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        // int[] tab1;
        // tab1= new int[6]; 
        // tab1[0]=10;
        // tab1[1]=567;
        // tab1[2]=7;
        // tab1[3]=23;
        // tab1[4]=78;
        // tab1[5]=4;
        // sort(tab1);
        // int[] tab2;
        // tab2= new int[args.length];
        // tab2=ToInt(args);
        // sort(tab2);
        int [] tab1 ={2,3,5,6,-2,2};
        int [] tab2 =new int [tab1.length];
        for (int i=0;i<tab1.length;i++) {
            tab2[i]=tab1[i];
        }
    }
    public static int min(int[] tab) {
        int min=tab[0];
        for (int i : tab) {
            if(i<min){
                min = i;
            }
        }
        return min;
    }
    public static void sort(int[] tab) {
        for(int i=0;i<tab.length-1;i++) {
            int max = i;
            for(int j=i+1;j<tab.length;j++) {
                if(tab[j]>tab[max]) {
                    max = j;
                }
            }
            int temp = tab[i];
            tab[i] = tab[max];
            tab[max] = temp;
        }
        for (int i : tab) {
            System.out.println(i);
        }
    }
    public static int[] ToInt(String[] tab) {
        int[] IntArr = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            IntArr[i] = Integer.parseInt(tab[i]);
        }
        return IntArr;
    }
}
