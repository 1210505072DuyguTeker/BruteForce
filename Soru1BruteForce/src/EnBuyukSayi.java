
import java.util.Random;


public class EnBuyukSayi {
    
    public static void main(String[] args) {
        
        int[]dizi = new int[1000];
        Random r = new Random();
        
        for(int i=0;i<dizi.length;i++){
            dizi[i]=r.nextInt(1000);
        }
     
        System.out.println("Rastgele olusturulmus dizi: ");
         for(int i : dizi){
            System.out.println(i+ " ");
        }
        
        
        int enBuyukSayi=bruteForce(dizi);
        System.out.println("Dizideki en buyuk sayi: " + enBuyukSayi);
    }
    public static int bruteForce(int[]dizi){
        int max=dizi[0];
        for(int k=1;k<dizi.length;k++){
            if(dizi[k]>max){
                max=dizi[k];
            }
        }
        return max;
    }
    
    
    
    
    
}
