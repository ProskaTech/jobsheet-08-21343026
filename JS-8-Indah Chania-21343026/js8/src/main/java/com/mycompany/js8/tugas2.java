package com.mycompany.js8;
import javax.swing.JOptionPane;

/**
 * created by indah chania 21343026
 * @author indah
 */
public class tugas2 {
    public static void main(String args[]) {
        int[] a = new int[3];
        String[] n = new String[11];
        int terbesar = 0;
        
        for(int i=1;i+1<=a.length;i++)
        {
            System.out.println(i); 
            n[i] = JOptionPane.showInputDialog("Masukkan angka ke-"+i+" :");
            a[i] = Integer.parseInt(n[i]);
            if(terbesar>a[i])
            {
                if(terbesar>a[i])
                {
                    terbesar=terbesar;
                    System.out.println(terbesar); 
                }
            }
            else
            {if(a[i]>a[i-1])
                {terbesar=a[i];}
                else
                {terbesar=a[i-1];
                }
                System.out.println(terbesar); 
            }
        }
        String hasil="Terbesar adalah "+terbesar;
        JOptionPane.showMessageDialog(null,hasil);  
    }
}

