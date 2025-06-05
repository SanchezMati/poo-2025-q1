package Parcial2.p2_23_02.ejercicio2;

public class ScoreBoardTester {
    public static void main(String[] args) {
        // Se instancia un sistema para almacenar registros de puntajes
        // donde los puntajes serán instancias de Double
        ScoreBoard<Double> doubleScoreBoard = new ScoreBoard<>();
        // Se consulta la cantidad de registros cargados
        System.out.println(doubleScoreBoard.size()); // 0
        // Se agrega al tablero un registro con puntaje 100.5 y jugador Jenny
        doubleScoreBoard.add(new PlayerScore<>("Jenny", 100.5));
        // Si ya existe un registro con el mismo puntaje para el mismo jugador no se agrega
        doubleScoreBoard.add(new PlayerScore<>("Jenny", 100.5));
        System.out.println(doubleScoreBoard.size()); // 1
        // Se agrega un segundo registro para el mismo jugador
        doubleScoreBoard.add(new PlayerScore<>("Jenny", 101.0));
        doubleScoreBoard.add(new PlayerScore<>("Brian", 101.0));


        // Se obtienen hasta 5 registros en orden descendente por el puntaje
        // y desempata alfabético por jugador. Como hay solo 3 registros se obtienen los 3
        for(PlayerScore<Double> ps : doubleScoreBoard.getTopScores(5)) {
            System.out.println(ps);
        }
        // Player Brian scored 101.0
        // Player Jenny scored 101.0
        // Player Jenny scored 100.5


        doubleScoreBoard.add(new PlayerScore<>("Ki", 98.0));


        // Se obtiene el registro con el puntaje más alto.
        // Si hay más de uno se obtiene el alfabéticamente menor
        System.out.println(doubleScoreBoard.first()); // Player Brian scored 101.0
        // Se obtiene el registro con el puntaje más bajo.
        // Si hay más de uno se obtiene el alfabéticamente mayor
        System.out.println(doubleScoreBoard.last()); // Player Ki scored 98.0


        for(PlayerScore<Double> ps : doubleScoreBoard.getTopScores(3)) {
            System.out.println(ps);
        }
        // Player Brian scored 101.0
        // Player Jenny scored 101.0
        // Player Jenny scored 100.5


        // Se consulta si existe un registro con puntaje 95.0 y jugador Ki
        System.out.println(doubleScoreBoard.contains(new PlayerScore<>("Ki", 95.0))); // false
        System.out.println(doubleScoreBoard.contains(new PlayerScore<>("Ki", 98.0))); // true


        for(PlayerScore<Double> ps : doubleScoreBoard.getTopScores(3)) {
            System.out.println(ps);
        }
        // Player Brian scored 101.0
        // Player Jenny scored 101.0
        // Player Jenny scored 100.5


        // Se instancia un sistema para almacenar registros de puntajes
        // donde los puntajes serán instancias de Integer
        ScoreBoard<Integer> integerScoreBoard = new ScoreBoard<>();
        System.out.println(integerScoreBoard.size()); // 0
        System.out.println(integerScoreBoard.contains(new PlayerScore<>("Ted", 200))); // false
        System.out.println(integerScoreBoard.getTopScores(3).isEmpty()); // true
    }
}
