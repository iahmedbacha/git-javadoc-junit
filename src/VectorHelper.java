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

    public static int[] somme (int[] tab1, int[] tab2) throws DifferentLengthException{
        if (tab1.length!=tab2.length) {
            throw new DifferentLengthException();
        }
        else {
            int[] tab = new int[tab1.length];
            for (int i=0; i<tab1.length; i++) {
                tab[i] = tab1[i] + tab2[i];
            }
            return tab;
        }
    }
}
