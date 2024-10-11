public class exe5 {
    public static void main(String[] args) {
        int i = 10, j = 5;
        if (i < 5 && j++ < 10)
            System.out.println("&&1 vrai");
        else
            System.out.println("&&1 faux");
        System.out.println("i = " + i + " j = " + j);
        if (i < 5 & j++ < 10)
            System.out.println("& vrai");
        else
            System.out.println("& faux");
        System.out.println("i = " + i + " j = " + j);
        if (i < 15 && j++ < 10)
            System.out.println("&&2 vrai");
        else
            System.out.println("&&2 faux");
        System.out.println("i = " + i + " j = " + j);
        if (i < 15 | j++ < 10)
            System.out.println("| vrai");
        else
            System.out.println("| faux");
        System.out.println("i = " + i + " j = " + j);
        if (i < 15 || j++ < 10)
            System.out.println("|| vrai");
        else
            System.out.println("|| faux");
        System.out.println("i = " + i + " j = " + j);
    }

    // question 2

    // quand on utilise & ou | l'operateur ++ ou -- se fonction dans tout les cas
    // (true or false)
    // et si on utilise && ou || l'operateur ++ ou -- se fonction seulment dans le
    // cas true
}
