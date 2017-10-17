public class VectorHelper {

    public static int[] tri (int[] tab) {
        int permut_cpt;
        int temp;
        boolean continu = true;
        while (continu) {
            permut_cpt = 0;
            for (int i=0; i<tab.length-1; i++) {
                if (tab[i]>tab[i+1]) {
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i+1] = temp;
                    permut_cpt++;
                }
            }
            if (permut_cpt == 0) {
                continu = false;
            }
        }
        return tab;
    }
}
