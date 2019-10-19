/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package PaintEstimator;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Jason
 */
public class PaintEstimator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int wallHeight = 0;
        int wallWidth = 0;
        double wallArea = 0;
        double amtOfPaintGallons;
        final int gallonSA = 350;
        double cansNeeded;
        
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextInt();
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextInt();
        
        wallArea = wallHeight * wallWidth;        
        System.out.println("Wall area: " + (double)wallArea + " square feet");
        
        amtOfPaintGallons = wallArea / gallonSA;
        System.out.println("Paint needed: " + amtOfPaintGallons + " gallons");
        
        cansNeeded = Math.ceil(amtOfPaintGallons);
        System.out.println("Cans needed: " + (int)cansNeeded + " can(s)");
        
        return;
    }
    
}
