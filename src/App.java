public class App {
    public static void main(String[] args) throws Exception {
        //programar piedra papel tijera
        // mov jug 1= jug1
        //mov jug 2 = jug2

        //primero pedimos piedra, papel o tijera
        System.out.println("""
        Jugador 1 introduzca el número para:
        1: Piedra
        2: Papel
        3: Tijeras
        """);
        String jug1 = System.console().readLine();
        float jugada1 = 0;
        switch (jug1) {
            case "1":
                jugada1 = 1f;
                break;
            case "2":
                jugada1 = 2f;
                break;
            case "3":
                jugada1 = 3f;
                break;
            default: System.out.println("Por favor introduzca los datos según el menú numérico");
                break;}
        //ya tenemos lo que será la jugada del jugador 1 almacenado en la variable jug1
        //hacemos lo mismo para el jugador 2
        System.out.println("""
        Jugador 2 introduzca el número para:
        1: Piedra
        2: Papel
        3: Tijeras
        """);
        String jug2 = System.console().readLine();
        float jugada2 = 0;
        switch (jug2) {
            case "1":
                jugada2 = 1f;
                break;
            case "2":
                jugada2 =2f;
                break;
            case"3":
                jugada2 = 3f;
                break;
            default: System.out.println("Por favor introduzca los datos según el menú numérico");
                break; }
        //ya tenemos ambas jugadas, faltan todas las posibilidades (en la libreta están)     
        if (jugada1 == 2f && jugada2 == 1f){
            System.out.print("Jugador_1: Papel vs Jugador_2: Piedra\n");
            System.out.print("Ganador Jugador_1");
        }else if(jugada1 == 1f && jugada2 ==2f) {
            System.out.print("Jugador_1: Piedra vs Jugador_2: Papel\n");
            System.out.print("Ganador Jugador_2");
        }else if (jugada1 == 2f && jugada2 == 3f){
            System.out.print("Jugador_1: Papel vs Jugador_2: Tijeras\n");
            System.out.print("Ganador Jugador_2");
        }else if (jugada1 == 3f && jugada2 == 2f){
            System.out.print("Jugador_1: Tijeras vs Jugador_2: Papel\n");
            System.out.print("Ganador Jugador_1");
        }else if (jugada1 == 2f && jugada2== 2f){
            System.out.print("Jugador_1: Papel vs Jugador_2: Papel\n");
            System.out.print("Empate");            
        }else if (jugada1 == 1f && jugada2 == 3f){
            System.out.print("Jugador_1: Piedra vs Jugador_2: Tijeras\n");
            System.out.print("Ganador Jugador_2");
        }else if (jugada1 == 3f && jugada2 == 2f){
            System.out.print("Jugador_1: Tijeras vs Jugador_2: Piedra\n");
            System.out.print("Ganador Jugador_2");
        }else if (jugada1 == 1f &&  jugada2 == 1f) {
            System.out.print("Jugador_1: Piedra vs Jugador_2: Piedra\n");
            System.out.print("Empate");
        }else if (jugada1 == 3f && jugada2 == 3f){
            System.out.print("Jugador_1: Tijeras vs Jugador_2: Tijeras\n");
            System.out.print("Empate");
        }                                                                                                                                                                                                                                                                          
    }
}
