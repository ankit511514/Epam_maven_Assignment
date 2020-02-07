package Epam;

import Epam.chocolate.DairyMilk;
import Epam.chocolate.Milkybar;
import Epam.chocolate.Munch;
import Epam.gift.Gift;
import Epam.sweets.Gulab_jamun;
import Epam.sweets.Jalebi;
import Epam.sweets.Ras_malai;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        DairyMilk dairyMilk=new DairyMilk();

        Milkybar milkybar =new Milkybar();

        Munch munch =new Munch();

        Ras_malai rasmalai =new Ras_malai();

        Gulab_jamun gulabjamun =new Gulab_jamun();

        Jalebi jalebi=new Jalebi();

        Gift gift=new Gift();

        gift.addSweets(rasmalai);

        gift.addSweets(gulabjamun);

        gift.addSweets(jalebi);

        gift.addChocolates(dairyMilk);

        gift.addChocolates(milkybar);

        gift.addChocolates(munch);

        gift.sort();

        gift.showChocolates();

        gift.showSweets();

        System.out.println(gift.totalPieces());

        sc.close();
    }
}
