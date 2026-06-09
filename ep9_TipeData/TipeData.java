package ep9_TipeData;

import java.util.HexFormat;

public class TipeData {
    public static void main(String[] args) {
        
        /* Tipe data di java:
        Boolean,char,byte,short,int,long,float,double */

        // Integer (Satuan)
        int A = 10;
        System.out.println("========= INTEGER =========");
        System.out.println("Nilai integer A adalah =" + A);
        System.out.println("Nilai Maximum tipe data integer adalah = " + Integer.MAX_VALUE);
        System.out.println("Nilai Minimum tipe data integer adalah = " + Integer.MIN_VALUE);
        System.out.println("Besar integer (dalam Bytes) = " + Integer.BYTES + " BYTES");
        System.out.println("Besar integer (Dalam Bit) " + Integer.SIZE + " Bit");
        System.out.println(); // untuk menambah enter

        //Bytes
        byte B = 20;
        System.out.println("========= BYTES =========");
        System.out.println("Nilai Bytes B adalah =" + B);
        System.out.println("Nilai Maximum tipe data BYTES adalah = " + Byte.MAX_VALUE);
        System.out.println("Nilai Minimum tipe data BYTES adalah = " + Byte.MIN_VALUE);
        System.out.println("Besar BYTES (dalam Bytes) = " + Byte.BYTES + " BYTES");
        System.out.println("Besar BYTES (Dalam Bit) " + Byte.SIZE + " Bit");
        System.out.println(); // untuk menambah enter

        //Short 
        short C = 30;
        System.out.println("========= SHORT =========");
        System.out.println("Nilai Short C adalah =" + C);
        System.out.println("Nilai Maximum tipe data SHORT adalah = " + Short.MAX_VALUE);
        System.out.println("Nilai Minimum tipe data SHORT adalah = " + Short.MIN_VALUE);
        System.out.println("Besar SHORT (dalam Bytes) = " + Short.BYTES + " BYTES");
        System.out.println("Besar SHORT (Dalam Bit) " + Short.SIZE + " Bit");
        System.out.println(); // menambah enter

        //LONG
        long D = 30;
        System.out.println("========= LONG =========");
        System.out.println("Nilai Long D adalah =" + D);
        System.out.println("Nilai Maximum tipe data LONG adalah = " + Long.MAX_VALUE);
        System.out.println("Nilai Minimum tipe data LONG adalah = " + Long.MIN_VALUE);
        System.out.println("Besar LONG (dalam Bytes) = " + Long.BYTES + " BYTES");
        System.out.println("Besar LONG (Dalam Bit) " + Long.SIZE + " Bit");
        System.out.println(); // menambah enter

        //Double
        Double E = 40.5d;
        System.out.println("========= DOUBLE =========");
        System.out.println("Nilai Double E adalah = " + E);
        System.out.println("Nilai Maximum tipe data DOUBLE adalah = " + Double.MAX_VALUE);
        System.out.println("Nilai Minimum tipe data DOUBLE adalah = " + Double.MIN_VALUE);
        System.out.println("Besar DOUBLE (dalam Bytes) = " + Double.BYTES + " BYTES");
        System.out.println("Besar DOUBLE (Dalam Bit) " + Double.SIZE + " Bit");
        System.out.println(); // menambah enter

        // FLOAT
        Float F = 40.5f;
        System.out.println("========= FLOAT =========");
        System.out.println("Nilai FLOAT E adalah = " + F);
        System.out.println("Nilai Maximum tipe data FLOAT adalah = " + Float.MAX_VALUE);
        System.out.println("Nilai Minimum tipe data FLOAT adalah = " + Float.MIN_VALUE);
        System.out.println("Besar FLOAT (dalam Bytes) = " + Float.BYTES + " BYTES");
        System.out.println("Besar FLOAT (Dalam Bit) " + Float.SIZE + " Bit");
        System.out.println(); // menambah enter

         // CHAR
        char G = 'G';
        System.out.println("========= CHAR =========");
        System.out.println("Nilai Char G adalah = " + (byte) G); // harus ditambah (byte) kalau mau menghasilkan bilangan decimal
        System.out.println("Nilai Maximum tipe data Character adalah = " + Character.MAX_VALUE);
        System.out.println("Nilai Minimum tipe data Character adalah = " + Character.MIN_VALUE);
        System.out.println("Besar Character (dalam Bytes) = " + Character.BYTES + " BYTES");
        System.out.println("Besar Character (Dalam Bit) " + Character.SIZE + " Bit");
        System.out.println(); // menambah enter

        // Boolean (Nilai true atau false)
        boolean val = true;
        System.out.println("========= BOOLEAN =========");
        System.out.println("Nilai Boolean val adalah = " + val);
        System.out.println("Nilai Maximum tipe data Booelean adalah = " + Boolean.TRUE);
        System.out.println("Nilai Minimum tipe data Boolean adalah = " + Boolean.FALSE);
        System.out.println(); // menambah enter



    }
}