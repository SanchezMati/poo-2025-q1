package guia7.ejercicio9;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;

public class HelpDesk {
    private final Map<ClientType, LinkedList<HelpTicket>> map = new EnumMap<>(ClientType.class);

    public HelpDesk openTicket(ClientType clientType, String clientName, String clientQuestion) {
        map.putIfAbsent(clientType, new LinkedList<>());
        map.get(clientType).add(new HelpTicket(clientName, clientQuestion));
        return this;
    }

    public HelpTicket getNextTicket(ClientType clientType) {
        return map.getOrDefault(clientType, new LinkedList<>()).remove();
    }

    public HelpTicket getNextTicket() {
        for (LinkedList<HelpTicket> value : map.values()) {
            if (!value.isEmpty()) {
                return value.poll();
            }
        }
        throw new NoSuchElementException();
    }

    public boolean hasTickets() {
        for (LinkedList<HelpTicket> linkedList : map.values()) {
            if(!linkedList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static class HelpTicket {
        private final String name, question;

        public HelpTicket(String name, String question) {
            this.name = name;
            this.question = question;
        }

        @Override
        public String toString() {
            return "HelpTicket for %s asking %s".formatted(name, question);
        }
    }
}
