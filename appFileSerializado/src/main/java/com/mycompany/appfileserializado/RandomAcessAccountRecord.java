/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appfileserializado;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author luizh
 */
public class RandomAcessAccountRecord extends AccountRecord{
    //Integer => 4 bytes
    //String => 15 char = 30 bytes
    //Double => 8 bytes
    public static final int SIZE = 72;
    
    public RandomAcessAccountRecord(){
        super();
    }
    
    public RandomAcessAccountRecord(int account, String firstName, String lastName, double balance){
        super(account, firstName, lastName, balance);
    }
    
    public void read(RandomAccessFile file) throws IOException{
        setAccount(file.readInt());
        setFirstName(readName(file));
        setLastName(readName(file));
        setBalance(file.readDouble());
    }
    
    public String readName(RandomAccessFile file) throws IOException {
        char name[] = new char[15], temp;
        
        for (int count = 0; count < name.length; count++){
            temp = file.readChar();
            name[count] = temp;
        }
        
        return new String(name).replace('\0', ' ');
    }
    
    public void write(RandomAccessFile file) throws IOException {
        file.writeInt(getAccount());
        writeName(file, getFirstName());
        writeName(file, getLastName());
        file.writeDouble(getBalance());
    }
    
    public void writeName(RandomAccessFile file, String name) throws IOException{
        StringBuffer buffer = null;
        
        if (name != null)
            buffer = new StringBuffer(name);
        else
            buffer = new StringBuffer(15);
        
        buffer.setLength(15);
        file.writeChars(buffer.toString());
    }
}
