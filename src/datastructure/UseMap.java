package datastructure;

import java.sql.SQLOutput;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> stateOfUSA = new ArrayList<>() ;
		stateOfUSA.add("New York");
		stateOfUSA.add("Maryland");
		stateOfUSA.add("New Jersey");
		System.out.println("State of USA ->> "+ stateOfUSA);
		System.out.println(" ");

		List<String> stateOfUK = new ArrayList<>() ;
		stateOfUK.add("London");
		stateOfUK.add("Manchester");
		stateOfUK.add("New Hampshire");
		System.out.println("State of UK ->> "+ stateOfUK);
		System.out.println(" ");

		List<String> stateOfCA = new ArrayList<>() ;
		stateOfCA.add("Toronto");
		stateOfCA.add("Montreal");
		stateOfCA.add("Buffello");
		System.out.println("State of Canada ->> "+ stateOfCA);
		System.out.println(" ");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("USA", stateOfUSA);
		map.put("United Kingdom", stateOfUK);
		map.put("Canada", stateOfCA);

		for (Map.Entry entry: map.entrySet()){
			System.out.println(entry.getKey()+"->>"+ entry.getValue());
		}
		System.out.println(" ");
		System.out.println("Using Iterator below ");
 		Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()){
			Map.Entry<String, List<String>> entry = iterator.next();
			System.out.println(entry.getKey() +"-->"+entry.getValue());
		}
	}

}
