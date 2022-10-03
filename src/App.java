

public class App {


    public static int[] buborek(int[] tomb){
        int[] uj_szamok = tomb.clone();
        for (int i = tomb.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(uj_szamok[j] > uj_szamok[j+1]){

                    int swap = uj_szamok[j];
                    uj_szamok[j] = uj_szamok[j+1];
                    uj_szamok[j+1] = swap;
                }
            }
        }
        return uj_szamok;
    }
    public static void kiirSzamok(int[] tomb){
        for (int i : tomb) {
            System.out.print(i + " " );
            
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Buborék rendezés");
        int [] tomb = {39,25,12,48,27,38};
        int [] uj_tomb = buborek(tomb);
        kiirSzamok(uj_tomb);
        
        // int db = 6;

        // for(int i = db-2; i>0 ; i--)
        //     for(int x = 0 ; x<=i ; x++)

        //         if(tomb[x] > tomb[x+1]){

        //                 int tmp = tomb[x];
        //                 tomb[x] = tomb[x+1];
        //                 tomb[x+1] = tmp;
        //         }

        //         for(int i=0; i<db; i++)

        //             System.out.print(tomb[i] + " ");
        //         System.out.println();           
    }
}

