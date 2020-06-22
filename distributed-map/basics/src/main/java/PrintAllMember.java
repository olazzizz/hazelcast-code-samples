import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.Hazelcast;

import java.util.Map;

public class PrintAllMember {

    public static void main(String[] args) {
        HazelcastInstance hz = HazelcastClient.newHazelcastClient();
        Map<String, String> map = hz.getMap("map");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
