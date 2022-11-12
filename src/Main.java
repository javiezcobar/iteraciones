public class Main {
    public static void main(String[] args) {
        int numeroif = 0;
        int numeroWhile = 0;

        if(numeroif == 0){
            System.out.println("el numero es 0");
        } else if (numeroif < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es Positivo");
        }

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
        } while (numeroWhile == 0);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        String Estacion = "Primavera";
        switch(Estacion){
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("Es invierno");
        }
    }
}