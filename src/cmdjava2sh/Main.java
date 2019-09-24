/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmdjava2sh;

import java.util.Locale;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        if (args.length == 0){
            System.err.println("Need arguments");
            System.exit(0);
        }
        System.out.println(parser(args));
    }
    
    public static String parser(String[] args){
        String resp = "ERROR";
        args[0] = args[0].toLowerCase();
        if (args[0].equals("--help") || args[0].equals("-h")){
            resp = "Program CMD MATH";
        }else if (args[0].equals("--author") || args[0].equals("-a")){
            resp = "Author: Jesimar da Silva Arantes";
        }else if (args[0].equals("--version") || args[0].equals("-v")){
            resp = "Version: 1.0";
        }else if (args[0].equals("--commands") || args[0].equals("-c")){
            resp =  "Functions:\n"
                    + "\tsin(x)\n"
                    + "\tcos(x)\n"
                    + "\ttan(x)\n"
                    + "\tasin(x)\n"
                    + "\tacos(x)\n"
                    + "\tatan(x)\n"
                    + "\tatan2(x)\n"
                    + "\tsqrt(x)\n"
                    + "\ttoRadians(x)\n"
                    + "\ttoDegrees(x)\n"
                    + "\tpow(x, y)\n"
                    + "\trandom\n"
                    + "\tlog(x)\n"
                    + "\tlog10(x)\n"
                    + "\tfat(n)\n"
                    + "\tfib(n)\n"
                    + "\tlistfib2n(n)\n"
                    + "\tlistfib2minmax(min, max)\n"
                    + "\tsum(min, max, step)\n"
                    + "\tprod(min, max, step)\n"
                    + "Constants:\n"
                    + "\tPI\n"
                    + "\tE\n"
                    + "\tPHI\n";
        }else if (args[0].equals("sin")){
            resp = Math.sin(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("cos")){
            resp = Math.cos(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("tan")){
            resp = Math.tan(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("asin")){
            resp = Math.asin(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("acos")){
            resp = Math.acos(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("atan")){
            resp = Math.atan(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("atan2")){
            resp = Math.atan2(Double.parseDouble(args[1]), Double.parseDouble(args[2])) + "";
        }else if (args[0].equals("sqrt")){
            resp = Math.sqrt(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("toradians")){
            resp = Math.toRadians(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("todegrees")){
            resp = Math.toDegrees(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("pow")){
            resp = Math.pow(Double.parseDouble(args[1]), Double.parseDouble(args[2])) + "";
        }else if (args[0].equals("random")){
            resp = Math.random() + "";
        }else if (args[0].equals("log")){
            resp = Math.log(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("log10")){
            resp = Math.log10(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("fat") || args[0].equals("fatorial")){
            resp = Functions.fat(Integer.parseInt(args[1]));
        }else if (args[0].equals("fib") || args[0].equals("fibonacci")){
            resp = Functions.fib(Integer.parseInt(args[1]));
        }else if (args[0].equals("listfib2n") || args[0].equals("listfibonacci2n")){
            resp = Functions.listNumbersFibonacci(Integer.parseInt(args[1]));
        }else if (args[0].equals("listfib2minmax") || args[0].equals("listfibonacci2minmax")){
            resp = Functions.listNumbersFibonacci(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        }else if (args[0].equals("sum") || args[0].equals("summation") || args[0].equals("somatorio")){
            resp = Functions.summation(Double.parseDouble(args[1]), Double.parseDouble(args[2]), 
                    Double.parseDouble(args[3])) + "";
        }else if (args[0].equals("prod") || args[0].equals("products") || args[0].equals("produtorio")){
            resp = Functions.products(Double.parseDouble(args[1]), Double.parseDouble(args[2]), 
                    Double.parseDouble(args[3])) + "";
        }else if (args[0].equals("pi")){
            if (args.length == 1){
                resp = Math.PI + "";
            }else if (args.length > 2 && args[1].equals("-c")){
                String format = "%."+args[2]+"f";
                resp = String.format(new Locale("en", "US"), format, Math.PI);
            }
        }else if (args[0].equals("e")){
            if (args.length == 1){
                resp = Math.E + "";
            }else if (args.length > 2 && args[1].equals("-c")){
                String format = "%."+args[2]+"f";
                resp = String.format(new Locale("en", "US"), format, Math.E);
            }
        }else if (args[0].equals("phi")){
            double phi = 1.618033988749895;
            if (args.length == 1){
                resp = phi + "";
            }else if (args.length > 2 && args[1].equals("-c")){
                String format = "%."+args[2]+"f";
                resp = String.format(new Locale("en", "US"), format, phi);
            }
        }
        return resp;
    }
    
}

