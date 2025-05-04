/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luizh_av2_q5;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author luizh
 */
public class StudensHandle extends RecordStudents {
    public final static int SIZE = 64;
    
    public StudensHandle (){
        super();
    }
    
    public StudensHandle(int matricula, String nome, String curso) {
        super (curso, matricula, nome);
    }
    
    public void read (RandomAccessFile file) throws IOException {
        setMatricula(file.readInt());
        setNome(readName(file));
        setCurso(readName(file));
    }
    
    public String readName (RandomAccessFile file) throws IOException{
        char name[] = new char[15], temp;
        
        for (int count = 0; count < name.length; count++){
            temp = file.readChar();
            name[count] = temp;
        }
        
        return new String(name).replace('\0', ' ');
    }
    
    public void write(RandomAccessFile file) throws IOException {
        file.writeInt(getMatricula());
        writeName(file, getNome());
        writeName(file, getCurso());
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
