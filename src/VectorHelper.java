public class VectorHelper {
    /**
     * Algorithme de tri du vecteur par bulles
     * @param tab
     * @return
     */
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

    /**
     * Retourne la somme de deux vecteurs <br>
     *     Exemple : [1,2,3] et [4,5,6] donne [5,7,9]
     * @param tab1
     * @param tab2
     * @return
     * @throws DifferentLengthException
     */
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

    /**
     * Procedure d'inversement d'un vecteur
     * @param tab
     */
    public static void inverse(int tab[])//inverse les éléments d'un vecteur
    {
        int i=0,j=tab.length-1,inter;
        while (i!=j)
        {
            inter=tab[i];
            tab[i]=tab[j];
            tab[j]=inter;
            i++;
            j--;
        }
    }

    /**
     * Retourne le max et le min d'un vecteur
     * @param tab
     */
    public static void minmax(int tab[],int res[])//retourne le min et le max d'un vecteur
    {
        int i=1;
        res[0]=tab[0];
        res[1]=tab[0];
        while (i<tab.length)
        {
            if (tab[i]<res[0]) res[0] = tab[i];
            if (tab[i]>res[1]) res[1] = tab[i];
            i++;
        }
    }

    /**
     * Fonction retournant le double d'un entier
     * @param a
     * @return
     */
    public static int fonction(int a)
    {
        return 2*a;
    }

    /**
     * Applique la fonction a tous les elements <br>
     *     du vecteur
     * @param tab
     */
    public static void application(int tab[])//applique la fonction aux éléments du vecteur
    {
        int i=0;
        while (i<tab.length)
        {
            tab[i]=fonction(tab[i]);
            i++;
        }
    }
}
