
package pac;

import java.util.HashMap;
import java.util.Map;


public class Message {
    
    private Map<Integer, String> messages = new HashMap<>();

    public Message() {
        messages.put(1, "Good clothes open many doors. Go shopping.");
        messages.put(2, "The world may be your oyster, but that doesn't mean you'll get it's pearl.");
        messages.put(3, "You will plant the smallest seed and it will become the greatest and most mighty tree in the world.");
        messages.put(4, "Your fortune is as sweet as a cookie.");
        messages.put(5, "Do what you want, when you want, and you will be rewarded.");
        messages.put(6, "You are blessed, today is the day to bless others.");
        messages.put(7, "It is not necessary to show others you have changed; the change will be obvious.");
        messages.put(8, "Seize every second of your life and savor it.");
        messages.put(9, "You will always get what you want through your charm and personality.");
        messages.put(10, "Your ability for accomplishment will follow with success.");
        messages.put(11, "You are the master of every situation.");
        messages.put(12, "Everyone agrees. You are the best.");
        messages.put(13, "Your future will be happy and productive.");
        messages.put(14, "Take the chance while you still have the choice.");
        messages.put(15, "Put your unhappiness aside. Life is beautiful, be happy.");
        messages.put(16, "Affirm it, visualize it, believe it, and it`will actualize itself.");
        messages.put(17, "Try? No! Do or do not, there is no try.");
        messages.put(18, "Today is going to be a disasterous day, be prepared!");
        messages.put(19, "Good news from afar may bring you a welcome visitor.");
        messages.put(20, "Don't just spend time, invest it.");
    }

    public String getMessageValue(int keyValue) {
        return messages.get(keyValue);
    }

    public Map<Integer, String> getMessages() {
        return messages;
    }

}
