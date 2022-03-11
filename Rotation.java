import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> skinPool = new ArrayList<String>();
        
        skinPool.add("Hack");
        skinPool.add("Undercity Classic");
        skinPool.add("Undercity Judge");
        skinPool.add("Undercity Bulldog");
        skinPool.add("Undercity Phantom");
        skinPool.add("Oni Claw");
        skinPool.add("Oni Phantom");
        skinPool.add("Oni Guardian");
        skinPool.add("Oni Shorty");
        skinPool.add("Oni Bucky");
        skinPool.add("Hu Else");
        skinPool.add("Tigris Shorty");        
        skinPool.add("Tigris Spectre");
        skinPool.add("Tigris Phantom");
        skinPool.add("Tigris Operator");
        skinPool.add("Personal Administrative Melee Unit");
        skinPool.add("Protocol 781-a Sheriff");
        skinPool.add("Protocol 781-a Spectre");
        skinPool.add("Protocol 781-a Bulldog");
        skinPool.add("Protocol 781-a Phantom");
        skinPool.add("Snowfall Wand");
        skinPool.add("Snowfall Classic");
        skinPool.add("Snowfall Judge");
        skinPool.add("Snowfall Phantom");
        skinPool.add("Snowfall Ares");
        skinPool.add("Magepunk Shock Quantlet");
        skinPool.add("Magepunk Sheriff");
        skinPool.add("Magepunk Guardian");
        skinPool.add("Magepunk Ares");
        skinPool.add("Magepunk Operator");
        skinPool.add("Radianite Crisis 001 Baseball Bat");
        skinPool.add("Radianite Crisis 001 Classic");
        skinPool.add("Radianite Crisis 001 Spectre");
        skinPool.add("Radianite Crisis 001 Bucky");
        skinPool.add("Radianite Crisis 001 Phantom");
        skinPool.add("Catrina");
        skinPool.add("Nunca Olvidados Frenzy");
        skinPool.add("Nunca Olvidados Bulldog");
        skinPool.add("Nunca Olvidados Vandal");
        skinPool.add("Nunca Olvidados Ares");
        skinPool.add("Rgx 11z Pro Blade");
        skinPool.add("Rgx 11z Pro Frenzy");
        skinPool.add("Rgx 11z Pro Stinger");
        skinPool.add("Rgx 11z Pro Vandal");
        skinPool.add("Rgx 11z Pro Guardian");
        skinPool.add("Yoru's Stylish Butterfly Comb");
        skinPool.add("Valorant Go! Vol. 2 Classic");
        skinPool.add("Valorant Go! Vol. 2 Vandal");
        skinPool.add("Valorant Go! Vol. 2 Ares");
        skinPool.add("Valorant Go! Vol. 2 Operator");
        skinPool.add("Waveform");
        skinPool.add("Spectrum Classic");
        skinPool.add("Spectrum Bulldog");
        skinPool.add("Spectrum Phantom");
        skinPool.add("Spectrum Guardian");
        skinPool.add("Broken Blade Of The Ruined King");
        skinPool.add("Ruination Ghost");
        skinPool.add("Ruination Spectre");
        skinPool.add("Ruination Phantom");
        skinPool.add("Ruination Guardian");
        skinPool.add("Recon Balisong");
        skinPool.add("Recon Ghost");
        skinPool.add("Recon Spectre");
        skinPool.add("Recon Phantom");
        skinPool.add("Recon Guardian");
        skinPool.add("Relic Of The Sentinel");
        skinPool.add("Sentinels Of Light Sheriff");
        skinPool.add("Sentinels Of Light Vandal");
        skinPool.add("Sentinels Of Light Ares");
        skinPool.add("Sentinels Of Light Operator");
        skinPool.add("Origin Crescent Blade");
        skinPool.add("Origin Frenzy");
        skinPool.add("Origin Bucky");
        skinPool.add("Origin Vandal");
        skinPool.add("Origin Operator");
        skinPool.add("Prosperity");
        skinPool.add("Tethered Realms Ghost");
        skinPool.add("Tethered Realms Guardian");
        skinPool.add("Tethered Realms Vandal");
        skinPool.add("Tethered Realms Operator");
        skinPool.add("Magepunk Electroblade");
        skinPool.add("Magepunk Ghost");
        skinPool.add("Magepunk Spectre");
        skinPool.add("Magepunk Bucky");
        skinPool.add("Magepunk Marshall");
        skinPool.add("Forsaken Ritual Blade");
        skinPool.add("Forsaken Classic");
        skinPool.add("Forsaken Spectre");
        skinPool.add("Forsaken Vandal");
        skinPool.add("Forsaken Operator");
        skinPool.add("Infantry Ghost");
        skinPool.add("Infantry Spectre");
        skinPool.add("Infantry Guardian");
        skinPool.add("Infantry Operator");
        skinPool.add("Infantry Ares");
        skinPool.add("Minima Sheriff");
        skinPool.add("Minima Spectre");
        skinPool.add("Minima Phantom");
        skinPool.add("Minima Ares");
        skinPool.add("Minima Operator");
        skinPool.add("Celestial Fan");
        skinPool.add("Celestial Frenzy");
        skinPool.add("Celestial Judge");
        skinPool.add("Celestial Phantom");
        skinPool.add("Celestial Ares");
        skinPool.add("Silvanus Sheriff");
        skinPool.add("Silvanus Stinger");
        skinPool.add("Silvanus Vandal");
        skinPool.add("Silvanus Phantom");
        skinPool.add("Silvanus Operator");
        skinPool.add("Glitchpop Axe");
        skinPool.add("Glitchpop Classic");
        skinPool.add("Glitchpop Phantom");
        skinPool.add("Glitchpop Vandal");
        skinPool.add("Glitchpop Operator");
        skinPool.add("Horizon Frenzy");
        skinPool.add("Horizon Spectre");
        skinPool.add("Horizon Bucky");
        skinPool.add("Horizon Bulldog");
        skinPool.add("Horizon Vandal");
        skinPool.add("Prism II Sheriff");
        skinPool.add("Prism II Shorty");
        skinPool.add("Prism II Stinger");
        skinPool.add("Prism II Bucky");
        skinPool.add("Prism II Vandal");
        skinPool.add("Winterwunderland Candy Cane");
        skinPool.add("Winterwunderland Ghost");
        skinPool.add("Winterwunderland Vandal");
        skinPool.add("Winterwunderland Phantom");
        skinPool.add("Winterwunderland Marshall");
        skinPool.add("Ion Energy Sword");
        skinPool.add("Ion Sheriff");
        skinPool.add("Ion Bucky");
        skinPool.add("Ion Phantom");
        skinPool.add("Ion Operator");
        skinPool.add("Sensation Frenzy");
        skinPool.add("Sensation Stinger");
        skinPool.add("Sensation Odin");
        skinPool.add("Sensation Judge");
        skinPool.add("Sensation Vandal");
        skinPool.add("Reaver Knife");
        skinPool.add("Reaver Sheriff");
        skinPool.add("Reaver Vandal");
        skinPool.add("Reaver Guardian");
        skinPool.add("Reaver Operator");
        skinPool.add("Singularity Knife");
        skinPool.add("Singularity Sheriff");
        skinPool.add("Singularity Spectre");
        skinPool.add("Singularity Phantom");
        skinPool.add("Singularity Ares");
        skinPool.add("Blastx Polymer Knifetech Coated Knife");
        skinPool.add("Blastx Frenzy");
        skinPool.add("Blastx Spectre");
        skinPool.add("Blastx Phantom");
        skinPool.add("Blastx Odin");
        skinPool.add("Spline Dagger");
        skinPool.add("Spline Classic");
        skinPool.add("Spline Spectre");
        skinPool.add("Spline Phantom");
        skinPool.add("Spline Operator");
        skinPool.add("Gravitational Uranium Neuroblaster Baton");
        skinPool.add("Gravitational Uranium Neuroblaster Classic");
        skinPool.add("Gravitational Uranium Neuroblaster Spectre");
        skinPool.add("Gravitational Uranium Neuroblaster Bucky");
        skinPool.add("Gravitational Uranium Neuroblaster Operator");
        skinPool.add("Wasteland Sheriff");
        skinPool.add("Wasteland Shorty");
        skinPool.add("Wasteland Spectre");
        skinPool.add("Wasteland Vandal");
        skinPool.add("Wasteland Marshall");
        skinPool.add("Nebula Knife");
        skinPool.add("Nebula Sheriff");
        skinPool.add("Nebula Guardian");
        skinPool.add("Nebula Phantom");
        skinPool.add("Nebula Ares");
        skinPool.add("Glitchpop Dagger");
        skinPool.add("Glitchpop Frenzy");
        skinPool.add("Glitchpop Judge");
        skinPool.add("Glitchpop Bulldog");
        skinPool.add("Glitchpop Odin");
        skinPool.add("Smite Knife");
        skinPool.add("Smite Classic");
        skinPool.add("Smite Judge");
        skinPool.add("Smite Odin");
        skinPool.add("Smite Phantom");
        skinPool.add("Ego Knife");
        skinPool.add("Ego Ghost");
        skinPool.add("Ego Stinger");
        skinPool.add("Ego Guardian");
        skinPool.add("Ego Vandal");
        skinPool.add("Sovereign Sword");
        skinPool.add("Sovereign Ghost");
        skinPool.add("Sovereign Stinger");
        skinPool.add("Sovereign Guardian");
        skinPool.add("Sovereign Marshall");
        skinPool.add("Sakura Classic");
        skinPool.add("Sakura Sheriff");
        skinPool.add("Sakura Stinger");
        skinPool.add("Sakura Vandal");
        skinPool.add("Sakura Ares");
        skinPool.add("Enderflame Dagger");
        skinPool.add("Enderflame Frenzy");
        skinPool.add("Enderflame Judge");
        skinPool.add("Enderflame Vandal");
        skinPool.add("Enderflame Operator");
        skinPool.add("Avalanche Classic");
        skinPool.add("Avalanche Spectre");
        skinPool.add("Avalanche Vandal");
        skinPool.add("Avalanche Phantom");
        skinPool.add("Avalanche Marshall");
        skinPool.add("Prime Axe");
        skinPool.add("Prime Classic");
        skinPool.add("Prime Spectre");
        skinPool.add("Prime Vandal");
        skinPool.add("Prime Guardian");
        skinPool.add("Rush Frenzy");
        skinPool.add("Rush Bulldog");
        skinPool.add("Rush Judge");
        skinPool.add("Rush Phantom");
        skinPool.add("Rush Ares");
        skinPool.add("Aristocrat Sheriff");
        skinPool.add("Aristocrat Stinger");
        skinPool.add("Aristocrat Bulldog");
        skinPool.add("Aristocrat Vandal");
        skinPool.add("Aristocrat Ares");
        skinPool.add("Luxe Knife");
        skinPool.add("Luxe Ghost");
        skinPool.add("Luxe Spectre");
        skinPool.add("Luxe Judge");
        skinPool.add("Luxe Vandal");
        skinPool.add("Luxe Operator");
        skinPool.add("Prism Knife");
        skinPool.add("Prism Ghost");
        skinPool.add("Prism Spectre");
        skinPool.add("Prism Phantom");
        skinPool.add("Prism Ares");
        skinPool.add("Prism Operator");
        skinPool.add("Galleria Classic");
        skinPool.add("Galleria Bucky");
        skinPool.add("Galleria Phantom");
        skinPool.add("Galleria Guardian");
        skinPool.add("Galleria Marshall");
        skinPool.add("Convex Sheriff");
        skinPool.add("Convex Spectre");
        skinPool.add("Convex Judge");
        skinPool.add("Convex Bulldog");
        skinPool.add("Convex Operator");
        skinPool.add("Valorant Go! Vol. 1 Knife");
        skinPool.add("Valorant Go! Vol. 1 Spectre");
        skinPool.add("Valorant Go! Vol. 1 Guardian");
        skinPool.add("Valorant Go! Vol. 1 Phantom");
        skinPool.add("Valorant Go! Vol. 1 Ghost");
        skinPool.add("Prime//2.0 Karambit");
        skinPool.add("Prime//2.0 Frenzy");
        skinPool.add("Prime//2.0 Bucky");
        skinPool.add("Prime//2.0 Phantom");
        skinPool.add("Prime//2.0 Odin");
         
         
         
         
         
        ArrayList<String> ownedSkins = new ArrayList<String>();
        
        System.out.println("What skins do you already own?  Type \"stop\" to stop.");
        
        String mySkin = "";
        
        while(!mySkin.equals("stop"))
        {
            mySkin = input.nextLine();
            if(mySkin.equals("stop"))
            {
                break;
            }
            ownedSkins.add(mySkin);
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
        
        String reload = "reload";
        
        while(reload.equals("reload"))
        {
            reload = input.nextLine();
            if(reload.equals("reload"))
            {
                System.out.println(rotation(skinPool));
            } else {
                break;
            }
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
