/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_chatapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author shrey
 */
public class Clienthandler implements Runnable {
 public String name; 
    final DataInputStream dis; 
    final DataOutputStream dos; 
    Socket s; 
    boolean isloggedin;
    
    @Override
    public void run() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    System.out.println("here");
    
    }
    
    public Clienthandler(Socket s, DataInputStream dis, DataOutputStream dout,String usern)
    {
        this.dis=dis;
        this.dos = dout; 
        this.name = usern; 
        this.s = s; 
        this.isloggedin=true;
    }
    
}
