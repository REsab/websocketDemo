package com.resab;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;


//ws://127.0.0.1:8056/websocket
@ServerEndpoint("/websocket")
public class WebSockket {

    @OnOpen
    public void onOpen(Session session) throws IOException {
        //        log.info("websocket  started ...");


        session.getBasicRemote().sendText("welcome");

    }

    @OnClose
    public void onClose() {
        System.out.println("websocket closed");

    }

    @OnMessage
    public void onMessage(String msg, Session session) throws IOException {


        System.out.println("get msg ");
        session.getBasicRemote().sendText("server get msg");

    }

}
