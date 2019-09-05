
package pac;

import java.util.Map;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MessageTest {
    
    Message message = new Message();
    Map<Integer, String> messageMap = message.getMessages();
    
    
    @Test
    public void testMessages(){
        assertEquals("Good clothes open many doors. Go shopping.", message.getMessageValue(1));
        assertEquals("The world may be your oyster, but that doesn't mean you'll get it's pearl.", message.getMessageValue(2));
        assertEquals("You will plant the smallest seed and it will become the greatest and most mighty tree in the world.", message.getMessageValue(3));
        assertEquals("Your fortune is as sweet as a cookie.", message.getMessageValue(4));
        assertEquals("Do what you want, when you want, and you will be rewarded.", message.getMessageValue(5));
        assertEquals("You are blessed, today is the day to bless others.", message.getMessageValue(6));
        assertEquals("It is not necessary to show others you have changed; the change will be obvious.", message.getMessageValue(7));
        assertEquals("Seize every second of your life and savor it.", message.getMessageValue(8));
        assertEquals("You will always get what you want through your charm and personality.", message.getMessageValue(9));
        assertEquals("Your ability for accomplishment will follow with success.", message.getMessageValue(10));
        assertEquals("You are the master of every situation.", message.getMessageValue(11));
        assertEquals("Everyone agrees. You are the best.", message.getMessageValue(12));
        assertEquals("Your future will be happy and productive.", message.getMessageValue(13));
        assertEquals("Take the chance while you still have the choice.", message.getMessageValue(14));
        assertEquals("Put your unhappiness aside. Life is beautiful, be happy.", message.getMessageValue(15));
        assertEquals("Affirm it, visualize it, believe it, and it`will actualize itself.", message.getMessageValue(16));
        assertEquals("Try? No! Do or do not, there is no try.", message.getMessageValue(17));
        assertEquals("Today is going to be a disasterous day, be prepared!", message.getMessageValue(18));
        assertEquals("Good news from afar may bring you a welcome visitor.", message.getMessageValue(19));
        assertEquals("Don't just spend time, invest it.", message.getMessageValue(20));
    }
    
    @Test
    public void testAmountOfMessages(){
        int amountInMap = messageMap.size();
        int expected = 20;
        assertEquals(amountInMap, expected, 0);
    }
    

}
