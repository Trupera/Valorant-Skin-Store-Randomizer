import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> skinPool = new ArrayList<String>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("Downloads/skins.dat"))) {
            for(int i = 0; i < 257; i++){
                skinPool.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> ownedSkins = new ArrayList<String>();
        
        System.out.println("What skins do you already own?  Type \"stop\" to stop.");
        
        String mySkin = "";
        
        while(!mySkin.equals("stop"))
        {
            mySkin = input.nextLine();
            for(String el : skinPool){
                if(el.equals(mySkin)){
                    ownedSkins.add(mySkin);
                    System.out.println("Skin added");
                }
            }
        }
        
        skinPool.removeAll(ownedSkins);
        
        System.out.println();
        
        if(skinPool.size() < 4)
        {
            System.out.println(".... You're quite rich aren't you?  Not much skins left to randomize");
        } else {
        
            System.out.println("Here's your rotation: ");
            
            System.out.println();
            
            System.out.println(rotation(skinPool));
            
            
            System.out.println();
            
            System.out.println("Type \"reload\" to refresh. Type anything else to end the program.");
            
            System.out.println();
            
            
            String reload = input.nextLine();
            while(reload.equals("reload"))
            {
                System.out.println(rotation(skinPool));
                reload = input.nextLine();
            } 
        }
    }

    
    public static String rotation(ArrayList<String> skins)
    {
        String rotation = "";
        Random rand = new Random();
        int one = rand.nextInt(skins.size());
        rotation += skins.get(one) + ", ";
        
        
        int two = rand.nextInt(skins.size());
        while(skins.get(one).equals(skins.get(two)))
        {
            two = rand.nextInt(skins.size());
        }
        rotation += skins.get(two) + ", ";
        
        int three = rand.nextInt(skins.size());
        while(skins.get(three).equals(skins.get(two)) 
        || skins.get(three).equals(skins.get(one)))
        {
            three = rand.nextInt(skins.size());
        }
        rotation += skins.get(three) + ", ";
        
        int four = rand.nextInt(skins.size());
        while(skins.get(four).equals(skins.get(three)) 
        || skins.get(four).equals(skins.get(two)) 
        || skins.get(four).equals(skins.get(one)))
        {
            four = rand.nextInt(skins.size());
        }
        rotation += skins.get(four) + ".";
        
        
        return rotation;
    }
    
}
