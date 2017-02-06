package ua.kiev.prog;

import sun.misc.resources.Messages;
import sun.misc.resources.Messages_es;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JsonMessages {
    private List<Message> list;

    public JsonMessages(List<Message> sourceList, int fromIndex, String to) {
        this.list = new ArrayList<>();
        for (int i = fromIndex; i < sourceList.size(); i++) {
           Message message = sourceList.get(i);

               if(message.getTo().equals(null) || message.getTo().equals(" ")){
                   list.add(message);

           }else{
               list.add(new Message(message.getTo(), message.getFrom()));
           }
        }
    }
}
