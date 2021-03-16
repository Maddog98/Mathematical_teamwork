/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematical_teamwork;

import java.util.Stack;

public class Mathematical_teamwork {

    private static String bementAdat;
    private static Stack<String> veremBol;
    private static String lengyelForma = "933*/";

    public static void main(String[] args) {
        veremBol = new Stack<>();
        bementAdat = "9/(3*3)";
        System.out.println(lengyelFormaSzamol(lengyelForma));
    }

    private static double lengyelFormaSzamol(String legyelformaBent) {
        veremBol.clear();
        while (!legyelformaBent.equals("")) {
            char elem = legyelformaBent.charAt(0);
            legyelformaBent = legyelformaBent.substring(1);
            if (!(elem == '+' || elem == '-' || elem == '*' || elem == '/')) {
                veremBol.add(elem + "");
            } else {
                int ertek1 = Integer.parseInt(veremBol.pop());
                int ertek2 = Integer.parseInt(veremBol.pop());
                int eredmeny = szamol(ertek2, elem, ertek1);
                veremBol.add(eredmeny + "");
            }
        }
        return Double.parseDouble(veremBol.pop());
    }

    private static int szamol(int ertek2, char elem, int ertek1) {
        double eredmeny = 0;
        if (elem == '+') {
            eredmeny = ertek2 + ertek1;
        } else if (elem == '-') {
            eredmeny = ertek2 - ertek1;
        } else if (elem == '*') {
            eredmeny = ertek2 * ertek1;
        } else if (elem == '/') {
            eredmeny = ertek2 / ertek1;
        }
        return (int) eredmeny;

    }

}
