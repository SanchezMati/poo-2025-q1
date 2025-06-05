package Parcial2.p2_23_02.ejercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class RouteCentral {
	private final Map<String, Map<String, Integer>> routes;
	private final Function<Integer, Integer> twoWayRouteMiles;
	
	public RouteCentral(Function<Integer, Integer> twoWayRouteMiles) {
		this.routes = new HashMap<>();
		this.twoWayRouteMiles = twoWayRouteMiles; 
	} 
	
	public void addOneWayRoute(String source, String destination, int miles) {
		routes.putIfAbsent(source, new HashMap<>());
		routes.get(source).putIfAbsent(destination, miles);
	}
	
	private void checkRoute(String source, String destination) {
		if(!routes.getOrDefault(source, new HashMap<>()).containsKey(destination)) {
			throw new IllegalArgumentException("Route does not exists");
		}
	}
	
	public int getDirectRouteMiles(String source, String destination) {
		checkRoute(source, destination);
		return routes.get(source).get(destination);
	}
	
	public void changeRouteCost(String source, String destination, int miles) {
		checkRoute(source, destination);
		routes.get(source).put(destination, miles);
	}
	
	public void addTwoWayRoute(String source, String destination, int miles) {
		addOneWayRoute(source, destination, twoWayRouteMiles.apply(miles));
		addOneWayRoute(destination, source, twoWayRouteMiles.apply(miles));
	}
	
	public int getOneStopRouteMiles(String source, String stop, String destination) {
		return getDirectRouteMiles(source, stop) + getDirectRouteMiles(stop, destination);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
