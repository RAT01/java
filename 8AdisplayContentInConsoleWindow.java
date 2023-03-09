import java.io.*;
 class showfile{
public static void main(String[] args) {
    int i;
    FileInputStream fin;
    if(args.length !=1){
        System.out.println("usage showfile name ");
        return;
    }
    try{
        fin=new FileInputStream(args[0]);
    }
    catch(FileNotFoundException e){
        System.out.println("Cannot not open file");
        return;
    }
    try{
        do{
            i=fin.read();
            if(i!=-1){
                System.out.println((char) i);
            }
        }while(i!= -1);
    }
        catch(IOException e){
            System.out.println("error reading file ");
        }
        try{
            fin.close();
        }
        catch(IOException e){
            System.out.println("error closing file ");
        }
    } }
