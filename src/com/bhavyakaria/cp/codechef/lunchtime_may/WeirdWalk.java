package com.bhavyakaria.cp.codechef.lunchtime_may;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 30/05/20
 */
public class WeirdWalk {
    public static void main(String[] args) {
        try {
            Scan s = new Scan();
            Print p = new Print();

            int t = s.scanInt();

            while (t-- > 0) {
                int n = s.scanInt();
                int[] a = new int[n];
                int[] b = new int[n];

                long distA = 0;
                long distB = 0;

                for (int i = 0; i < n; i++) {
                    a[i] = s.scanInt();
                }

                for (int i = 0; i < n; i++) {
                    b[i] = s.scanInt();
                }

                long totalDist = 0;
                for (int i = 0; i < n; i++) {
                    if ((a[i] == b[i]) && distA == distB) {
                        totalDist += a[i];
                    }
                    distA += a[i];
                    distB += b[i];
                }
                p.printLine(String.valueOf(totalDist));
            }
            p.close();
        } catch (Exception e) {

        }
    }

    public void two() {
        try {
            Scanner s = new Scanner(System.in);

            int t = s.nextInt();

            while (t-- > 0) {
                int n = s.nextInt();

                int[] a = new int[n];
                int[] b = new int[n];

                int distA = 0;
                int distB = 0;

                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt();
                }

                for (int i = 0; i < n; i++) {
                    b[i] = s.nextInt();
                }
                int totalDist = 0;
                for (int i = 0; i < n; i++) {
                    if ((a[i] == b[i]) && distA == distB) {
                        totalDist += a[i];
                    }
                    distA += a[i];
                    distB += b[i];
                }
                System.out.println(totalDist);

            }
        } catch (Exception e) {

        }
    }
}

class Scan {
    private byte[] buf=new byte[1024];
    private int index;
    private InputStream in;
    private int total;
    public Scan()
    {
        in=System.in;
    }
    public int scan()throws IOException
    {
        if(total<0)
            throw new InputMismatchException();
        if(index>=total)
        {
            index=0;
            total=in.read(buf);
            if(total<=0)
                return -1;
        }
        return buf[index++];
    }
    public int scanInt()throws IOException
    {
        int integer=0;
        int n=scan();
        while(isWhiteSpace(n))
            n=scan();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n))
        {
            if(n>='0'&&n<='9')
            {
                integer*=10;
                integer+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        return neg*integer;
    }
    public double scanDouble()throws IOException
    {
        double doub=0;
        int n=scan();
        while(isWhiteSpace(n))
            n=scan();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n)&&n!='.')
        {
            if(n>='0'&&n<='9')
            {
                doub*=10;
                doub+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        if(n=='.')
        {
            n=scan();
            double temp=1;
            while(!isWhiteSpace(n))
            {
                if(n>='0'&&n<='9')
                {
                    temp/=10;
                    doub+=(n-'0')*temp;
                    n=scan();
                }
                else throw new InputMismatchException();
            }
        }
        return doub*neg;
    }
    public String scanString()throws IOException
    {
        StringBuilder sb=new StringBuilder();
        int n=scan();
        while(isWhiteSpace(n))
            n=scan();
        while(!isWhiteSpace(n))
        {
            sb.append((char)n);
            n=scan();
        }
        return sb.toString();
    }
    private boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
            return true;
        return false;
    }
}

class Print {
    private final BufferedWriter bw;
    public Print()
    {
        bw=new BufferedWriter(new OutputStreamWriter(System.out));
    }
    public void print(String str)throws IOException
    {
        bw.append(str);
    }
    public void printLine(String str)throws IOException
    {
        print(str);
        bw.append("\n");
    }
    public void close()throws IOException
    {
        bw.close();
    }
}