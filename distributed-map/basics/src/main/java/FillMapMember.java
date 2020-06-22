import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
//import com.hazelcast.core.IMap;
import com.hazelcast.core.Hazelcast;

import java.util.Map;

public class FillMapMember {

    public static void main(String[] args) {
//        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
// Start the Hazelcast Client and connect to an already running Hazelcast Cluster on 127.0.0.1
        HazelcastInstance hz = HazelcastClient.newHazelcastClient();
        Map<String, String> map = hz.getMap("map");
        map.put("1", "Tokyo");
        map.put("2", "Paris");
        map.put("3", "New York");
        System.out.println("Finished loading map");
    }
}
