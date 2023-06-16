package severo.prg;

public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES;

    public static void main(String[] args) {
        DiaSemana dia =DiaSemana.JUEVES;
        int k = 5;


        if (DiaSemana.LUNES == dia) {
            System.out.println("ves a clase");
        } else if (DiaSemana.MARTES == dia) {
            System.out.println("cocina pasta");
        } else {
            System.out.println("descansa");
        }

        switch (k +1) {
            case 0:
                System.out.println("ves a clase");
                break;
            case 1:
                System.out.println("cocina pasta");
                break;
            case 2:
                System.out.println("duerme");
                break;
            default:
                System.out.println("descansa");
        }

        /**
        int k2 = 3;
        switch (k2) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("default");
        }
        int k3 = 1;
        switch (k3) {
            case 1:
            case 2:
                System.out.println("one");
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("default");
        }
        int k4 = 1;
        switch (k4) {
            case 1:
            case 2:
                System.out.println("one");
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
                break;
        }
        int k9 = 1;
        switch (k9) {
            case 1:
            case 2:
                System.out.println("one");
                System.out.println("two");
                break;
                System.out.println("four");
        }
         **/



    }
}



