package controller;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.ibm.mq.jms.MQQueue;

public class TextMessageListener implements MessageListener {
    
    public void onMessage(Message message) {
        try {
            TextMessage msg = (TextMessage) message;
            String msgStr = msg.getText();
            System.out.println("Receive message:" + msgStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}