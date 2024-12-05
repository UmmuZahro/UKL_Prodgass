import java.util.Scanner;
public class soalmudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jarakminimum = 10;
        int harga1 = 4250;
        int harga2 = 6000;
        int harga3 = 5000;
        int volumeminimal = 100;

        System.out.println("masukkan berat paket: ");
        int berat = input.nextInt();
        System.out.println("masukkan jarak tempuh: ");
        int JarakTempuh = input.nextInt();
        System.out.println("masukkan jarak tinggi: ");
        int t = input.nextInt();
        System.out.println("masukkan jarak lebar: ");
        int l = input.nextInt();
        System.out.println("masukkan jarak panjang: ");
        int p = input.nextInt();

        int resulvolume = p*l*t;//Hasil; 15000 jarak; 5 berat;10

        if (JarakTempuh <= jarakminimum) {
            int result1 = harga1*berat; // 4250*10 : 4250
            if (resulvolume > volumeminimal){
                int finalresult = result1 + harga3;
                System.out.println("biaya yg harus di bayar: "+ finalresult);
            }else{
                System.out.println("biaya yg harus di bayar: " + result1);
            }

        }else if (JarakTempuh > jarakminimum){
            int result2 = harga2*berat;
            if(resulvolume > volumeminimal){
                int finalresult= result2 + harga3;
                System.out.println("biaya yang harus dibayar: " + finalresult);
            }else{
                System.out.println("biaya yang harus dibayar: " + result2);
            }
 }
}

}


