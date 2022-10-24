public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int i = 1345638983;
        System.out.println("Значение переменной с типом int  равно  "   + i ) ;
        byte b = -5 ;
        System.out.println("Значение переменной с типом int  равно  " + b) ;
        short sh = 30550 ;
        System.out.println("Значение переменной с типом int  равно  " + sh) ;
        long l = 8923564128745298354L ;
        System.out.println("Значение переменной с типом int  равно  " + l) ;
        float f = 6.8f ;
        System.out.println("Значение переменной с типом int  равно  " + f) ;
        double d = 40560 ;
        System.out.println("Значение переменной с типом int  равно  " + d) ;

        System.out.println("Задача 2");

        float odin = 2.786f ;
        System.out.println(odin);
        long dva = 987678965549L ;
        System.out.println(dva);
        double tri = 27.12 ;
        System.out.println(tri) ;
        boolean chetyre = 7 > 15 ;
        System.out.println(chetyre) ;
        int pat  = 569 ;
        System.out.println(pat) ;
        short shest = -159 ;
        System.out.println(shest) ;
        int cem = 27897;
        System.out.println(cem) ;
        byte vocem =67;
        System.out.println(vocem) ;

        System.out.println("Задача 3") ;

        int klassLp = 23;
        System.out.println("У Людмилы Павловны " + klassLp + " ученика.") ;
        int klassAs = 27 ;
        System.out.println("У Анны Сергеевны " + klassAs + " учеников.") ;
         int klassEa = 30;
        System.out.println("У Екатерины Андреевны " + klassEa + " учеников.") ;
         int rezult  = (klassLp + klassAs + klassEa) ;
        System.out.println("Всего в 3 классах равно " + rezult + " учеников.") ;
         int buMaga = 480 ;
        System.out.println("Куплено " + buMaga + " листов бумаги.") ;
         int na1uchen = buMaga / rezult ;
        System.out.println("На каждого ученика расчитано " + na1uchen + " листов бумаги.");


        System.out.println("Задача 4") ;

        int butylKa = 16 ;
        double vrema = 2 ;
        double minuta = 60 ;
        double obshVrema = minuta * vrema ;
        double vrema1But = obshVrema / butylKa ;
        System.out.println("Дано:За 2 минуты,производится 16 бутылок.Сколько времени тратится на 1 бутылку?");
        System.out.println("На 1 бутылку приходится  " + vrema1But + " секунд." );
        double vrema1 = 20 ;
        double but1 = 7.5 ;
        double obshVrema1 = vrema1 * minuta;
        double kolvoBut20 = obshVrema1 / but1 ;
        System.out.println("За 20 минут изготовляется " + kolvoBut20 + " бутылок.") ;
        double sutki = 24 ;
        double chas = 60 ;
        double sutki1 = sutki * minuta * chas;
        double reZult = sutki1 /but1 ;
        System.out.println("За 24 часа изготовляется " + reZult + " бутылок.") ;
        double mesac = 30 ;
        double sutki2 = mesac * sutki1;
        double reZult1 = sutki2 /but1;
        System.out.println("За месяц изготовляется " + reZult1 + " бутылок.") ;

        System.out.println("Задача 5") ;

        short kraska = 120;
        short kraskaBel = 2 ;
        short kraskaKor = 4 ;
        int kraskaNaklass = kraskaBel + kraskaKor ;
        int kolvoKlassov = kraska / kraskaNaklass ;
        int kolvoBelkras = kolvoKlassov * kraskaBel ;
        int kolvoKorkras = kolvoKlassov * kraskaKor ;
        System.out.println("В школе, где " + kolvoKlassov + "  классов, нужно " + kolvoBelkras + " банок белой краски и " + kolvoKorkras + " банок коричневой краски.") ;

        System.out.println("Задача 6") ;

        int banan = 5 ;
        int vesBanan =80 ;
        int moloko =200 ;
        int moloko1 = 100 ;
        int vesMoloka = 105 ;
        int morojenoe = 2 ;
        int vesMoroz = 100 ;
        int yayco =4 ;
        int vesyayco =  70 ;
        int itogo = (banan* vesBanan) + ((moloko/moloko1)*vesMoloka) + (morojenoe * vesMoroz) + (yayco*vesyayco) ;
        System.out.println("Вес спортзавтрака составляет " + itogo  + " грамм .") ;
        double  kgSport = 1000 ;
        double vesVkg = itogo / kgSport ;
        System.out.println("Вес спортзавтрака составляет " + vesVkg + " килограмм." );

        System.out.println("Задача 7") ;

        double sbrosVesa = 7.0 ;
        double kg_v_gr = 1000.0 ;
        double den1 = 250.0 ;
        double den2 = 500.0 ;
        double kolvoDney = (sbrosVesa * kg_v_gr) / den1 ;
        System.out.println("Сброс веса составит " + kolvoDney + " дней.") ;
        double kolvoDney2 = (sbrosVesa * kg_v_gr) / den2 ;
        System.out.println("Сброс веса составит " + kolvoDney2 + " дней.");

        System.out.println("Задача 8") ;

       int masha = 67760 ;
       int dima = 83690 ;
       int krista = 76230 ;
       int masha1 =( masha/100) * 10  + masha;
       int dima1 =(dima/100) * 10 +dima ;
       int krista1 = ( krista/100) * 10 + krista ;
       int god = 12 ;
       int god1 =( masha +dima + krista) * god ;
       int god2 =( masha1 +dima1 + krista1) * god ;
               System.out.println("Годовой доход оставляет " + god1 + " рублей." );
        System.out.println("Годовой доход оставляет " + god2  + " рублей." );

        System.out.println("Маша теперь получает " + masha1 + " рублей .");
        System.out.println("Годовой доход вырос на "+ (god2 - god1) + " рублей.");

   }
}